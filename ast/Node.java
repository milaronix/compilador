package compiler.ast;

public static class Node<T> {

	private String data;
        private Node<T> parent;

	public void setData(String datos){
		data = datos;	
	}

	public String getData(){
		return data;	
	}

	public void setParent(Node<t> papa){
		parent = papa;	
	}

	public Node<t> getParent(){
		return parent;	
	}
}
