package compiler.parser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.scanner.Scanner;
import compiler.scanner.DecafLexer;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CC4Parser {

	public CC4Parser(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		Scanner scanner = new Scanner(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Parse\n");
			DecafLexer lexer = new DecafLexer(new ANTLRFileStream(archivoEntrada));
			CommonTokenStream ctsTokens = new CommonTokenStream (lexer);
			DecafParser parser = new DecafParser(ctsTokens);
			ParseTree tree = parser.program();
			if(encontroParse == 1){
				System.out.println(tree.toStringTree(parser));				
			}
			escribir.write(tree.toStringTree(parser));
			escribir.close();
		}catch(Exception e){
			System.err.println("Must provide a valid path to the filename with the tokens");
			System.exit(1);
		}
	}
	
}
