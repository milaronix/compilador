package compiler.semantic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.ast.Ast;
import compiler.semantic.simbolo;

import java.util.List;
import java.util.*;
import java.util.ArrayList;



public class Semantic {
	
	public Ast ast;
	private int errores = 0;

	public int getErrores(){
		return errores;
	}

	public Semantic(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		ast = new Ast(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		
		revision();
		TipoAsignacion();

		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Semantic\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean polimorfos (List<String> uno, List<String> dos){
		if( uno == null || dos == null){
			return true;
		}else{
			if( uno.size() != dos.size() ){
				return true;
			}else{
				boolean salir = false;
				int pos = 0;
				while ( ( salir == false ) && ( pos < uno.size() ) ) {
					if( !(uno.get(pos).equals(dos.get(pos))) ){
						salir = true;
					}else{
						pos = pos + 1;
					}
				}
				return salir;
			}
		}
	}

	public String buscarTipo(String var, String papa){
		return "int";
		
	}

	public boolean mismoBloque(String var, String papa){ 
		boolean mt = false;
		int pos = 0;
		while( ( mt == false ) && ( pos < ast.getTablaSimbolos().size() ) ){
			if( var == ast.getTablaSimbolos().get(pos).getNombre() ){
				if( papa == ast.getTablaSimbolos().get(pos).getPadre() ){
					mt = true;
				}
			}
		}
		return mt;
	}
		
	public boolean isInteger(String s) {
	    try { 
		Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
		return false; 
	    }
	    return true;
	}

	public boolean TipoAsignacion(){
			for(int m = 0; m < ast.getVariablesFinales().size(); m++){
				if(ast.getVariablesFinales().get(m).getTipo()=="null"){
					System.out.println("ERROR: La variable "+ast.getVariablesFinales().get(m).getNombre()+" es NULL, no acepta parametros");
					errores = errores + 1;
				}else{
					List<String> variables = new ArrayList<String>();
					String recibe = ast.getVariablesFinales().get(m).getRecibe();
					String s = "";
					for(int n = 0; n < recibe.length(); n++){
						if((recibe.charAt(n) != '+') && (recibe.charAt(n) != '-') && (recibe.charAt(n) != '*') && (recibe.charAt(n) != '/') && (recibe.charAt(n) != '<') && (recibe.charAt(n) != '>') ){
							s = s + recibe.charAt(n);
						}else{
							variables.add(s);
							s = "";
						}
					}variables.add(s);
					for(int o = 0; o < variables.size(); o++){
						int pos = -999;
						for(int p = 0; p < ast.getTablaSimbolos().size(); p++){
							if( ast.getTablaSimbolos().get(p).getNombre().equals(variables.get(o))){
								pos = p;						
							}
						}
						if(pos == -999){
							if( (isInteger(variables.get(o)) == false) && !(variables.get(o).equals("true")) && !(variables.get(o).equals("false")) ){
								System.out.println("ERROR: La variable "+variables.get(o)+" no ha sido declarada");
								errores = errores + 1;
							}else{
								if((ast.getVariablesFinales().get(m).getTipo().equals("int")) && (isInteger(variables.get(o)) == false) ){
									System.out.println("ERROR: La asignacion "+variables.get(o)+" no es ENTERA");
									errores = errores + 1;
								}else{
									if(ast.getVariablesFinales().get(m).getTipo().equals("boolean") && !(variables.get(o).equals("true")) && !(variables.get(o).equals("false"))){
										System.out.println("ERROR: El numero "+variables.get(o)+" no se puede asignar a tipo BOOLEAN");
										errores = errores + 1;
									}
								}
							}
						}else{
							if( !(ast.getTablaSimbolos().get(pos).getTipo().equals(ast.getVariablesFinales().get(m).getTipo()) ) ){
								System.out.println("ERROR: Tipo de asignacion de la variable "+variables.get(o)+" <"+ ast.getTablaSimbolos().get(pos).getTipo()+"> no es compatible con  "+ast.getVariablesFinales().get(m).getNombre()+"<"+ast.getVariablesFinales().get(m).getTipo()+">");
								errores = errores + 1;
							}
						}
					}
				}//else
			}
			
		
		return false;
	}

	public void revision() {
			//Revision de polimorfismo
				for ( int j = 0; j < ast.getTablaSimbolos().size(); j++ ){
					int nombreIgual = -999;
					int otroNombre = -999;
					for ( int k = j + 1; k <  ast.getTablaSimbolos().size(); k++ ){
						if( ast.getTablaSimbolos().get(j).getNombre().equals(ast.getTablaSimbolos().get(k).getNombre()) ){
							nombreIgual = j;
							otroNombre = k;
						}
					}
					if ( ( nombreIgual != -999 ) && ( otroNombre != -999 ) ){
						if ( !( polimorfos( ast.getTablaSimbolos().get(nombreIgual).getParametros(), ast.getTablaSimbolos().get(otroNombre).getParametros()  ) ) ){
							System.out.println("ERROR: El metodo "+ast.getTablaSimbolos().get(nombreIgual).getNombre()+" y "+ast.getTablaSimbolos().get(otroNombre).getNombre()+" son iguales, mismo nombre y mismos parametros.");
							errores = errores + 1;
						}
					}
				}

			//Revision de variables & returns
			for(int i = 0; i< ast.getVariablesFinales().size(); i++){
				variablesMetodos coso;
				coso = ast.getVariablesFinales().get(i);
				if(coso.getEncontro()==false){
					System.out.println("ERROR: La variable "+coso.getNombre()+" no ha sido declarada.");
					errores = errores + 1;
				}
			}
			System.out.println("");

 	}


}
