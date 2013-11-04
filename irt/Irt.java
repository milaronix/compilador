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

	public void cargarStack (String variable, String valor){
		String mensaje;
		String posicion;
		operacion("+", "$sp", "$sp", "4");
		System.out.println("Guardar el valor de $sp como el offset para " + variable + "\n Guardar en el stack " + valor + " que es el contenido de " + variable);
	}

	public void leerStack (String registroOff, String registroRecibe){	//ya
		String mensaje;
		mensaje = "Buscar el offset que esta en " + registroOff + " en el stack";
		registroRecibe = "Valor en el stack";
		System.out.println(mensaje);
		cargarReg (registroOff , registroRecibe);
	}

	
	public void cargarReg (String cargar, String registro){		//ya
		String mensaje;
		mensaje = "Load de " + cargar + " en "+ registro;
		System.out.println(mensaje);
	}

	public void retorno (String retorno){		//ya
		System.out.println("Carga " + retorno + "en $v0");
		cargarReg(retorno, "$v0");
		System.out.println("Salta hacia donde apunta $ra\nj $ra");
	}

	public void leerReg (String variable, String registro){		//ya
		String mensaje;
		mensaje = "Buscar el offset de "+ variable +" en la tabla\nY se guarda en " + registro ;
		System.out.println(mensaje);
		cargarReg("offset" , registro);
		leerStack(registro, registro);
	}

	public void operacion (String operacion, String a, String b, String c){
		String branch = "";
		cargarReg(a, "$t2");
		cargarReg(b, "$t0");
		cargarReg(c, "$t1");
		if (operacion.equals("+")){
			branch = "add $t0 $t1 $t2";
		}
		if (operacion.equals("-")){
			branch = "sub $t0 $t1 $t2";
		}
		if (operacion.equals("*")){
			branch = "mul $t0 $t1 $t2";
		}
		if (operacion.equals("/")){
			branch = "div $t0 $t1 $t2";
		}
		System.out.println(branch);
	}

	public void branch (String operacion, String a, String b, String etiqueta){
		String branch = "";
		String reg1 = "";
		String reg2 = "";
		cargarReg(a, "$t0");
		cargarReg(b, "$t1");
		if (operacion.equals(">")){
			branch = "bgt $t0 $t1 " + etiqueta;
		}
		if (operacion.equals("<")){
			branch = "blt $t0 $t1 " + etiqueta;
		}
		if (operacion.equals("=")){
			branch = "beq $t0 $t1 " + etiqueta;
		}
		System.out.println(branch);
	}
	
	public void crearEtiqueta (String nombre, LinkedList<String> parametros){
		System.out.println("Metodo " + nombre + " en etiqueta: " + nombre + ":");
		if(parametros != null){
			for(int i = 0; i < parametros.size(); i++){
				cargarStack(parametros.get(i), "0");
			}
		}
	}

	public void salto (String etiqueta){
		System.out.println("Salto hacia la etiqueta: " + etiqueta + "\n jal " + etiqueta);
	}
	
	public void start() throws IOException{
		System.out.println("******************  IRT  **********************");		
		/*branch(">","milton","uno", "salto");
		operacion("+","resultado","op1", "op2");
		leerReg("var_milton", "$t0");
		System.out.println("cargar al stack");
		cargarStack ("milton", "registro");*/

		cambioArbolLista(semantic.ast.getAstTree());
		
	}

	public void cambioArbolLista(ParseTree t){
		for ( int i = 0; i < t.getChildCount(); i++ ){
			if(t.getChild(i).toString().length()>3){
				if(t.getChild(i).toString().substring(1,3).equals("41") || t.getChild(i).toString().substring(1,3).equals("80")){ //var_decl
					cargarStack(t.getChild(i).getChild(1).toString(),"0");					
				}else
				if(t.getChild(i).toString().substring(1,3).equals("48")){ //method_decl
					LinkedList<String> param = new LinkedList<String>();
					for(int j = 2; j< t.getChild(i).getChildCount(); j++){
						param.add(t.getChild(i).getChild(j).toString());
					}
					crearEtiqueta(t.getChild(i).getChild(1).toString(), param);
					
					cambioArbolLista((ParseTree)t.getChild(i));
				}else
				if(t.getChild(i).toString().substring(1,3).equals("88")){ //assign
					String asignacion;
					if(t.getChild(i).getText().indexOf(",") != -1){
						asignacion = t.getChild(i).getText().substring(0,t.getChild(i).getText().indexOf(","));
					}else{
						asignacion = t.getChild(i).getText().substring(0,t.getChild(i).getText().length()-1);
					}
					String id = asignacion.substring(0, asignacion.indexOf("="));
					asignacion = asignacion.substring(asignacion.indexOf("="),asignacion.length());
					cargarStack(id,asignacion);
					cambioArbolLista((ParseTree)t.getChild(i));
				}else
				if(t.getChild(i).toString().equals("else")){//else
						crearEtiqueta("else", null);
						cambioArbolLista((ParseTree)t.getChild(i));
				}else
				if(t.getChild(i).toString().substring(1,3).equals("87")){ //statement
					if(t.getChild(i).getChild(0).toString().equals("if")){//if
						String condicion ="";
						String op ="";
						String parte1 = "";
						String parte2 = "";
						condicion = t.getChild(i).getChild(2).getText().substring(0,t.getChild(i).getChild(2).getText().length());
						if(condicion.indexOf(">")!=-1){
							op = ">";
							parte1 = condicion.substring(0,condicion.indexOf(">"));
							parte2 = condicion.substring(condicion.indexOf(">"),condicion.length());
						}else
						if(condicion.indexOf("<")!=-1){
							op = "<";
							parte1 = condicion.substring(0,condicion.indexOf("<"));
							parte2 = condicion.substring(condicion.indexOf("<"),condicion.length());
						}else
						if(condicion.indexOf(">")!=-1){
							op = "=";
							parte1 = condicion.substring(0,condicion.indexOf("="));
							parte2 = condicion.substring(condicion.indexOf("="),condicion.length());
						}
						branch(op,parte1,parte2,"if");
						
						cambioArbolLista((ParseTree)t.getChild(i));
					}else
					if(t.getChild(i).getChild(0).toString().equals("for")){//for
						crearEtiqueta("for",null);
						//t.getChild(i).getText().substring(0,t.getChild(i).getText().length())
						cambioArbolLista((ParseTree)t.getChild(i));
					}else
					if(t.getChild(i).getChild(0).toString().equals("return")){//return
						retorno(t.getChild(i).getChild(1).getText().substring(0,t.getChild(i).getChild(1).getText().length()-1));
					}else
					if(t.getChild(i).getChild(0).toString().substring(1,4).equals("112")){ //method_call
						String nombreMetodo = t.getChild(i).getChild(0).getChild(0).toString();
						String parametros = t.getChild(i).getChild(0).getText().substring(0,t.getChild(i).getChild(0).getText().length()-2);
						/*LinkedList<String> param = new LinkedList<String>;
						for(int j = 2; j< t.getChild(i).getChildCount(); j++){
							param.add(t.getChild(i).getChild(j));
						}*/
						System.out.println("PARAMETROS: "+parametros);
						salto(nombreMetodo);
					}else
						cambioArbolLista((ParseTree)t.getChild(i));
				}else
					cambioArbolLista((ParseTree)t.getChild(i));
			}
		}
	};
	
}
