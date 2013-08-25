package compiler.semantic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.ast.Ast;

public class Semantic {

	public Semantic(File archivo){
		Ast ast = new Ast(archivo);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Target:Semantic\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}