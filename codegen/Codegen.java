package compiler.codegen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.irt.Irt;

public class Codegen {

	public Codegen(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		Irt irt = new Irt(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Codegen\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
