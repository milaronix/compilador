package compiler.ast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import compiler.scanner.*;
import compiler.parser.*;



public class  Ast {

	public String arch;

	public Ast(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		CC4Parser parser = new CC4Parser(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Ast\n");
			escribir.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		arch=archivoEntrada;
		try{
			start();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void start() throws IOException{
		DecafLexer lexer = new DecafLexer(new ANTLRFileStream(arch));
		CommonTokenStream ctsTokens = new CommonTokenStream (lexer);
		DecafParser parser_ = new DecafParser(ctsTokens);
		ParseTree tree = parser_.program();
		ASTVisitor visitor = new ASTVisitor();
		Root root = (Root)visitor.visit(tree);
		root.print1();
		//root.print("");
	}
	
}
