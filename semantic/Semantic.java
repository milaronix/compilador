package compiler.semantic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.ast.Ast;
import compiler.semantic.simbolo;

public class Semantic {

	public Semantic(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		Ast ast = new Ast(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Semantic\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean polimorfos (String[] uno, String[] dos){
		if(uno.length != dos.length){
			return true;
		}else{
			boolean salir = false;
			int pos = 0;
			while ((salir == false) && (pos < uno.length)) {
				if(uno[pos].equals(dos[pos])){
					salir = true;
				}else{
					pos = pos + 1;
				}
			}
			return salir;
		}
	}
	
}
