package compiler.parser;

import org.antlr.v4.runtime.*;

public class Main{
    public static void main(String[] args) throws Exception{
	try{
	    DecafLexer lexer = new DecafLexer(new ANTLRFileStream(args[0]));
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
