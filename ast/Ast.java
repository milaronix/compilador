package compiler.ast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.parser.CC4Parser;

public class  Ast {

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
	}
	
}
