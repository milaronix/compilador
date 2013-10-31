package compiler.irt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import compiler.scanner.*;
import compiler.parser.*;
import compiler.semantic.*;

import java.util.List;
import java.util.*;
import java.util.ArrayList;

public class Irt {

	private LinkedList<variablesMetodosIRT> listaPlana = new LinkedList<variablesMetodosIRT>();
	private LinkedList<variablesMetodosIRT> listaMetodos = new LinkedList<variablesMetodosIRT>();
	
	public String arch;
	public Semantic semantic;

	public boolean enMetodo = false;

	public Irt(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		semantic = new Semantic(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		
		if(semantic.getErrores()>0){
			System.out.println("Existen errores previos a esta fase <IRT>, corrijalos para poder continuar");
		}else{
			arch=archivoEntrada;
		}

		try{
			start();
		}catch(IOException e) {
			e.printStackTrace();
		}

		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Irt\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void cargarStack (String cargar, String registro){
		String mensaje;
		String posicion;
		posicion = operacion("+","$sp");
		cargarReg("cargar","$sp("+posicion+")"); 
		mensaje = "Guardar offset: " + posicion + " en la tabla, se cargó: " + cargar;
		System.out.println(mensaje);
	}

	
	public void cargarReg (String cargar, String registro){
		String mensaje;
		mensaje = "Sumar word al Stack\nGuardar offset a la tabla\nLoad de "+cargar+"en "+registro;
		System.out.println(mensaje);
	}

	public void leerReg (String leer, String registro){
		String mensaje;
		mensaje = "Buscar el offset de "+ leer +"\nCargar el offset en $t0";
		operacion("+","$sp");
		System.out.println(mensaje);
	}

	public boolean branch (String operancion, String a, String b, String etiqueta){
		String branch, reg1, reg2;
		cargarReg(a, "$t0");
		cargarReg(b, "$t1");
		if (operacion.equals(">")){
			branch = "bgt " + reg1 + reg2 + etiqueta;
		}
		if (operacion.equals("<")){
			branch = "blt " + reg1 + reg2 + etiqueta;
		}
		if (operacion.equals("=")){
			branch = "beq " + reg1 + reg2 + etiqueta;
		}
		System.out.println(branch);
	}	
	
	public void start() throws IOException{
		
		System.out.println("******************  IRT  **********************");

		cambioArbolLista(semantic.ast.getAstTree());

		for(int i = 0; i< listaPlana.size()-1; i++){
			variablesMetodosIRT coso, coso2;
			coso = (variablesMetodosIRT) listaPlana.get(i);
			coso2 = (variablesMetodosIRT) listaPlana.get(i+1);
			coso.setSigTrue(coso2);
		}

		System.out.println("");

		for(int i = 0; i< listaPlana.size(); i++){
			variablesMetodosIRT coso;
			coso = (variablesMetodosIRT) listaPlana.get(i);
			if(coso.getClase().equals("method") && !(coso.getTipo().equals("Fin method"))){
				listaMetodos.add(coso);
			}
			if(coso.getClase().equals("method") && coso.getTipo().equals("Fin method")){
				coso.setSigTrue(null);
			}
		}

		for(int i = 0; i< listaMetodos.size(); i++){
			variablesMetodosIRT coso;
			coso = (variablesMetodosIRT) listaMetodos.get(i);
			System.out.println("metodo: "+coso.getNombre());
		}

		//Lista final
		System.out.println(listaPlana.size());
		for(int i = 0; i< listaPlana.size(); i++){
			variablesMetodosIRT coso, siguiente;
			coso = (variablesMetodosIRT) listaPlana.get(i);
			siguiente = coso.getSigTrue();
			if(coso.getClase().equals("method_call")){//System.out.println("Entro a method call "+i);
				for(int j = 0; j< listaMetodos.size(); j++){
					variablesMetodosIRT cosoM;
					cosoM = (variablesMetodosIRT) listaMetodos.get(j);
					if(cosoM.getNombre().equals(coso.getNombre())){
						boolean primero = false;
						variablesMetodosIRT actual;
						actual = cosoM;
						while(!(actual.getSigTrue()==null)){
							variablesMetodosIRT vm = new variablesMetodosIRT();
							vm.setNombre(actual.getNombre());
							vm.setTipo(actual.getTipo()); 
							vm.setClase(actual.getClase());
							vm.setInfo(actual.getInfo());
							vm.setSigTrue(null);
							vm.setSigFalse(null);
							listaPlana.add(vm);
							if(primero == false){
								coso.setSigTrue(vm);
								primero = true;
							}
							actual = actual.getSigTrue();
						}
						variablesMetodosIRT vm = new variablesMetodosIRT();
						vm.setNombre(cosoM.getNombre());
						vm.setTipo(cosoM.getTipo()); 
						vm.setClase(cosoM.getClase());
						vm.setInfo(cosoM.getInfo());
						vm.setSigTrue(siguiente);
						vm.setSigFalse(null);
						listaPlana.add(vm);
						
					}
				}
			}
		}
	
		variablesMetodosIRT actual = listaPlana.get(0);
			while(!(actual.getSigTrue()==null)){
				System.out.println("Nombre: "+actual.getNombre()+" Tipo: "+actual.getTipo()+" Clase: "+actual.getClase()+" Info: "+actual.getInfo());						
				actual = actual.getSigTrue();
			}
		
	}

	public void cambioArbolLista(ParseTree t){
		for ( int i = 0; i < t.getChildCount(); i++ ){
			if(t.getChild(i).toString().length()>3){
				if(t.getChild(i).toString().substring(1,3).equals("41") || t.getChild(i).toString().substring(1,3).equals("80")){ //var_decl
					variablesMetodosIRT vm = new variablesMetodosIRT();
					vm.setNombre(t.getChild(i).getChild(1).toString());
					vm.setTipo(t.getChild(i).getChild(0).toString()); 
					vm.setClase("var");
					vm.setInfo(null);
					vm.setSigTrue(null);
					vm.setSigFalse(null);
					listaPlana.add(vm);
					//System.out.println("Nombre: "+vm.getNombre()+" Tipo: "+vm.getTipo()+" Clase: "+vm.getClase());
							
				}else
				if(t.getChild(i).toString().substring(1,3).equals("48")){ //method_decl
					enMetodo = true;

					variablesMetodosIRT vm = new variablesMetodosIRT();
					vm.setNombre(t.getChild(i).getChild(1).toString());
					vm.setTipo(t.getChild(i).getChild(0).toString()); 
					vm.setClase("method");
					vm.setInfo(null);
					vm.setSigTrue(null);
					vm.setSigFalse(null);
					listaPlana.add(vm);
					//System.out.println("Nombre: "+vm.getNombre()+" Tipo: "+vm.getTipo()+" Clase: "+vm.getClase());
					
					cambioArbolLista((ParseTree)t.getChild(i));

					variablesMetodosIRT vmFin = new variablesMetodosIRT();
					vmFin.setNombre(vm.getNombre());
					vmFin.setTipo("Fin method"); 
					vmFin.setClase("method");
					vmFin.setInfo(null);
					vmFin.setSigTrue(null);
					vmFin.setSigFalse(null);
					listaPlana.add(vmFin);
					//System.out.println("Nombre: "+vmFin.getNombre()+" Tipo: "+vmFin.getTipo()+" Clase: "+vmFin.getClase());

					enMetodo = false;
				}else
				if(t.getChild(i).toString().substring(1,3).equals("88")){ //assign
					variablesMetodosIRT vm = new variablesMetodosIRT();
					vm.setNombre(null);
					vm.setTipo(null); 
					vm.setClase("assign");
					if(t.getChild(i).getText().indexOf(",") != -1){
						vm.setInfo(t.getChild(i).getText().substring(0,t.getChild(i).getText().indexOf(",")));
					}else{
						vm.setInfo(t.getChild(i).getText().substring(0,t.getChild(i).getText().length()-1));
					}
					vm.setSigTrue(null);
					vm.setSigFalse(null);
					listaPlana.add(vm);
					//System.out.println("Info: "+vm.getInfo()+" Tipo: "+vm.getTipo()+" Clase: "+vm.getClase());
					cambioArbolLista((ParseTree)t.getChild(i));
				}else
				if(t.getChild(i).toString().equals("else")){//else
						variablesMetodosIRT vm = new variablesMetodosIRT();
						vm.setNombre(null);
						vm.setTipo("condicion false"); 
						vm.setClase("else");
						vm.setInfo(null);
						vm.setSigTrue(null);//end
						vm.setSigFalse(null);
						listaPlana.add(vm);
						//System.out.println("Tipo: "+vm.getTipo()+" Clase: "+vm.getClase());
						cambioArbolLista((ParseTree)t.getChild(i));
				}else
				if(t.getChild(i).toString().substring(1,3).equals("87")){ //statement
					if(t.getChild(i).getChild(0).toString().equals("if")){//if
						variablesMetodosIRT vm = new variablesMetodosIRT();
						vm.setNombre(null);
						vm.setTipo("condicion"); 
						vm.setClase("if");
						vm.setInfo(t.getChild(i).getChild(2).getText().substring(0,t.getChild(i).getChild(2).getText().length()));
						vm.setSigTrue(null);//nodoBloque
						vm.setSigFalse(null);//nodoBloqueElse
						listaPlana.add(vm);
						//System.out.println("Info: "+vm.getInfo()+" Tipo: "+vm.getTipo()+" Clase: "+vm.getClase());
						cambioArbolLista((ParseTree)t.getChild(i));
					}else
					if(t.getChild(i).getChild(0).toString().equals("for")){//for
						variablesMetodosIRT vm = new variablesMetodosIRT();
						vm.setNombre(null);
						vm.setTipo(null); 
						vm.setClase("for");
						vm.setInfo(t.getChild(i).getText().substring(0,t.getChild(i).getText().length()));
						vm.setSigTrue(null);//regresa
						vm.setSigFalse(null);//fin
						listaPlana.add(vm);
						//System.out.println("Nombre: "+vm.getNombre()+" Tipo: "+vm.getTipo()+" Clase: "+vm.getClase());
						cambioArbolLista((ParseTree)t.getChild(i));
					}else
					if(t.getChild(i).getChild(0).toString().equals("return")){//return
						variablesMetodosIRT vm = new variablesMetodosIRT();
						vm.setNombre(null);
						vm.setTipo(null); 
						vm.setClase("return");
						vm.setInfo(t.getChild(i).getChild(1).getText().substring(0,t.getChild(i).getChild(1).getText().length()-1));
						vm.setSigTrue(null);//regresa
						vm.setSigFalse(null);//fin
						listaPlana.add(vm);
						//System.out.println("Info: "+vm.getInfo()+" Tipo: "+vm.getTipo()+" Clase: "+vm.getClase());
					}else
					if(t.getChild(i).getChild(0).toString().substring(1,4).equals("112")){ //method_call
						//buscarMetodo y sustituir valores
						String nombreMetodo = t.getChild(i).getChild(0).getChild(0).toString();
						String parametros = t.getChild(i).getChild(0).getText().substring(0,t.getChild(i).getChild(0).getText().length()-2);
						variablesMetodosIRT vm = new variablesMetodosIRT();
						vm.setNombre(nombreMetodo);
						vm.setTipo(null); 
						vm.setClase("method_call");
						vm.setInfo(parametros);
						vm.setSigTrue(null);//regresa
						vm.setSigFalse(null);//fin
						listaPlana.add(vm);
						//System.out.println("Tipo: "+vm.getTipo()+"Info: "+vm.getInfo()+" Clase: "+vm.getClase());
					}else
						cambioArbolLista((ParseTree)t.getChild(i));
				}else
					cambioArbolLista((ParseTree)t.getChild(i));
			}
		}
	};
	
}
