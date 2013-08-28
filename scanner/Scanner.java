package compiler.scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.*;

public class Scanner {
	public Scanner(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen) {
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Target:Scanner\n");
			//******************************************************************************
			DecafLexer lexer = new DecafLexer(new ANTLRFileStream(archivoEntrada));
			while (lexer.nextToken().getType() != Token.EOF){
				if(encontroScan == 1){
					System.out.println("Linea: "+lexer.getToken().getLine()+" Tipo: "+lexer.ruleNames[lexer.getToken().getType()-1]+" Variable: "+lexer.getToken().getText()+"\n");	
				}
				escribir.write("Linea: "+lexer.getToken().getLine()+" Tipo: "+lexer.ruleNames[lexer.getToken().getType()-1]+" Variable: "+lexer.getToken().getText()+"\n");		
			};
			//*****************************************************************************
			escribir.close();	
		}catch(Exception e){
			System.err.println("Must provide a valid path to the filename with the tokens");
			System.exit(1);
		}
	}
	
}
