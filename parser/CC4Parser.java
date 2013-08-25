package compiler.parser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.scanner.Scanner;

public class CC4Parser {

	public CC4Parser(File archivo){
		Scanner scanner = new Scanner(archivo);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Target:Parse\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}