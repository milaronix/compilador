package compiler.ast;

import org.antlr.v4.runtime.tree.*;

public class Node {

	private String data;
	private String type;
        private Tree parent;

	public void setData(String datos){
		data = datos;	
	}

	public String getData(){
		return data;	
	}

	public void setType(String tipo){
		type = tipo;	
	}

	public String getType(){
		return type;	
	}

	public void setParent(Tree papa){
		parent = papa;	
	}

	public Tree getParent(){
		return parent;	
	}
}
