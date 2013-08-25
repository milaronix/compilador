package compiler.ast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.parser.CC4Parser;

public class  Ast {

	public Ast(File archivo){
		CC4Parser parser = new CC4Parser(archivo);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Target:Ast\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}