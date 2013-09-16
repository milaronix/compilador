package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
 
/*public class Root extends Node{
	private List<Node> list;
	public Root(){
		list = new LinkedList<Node>();
	}
	public void add(Node node){
		list.add(node);
	}
	
	public void print(String padding){
		for(Node n : list){
			System.out.println("exp ->" + n.getNombre()+ "\t");
		}
	}
}*/ 

public class Tree<T> {
    private Node<T> raiz;

    public Tree() {
        raiz = new Node<T>();
        root.setData = rootData;
        root.children = new ArrayList<Node<T>>();
}
