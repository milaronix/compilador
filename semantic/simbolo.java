package compiler.semantic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.ast.Ast;

import java.util.List;
import java.util.*;
import java.util.ArrayList;

public class simbolo {

	private String nombre;
	private String tipo;
	private int largo;
	private String padre;
	private List<String> parametros;
	
	public void setNombre(String name){
		nombre = name;
	}
	
	public String getNombre(){
		return nombre;
	}

	public void setTipo(String type){
		tipo = type;
	}
	
	public String getTipo(){
		return tipo;
	}

	public void setLargo(int lenght){
		largo = lenght;
	}
	
	public int getLargo(){
		return largo;
	}

	public void setPadre(String parent){
		padre = parent;
	}
	
	public String getPadre(){
		return padre;
	}

	public void setParametros(List<String> parameters){
		parametros = parameters;
	}
	
	public List<String> getParametros(){
		return parametros;
	}
	
}
