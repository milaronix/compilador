package compiler.opt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Algebraic {

	public Algebraic(File archivo){
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Algebraic\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
