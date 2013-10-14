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

	public Semantic(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		ast = new Ast(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		
		revision();

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

	/*public String buscarTipo(String var, String papa){
		
	}

	/*public boolean mismoBloque(String var, String papa){
		mt = false;
		int pos = 0;
		while( ( mt == false ) && ( pos < ast.getTablaSimbolos() ) ){
			if( var == ast.getTablaSimbolos().get(pos).getNombre() ){
				if( papa == ast.getTablaSimbolos().get(pos).getPadre() ){
					mt = true;
				}
			}
		}
		return mt;
	}*/

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
						}
					}
				}
			//Revision de variables
			/*for ( int i = 0; i < ast.getVariables().size(); i++){
				boolean encontro = false;
				for ( int l = 0; l < ast.getTablaSimbolos().size(); l++ ){
					if ( ast.getVariables().get(i).getNombre().equals( ast.getTablaSimbolos().get(l).getNombre() ) ){
						if ( !(ast.getVariables().get(i).getTipo().equals( ast.getTablaSimbolos().get(l).getTipo() ) ) ){
							System.out.println("ERROR: El tipo de la variable "+ast.getVariables().get(i).getNombre() +" no coincide con el asignado.");
						}
						encontro = true;
					}
				}
				if ( encontro == false ){
					System.out.println("ERROR: La variable "+ ast.getVariables().get(i).getNombre() +" no ha sido declarada.");
				}						
			}*/
			//Revision de llamadas a metodos
 	}
	
}
