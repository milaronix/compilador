package compiler.semantic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.ast.Ast;

public class Semantic {

	public Semantic(String archivoEntrada, File archivo) throws Exception{
		Ast ast = new Ast(archivoEntrada, archivo);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Semantic\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
