package compiler.ast;

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

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class  Ast {

	public String arch;
	public Hashtable tabla = new Hashtable(); 
	public LinkedList astTree = new LinkedList();	
	private LinkedList<simbolo> tablaSimbolos = new LinkedList<simbolo>();
	private LinkedList<variablesMetodos> variables = new LinkedList<variablesMetodos>();
	private LinkedList<variablesMetodos> variablesFinales = new LinkedList<variablesMetodos>();

	public LinkedList<simbolo> getTablaSimbolos(){
		return tablaSimbolos;
	}

	public LinkedList<variablesMetodos> getVariables(){
		return variables;
	}

	public Ast(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		CC4Parser parser = new CC4Parser(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Ast\n");
			escribir.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		arch=archivoEntrada;
		try{
			start();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void start() throws IOException{
		DecafLexer lexer = new DecafLexer(new ANTLRFileStream(arch));
		CommonTokenStream ctsTokens = new CommonTokenStream (lexer);
		DecafParser parser_ = new DecafParser(ctsTokens);
		ParseTree tree = parser_.program();
		System.out.println();

		Node nodo = new Node();
		nodo.setData("Program");
		nodo.setParent(null);
		nodo.setType("class");
		astTree.add(nodo);

		printTree(tree,0);

		System.out.println("");
		System.out.println("*****************SIMBOLOS********************");
		for(int i = 0; i< tablaSimbolos.size(); i++){
			simbolo coso;
			coso = (simbolo) tablaSimbolos.get(i);
			System.out.println("Nombre " + coso.getNombre() + " Tipo " + coso.getTipo() + " Largo "  + coso.getLargo() + " Parametros " + coso.getParametros() + " Papa " + coso.getPadre());
		}

		System.out.println("");

		System.out.println("*****************VARIABLES*******************");
		//Limpieza
		for(int i = 0; i< variables.size()-1; i++){
			variablesMetodos coso;
			coso = (variablesMetodos) variables.get(i);
			boolean verdadero = false;
			for(int j = i+1; j< variables.size(); j++){
				variablesMetodos coso2;
				coso2 = (variablesMetodos) variables.get(j);
				if(coso.getNombre().equals(coso2.getNombre()) && coso.getRecibe().equals(coso2.getRecibe()) && coso.getPadre().equals(coso2.getPadre())){
					if(coso2.getEncontro() == true){
						coso.setEncontro(true);
					}
					if(coso2.getTipo() != null){
						coso.setTipo(coso2.getTipo());
					}
				}
			}
			boolean existe = false;
			for(int k = 0; k< variablesFinales.size(); k++){
				variablesMetodos coso3;
				coso3 = (variablesMetodos) variables.get(k);
				if(coso.getNombre().equals(coso3.getNombre()) && coso.getRecibe().equals(coso3.getRecibe()) && coso.getPadre().equals(coso3.getPadre())){
					existe = true;
				}
			}
			if(existe == false){
				variablesFinales.add(coso);
			}	
		}

		for(int i = 0; i< variablesFinales.size(); i++){
			variablesMetodos coso;
			coso = (variablesMetodos) variablesFinales.get(i);
			System.out.println("Nombre " + coso.getNombre() + " Tipo " + coso.getTipo() + " Recibe "  + coso.getRecibe() + " Parametros " + coso.getParametros() + " Papa " + coso.getPadre() + " Encontro " + coso.getEncontro());
			if(coso.getEncontro()==false){
				System.out.println("ERROR: La variable "+coso.getNombre()+" no ha sido declarada.");
			}
		}
		System.out.println("vacio");

	}

	public void crea_tabla(){
		tabla.put(48, "method_decl");
		tabla.put(77, "block");
		tabla.put(81, "field_decl");
		tabla.put(87, "statement_");
		tabla.put(117, "expr");
		tabla.put(173, "location");
		tabla.put(183, "bin_op");
		tabla.put(189, "bin_op");
		tabla.put(184, "exp");
		tabla.put(119, "block");
		tabla.put(80, "var_decl");
		tabla.put(88, "assign");
		tabla.put(107, "location");
		tabla.put(109, "location");
		tabla.put(141, "block");
		tabla.put(18, "exp");
		tabla.put(136, "exp");
		tabla.put(187, "exp");
		tabla.put(190, "exp");
		tabla.put(41, "var_global_decl");
		tabla.put(42, "var_global_decl");
		//tabla.put(, "");
	}
	
	public void busquedaMiniArbol(ParseTree t, String nombre, String tipo){
		for ( int i = 0; i < t.getChildCount(); i++ ){
			if(t.getChild(i).toString().length()>3){
				if(t.getChild(i).toString().substring(1,3).equals("88")){
					//******
					for(int j = 0; j< variables.size(); j++){
						variablesMetodos coso;
						coso = (variablesMetodos) variables.get(j);
						System.out.println("Nombre " + coso.getNombre() + " Tipo " + coso.getTipo() + " Recibe "  + coso.getRecibe() + " Parametros " + coso.getParametros() + " Papa " + coso.getPadre() + " Encontro " + coso.getEncontro());
					}
					//******
					variablesMetodos vm = new variablesMetodos();
					String id = "";
					String recibe = "";
					String operacion = t.getChild(i).getText();
					System.out.println(operacion);

					int index = operacion.indexOf('=');
					id = operacion.substring(0,index);
					recibe = operacion.substring(index+1,operacion.length()-1);

					vm.setNombre(id);
					vm.setRecibe(recibe);
					vm.setPadre(t.getChild(i).toString());
					if(nombre.equals(id)){
						vm.setTipo(tipo);
						vm.setEncontro(true);
					}else{
						vm.setTipo(null);
						vm.setEncontro(false);
					}
					variables.add(vm);
										
				}
			}
			busquedaMiniArbol((ParseTree)t.getChild(i), nombre, tipo);
		}
	}

	public void printTree(ParseTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ ) 
				sb = sb.append("   "); 
			for ( int i = 0; i < t.getChildCount(); i++ ){
				if (!(t.getChild(i).toString().equals(";")) && !(t.getChild(i).toString().equals("(")) && !(t.getChild(i).toString().equals(")")) && !(t.getChild(i).toString().equals("{")) && !(t.getChild(i).toString().equals("}")) && !(t.getChild(i).toString().equals(","))){
					String palabra = "";
					crea_tabla();					
					if ((t.getChild(i).toString().charAt(0) == '[') && (t.getChild(i).toString().length()>1)){
						String numStr = "";
						numStr = numStr + t.getChild(i).toString().charAt(1);
						numStr = numStr + t.getChild(i).toString().charAt(2);
						if (t.getChild(i).toString().charAt(3) != ']' && t.getChild(i).toString().charAt(3) != ' '){
							numStr = numStr + t.getChild(i).toString().charAt(3);						}
						//System.out.println(numStr); //da el numero de la hash
						if (tabla.get(Integer.parseInt(numStr)) == null ){
							palabra = "---block---";
						}else{
							palabra = tabla.get(Integer.parseInt(numStr)).toString();
						}
						
					}else{
						palabra = t.getChild(i).toString();
					}
					//palabra = t.getChild(i).toString();
					System.out.println(sb.toString() + palabra); 
					printTree((ParseTree)t.getChild(i), indent+1); 

					Node nodo2 = new Node();
					nodo2.setData(palabra);
					nodo2.setParent(t.getParent());
					nodo2.setType(null);
					astTree.add(nodo2);

					if((palabra == "var_decl") || (palabra == "field_decl") || (palabra == "method_decl") || (palabra == "var_global_decl")){
						if (t.getChild(i).getChild(0).toString().charAt(0) != '{'){
							simbolo sim = new simbolo();
							sim.setNombre(t.getChild(i).getChild(1).toString());
							sim.setTipo(t.getChild(i).getChild(0).toString());
	
							if(t.getChild(i).getChild(2).toString().equals("[")){
								sim.setLargo(Integer.parseInt(t.getChild(i).getChild(3).toString()));
							}else{
								sim.setLargo(0);
							}

							sim.setPadre(t.getChild(i).toString());
							
							if( (t.getChild(i).getChildCount()>3) && (t.getChild(i).getChild(2).toString().charAt(0) != '[') ){
								List<String> parametros = new ArrayList<String>();
								for(int j=3; j<(t.getChild(i).getChildCount()-2); j = j + 3){
									simbolo sim2 = new simbolo();
									sim2.setNombre(t.getChild(i).getChild(j+1).toString());
									sim2.setTipo(t.getChild(i).getChild(j).toString());
									sim2.setLargo(0);
									sim2.setPadre(t.getChild(i).getChild(1).toString());
									tablaSimbolos.add(sim2);
									parametros.add(t.getChild(i).getChild(j).toString());
								}
								sim.setParametros(parametros);
							}else{
								sim.setParametros(null);
							}

							tablaSimbolos.add(sim);
						}

						if((palabra == "var_decl") || (palabra == "field_decl") || (palabra == "var_global_decl")){
	
							String tipoA = t.getChild(i).getChild(0).toString();
							String nombreA = t.getChild(i).getChild(1).toString();

							busquedaMiniArbol(t, nombreA, tipoA);
														
						}//cierra cond	
									
					}
				}
			} 
		}
 	}
		
	
}
