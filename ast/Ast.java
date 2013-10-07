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

		System.out.println("*****************SIMBOLOS********************");
		for(int i = 0; i< tablaSimbolos.size(); i++){
			simbolo coso;
			coso = (simbolo) tablaSimbolos.get(i);
			System.out.println("Nombre " + coso.nombre + " Tipo " + coso.tipo + " Largo "  + coso.largo + " Parametros " + coso.parametros + " Papa " + coso.padre);
		}
	}

	public void crea_tabla(){
		tabla.put(46, "method_decl");
		tabla.put(75, "block");
		tabla.put(85, "statement");
		tabla.put(114, "statement");
		tabla.put(16, "operation");
		tabla.put(167, "exp");
		tabla.put(177, "op");
		tabla.put(178, "exp");
		tabla.put(116, "var_decl");
		tabla.put(79, "field_decl");
		tabla.put(104, "assign");
		tabla.put(106, "op");
		tabla.put(118, "block");
		tabla.put(78, "var_decl");
		//tabla.put(, "");
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
					if ((t.getChild(i).toString().charAt(0) == '[') && (t.getChild(i).toString().length()>1)){
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
					//palabra = t.getChild(i).toString();
					System.out.println(sb.toString() + palabra); 
					printTree((ParseTree)t.getChild(i), indent+1); 

					Node nodo2 = new Node();
					nodo2.setData(palabra);
					nodo2.setParent(t.getParent());
					nodo2.setType(null);
					astTree.add(nodo2);

					if((palabra == "var_decl") || (palabra == "field_decl") || (palabra == "method_decl") ){
						if (t.getChild(i).getChild(0).toString().charAt(0) != '{'){
							simbolo sim = new simbolo();
							sim.nombre = t.getChild(i).getChild(1).toString();
							sim.tipo = t.getChild(i).getChild(0).toString();
	
							if(t.getChild(i).getChild(2).toString().equals("[")){
								sim.largo = Integer.parseInt(t.getChild(i).getChild(3).toString());
							}else{
								sim.largo = 0;
							}

							sim.padre = t.getChild(i).toString();

							if(t.getChild(i).getChildCount()>2){
								List<String> parametros = new ArrayList<String>();
								for(int j=3; j<(t.getChild(i).getChildCount()-2); j = j + 3){
									parametros.add(t.getChild(i).getChild(j).toString());
								}
								sim.parametros = parametros;
							}else{
								sim.parametros = null;
							}

							tablaSimbolos.add(sim);
						}
					}
				}
			} 
		}
 	}
		
	
}
