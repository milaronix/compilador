package compiler.scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Scanner {

	public Scanner(File archivo){
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Target:Scanner\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
