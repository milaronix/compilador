package compiler.ast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import compiler.scanner.*;
import compiler.parser.*;
import compiler.semantic.*;

import java.util.List;
import java.util.*;
import java.util.ArrayList;

public class  Ast {

	public String arch;
	public Hashtable tabla = new Hashtable(); 
	public LinkedList astTree = new LinkedList();	
	public LinkedList tablaSimbolos = new LinkedList();

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
		System.out.println();

		Node nodo = new Node();
		nodo.setData("Program");
		nodo.setParent(null);
		nodo.setType("class");
		astTree.add(nodo);

		printTree(tree,0);

		System.out.println("***************************************");
		for(int i = 0; i< tablaSimbolos.size(); i++){
			simbolo coso;
			coso = (simbolo) tablaSimbolos.get(i);
			System.out.println(coso.nombre + " " + coso.tipo);
		}
	}

	public void crea_tabla(){
		tabla.put(40, "method_decl");
		tabla.put(86, "block");
		tabla.put(148, "block");
		tabla.put(126, "block");
		tabla.put(95, "statement");
		tabla.put(119, "method_call");
		tabla.put(89, "var_decl");
		tabla.put(114, "location");
		tabla.put(177, "location");
		tabla.put(116, "expr");	
		tabla.put(124, "callout");
		tabla.put(39, "field_decl");
		tabla.put(187, "bin_op");
		tabla.put(153, "exp_literal");
		tabla.put(16, "op");
		tabla.put(188, "exp_int");	
		tabla.put(128, "block");	
	}

	public void printTree(ParseTree t, int indent) {
		if ( t != null ) {

			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ ) 
				sb = sb.append("   "); 
			for ( int i = 0; i < t.getChildCount(); i++ ){
				if (!(t.getChild(i).toString().equals(";")) && !(t.getChild(i).toString().equals("(")) && !(t.getChild(i).toString().equals(")")) && !(t.getChild(i).toString().equals("{")) && !(t.getChild(i).toString().equals("}")) && !(t.getChild(i).toString().equals(","))){
					String palabra = "";
					crea_tabla();					
					if (t.getChild(i).toString().charAt(0) == '['){
						String numStr = "";
						numStr = numStr + t.getChild(i).toString().charAt(1);
						numStr = numStr + t.getChild(i).toString().charAt(2);
						if (t.getChild(i).toString().charAt(3) != ']' && t.getChild(i).toString().charAt(3) != ' '){
							numStr = numStr + t.getChild(i).toString().charAt(3);						}
						//System.out.println(numStr); //da el numero de la hash
						palabra = tabla.get(Integer.parseInt(numStr)).toString();
						
					}else{
						palabra = t.getChild(i).toString();
					}

					System.out.println(sb.toString() + palabra); 
					printTree((ParseTree)t.getChild(i), indent+1); 

					Node nodo2 = new Node();
					nodo2.setData(palabra);
					nodo2.setParent(t.getParent());
					nodo2.setType(null);
					astTree.add(nodo2);

					String palabra2;
					if(palabra == "var_decl"){
						if (t.getChild(i).getChild(i).toString().charAt(0) == '['){
							String numStr2 = "";
							numStr2 = numStr2 + t.getChild(i).getChild(i).toString().charAt(1);
							numStr2 = numStr2 + t.getChild(i).getChild(i).toString().charAt(2);
							if (t.getChild(i).toString().charAt(3) != ']' && t.getChild(i).toString().charAt(3) != ' '){
								numStr2 = numStr2 + t.getChild(i).getChild(i).toString().charAt(3);							}
							palabra2 = tabla.get(Integer.parseInt(numStr2)).toString();
						}else{
							palabra2 = t.getChild(i).getChild(i).toString();
						}
						simbolo sim = new simbolo();
						sim.nombre = palabra2;
						sim.tipo = t.getChild(i).getChild(0).toString();
						sim.largo = 0;
						sim.parametros = null;
						tablaSimbolos.add(sim);
					}
				}
			} 
		}
 	}
		
	
}
