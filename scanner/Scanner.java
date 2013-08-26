package compiler.scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.*;

public class Scanner {

	public Scanner(String archivoEntrada, File archivo) throws Exception{
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Scanner\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try{
			DecafLexer lexer = new DecafLexer(new ANTLRFileStream(archivoEntrada));
			while (lexer.nextToken().getType() != Token.EOF);	
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.err.println("Must provide a valid path to the filename with the tokens");
			System.exit(1);
		}catch(Exception e){
			System.err.println("Must provide a valid path to the filename with the tokens");
			System.exit(1);
		}
	}
	
}
