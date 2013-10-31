package compiler.irt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.irt.Irt;

import java.util.List;
import java.util.*;
import java.util.ArrayList;

public class variablesMetodosIRT {

	private String nombre;
	private String tipo;
	private String clase;
	private String info;
	private variablesMetodosIRT sigTrue;
	private variablesMetodosIRT sigFalse;

	public void setNombre(String name){
		nombre = name;
	}
	
	public String getNombre(){
		return nombre;
	}

	public void setTipo(String type){
		tipo = type;
	}
	
	public String getClase(){
		return clase;
	}

	public void setClase(String type){
		clase = type;
	}
	
	public String getTipo(){
		return tipo;
	}

	public void setInfo(String get){
		info = get;
	}
	
	public String getInfo(){
		return info;
	}
	
	public void setSigTrue(variablesMetodosIRT get){
		sigTrue = get;
	}
	
	public variablesMetodosIRT getSigTrue(){
		return sigTrue;
	}

	public void setSigFalse(variablesMetodosIRT get){
		sigFalse = get;
	}
	
	public variablesMetodosIRT getSigFalse(){
		return sigFalse;
	}

}
