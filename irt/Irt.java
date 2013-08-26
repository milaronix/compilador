package compiler.irt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.semantic.Semantic;

public class Irt {

	public Irt(String archivoEntrada, File archivo){
		Semantic semantic = new Semantic(archivoEntrada, archivo);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Irt\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
