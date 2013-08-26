package compiler.opt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConstantFolding {

	public ConstantFolding(File archivo){
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Constant\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
