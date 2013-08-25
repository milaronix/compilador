package compiler.codegen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.irt.Irt;

public class Codegen {

	public Codegen(File archivo){
		Irt irt = new Irt(archivo);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Target:Codegen\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}