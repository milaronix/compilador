package compiler.ast;
 
public class FloatLiteral extends Node{
	private float value;
	public FloatLiteral(String v){
		value = Float.parseFloat(v);
	}
	public void print(String padding){
		System.out.println(padding + value);
	}	
}
