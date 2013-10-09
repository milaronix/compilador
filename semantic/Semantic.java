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

	public Semantic(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		Ast ast = new Ast(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		
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
		if( uno.size() != dos.size() ){
			return true;
		}else{
			boolean salir = false;
			int pos = 0;
			while ( ( salir == false ) && ( pos < uno.size() ) ) {
				if( uno.get(pos).equals(dos.get(pos)) ){
					salir = true;
				}else{
					pos = pos + 1;
				}
			}
			return salir;
		}
	}

	public void revision() {
			//Revision de polimorfismo
				for ( int j = 0; j < tablaSimbolos.size(); j++ ){
					int nombreIgual = -999;
					int otroNombre = -999;
					for ( int k = j + 1; k < tablaSimbolos.size(); k++ ){
						if( tablaSimbolos.get(j).nombre.equals(tablaSimbolos.get(k).nombre) ){
							nombreIgual = j;
							otroNombre = k;
						}
					}
					if ( ( nombreIgual != -999 ) && ( otroNombre != -999 ) ){
						if ( !( polimorfos( tablaSimbolos.get(nombreIgual).parametros, polimorfos( tablaSimbolos.get(otroNombre).parametros ) ) ) ){
							System.out.println("ERROR: El metodo "+tablaSimbolos.get(nombreIgual).nombre+" y "+tablaSimbolos.get(otroNombre).nombre+" son iguales, mismo nombre y mismos parametros.");
						}
					}
				}
			//Revision de variables
			for ( int i = 0; i < variables.size(); i++){
				boolean encontro = false;
				for ( int l = 0; l < tablaSimbolos.size(); l++ ){
					if ( variables.get(i).nombre.equals( tablaSimbolos.get(l).nombre ) ){
						if ( !(variables.get(i).tipo.equals( tablaSimbolos.get(l).tipo ) ) ){
							System.out.println("ERROR: El tipo de la variable "+ variables.get(i).nombre +" no coincide con el asignado.");
						}
						encontro = true;
					}
				}
				if ( encontro == false ){
					System.out.println("ERROR: La variable "+ variables.get(i).nombre +" no ha sido declarada.");
				}						
			}
			//Revision de llamadas a metodos
 	}
	
}
