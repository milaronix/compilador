package compiler.irt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.semantic.Semantic;

public class Irt {

	public Irt(File archivo){
		Semantic semantic = new Semantic(archivo);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Target:Irt\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}