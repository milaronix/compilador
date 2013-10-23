package compiler.semantic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.ast.Ast;

import java.util.List;
import java.util.*;
import java.util.ArrayList;

public class variablesMetodos {

	private String nombre;
	private Boolean encontro;
	private String tipo;
	private String recibe;
	private String padre;
	private List<String> parametros;

	public void setNombre(String name){
		nombre = name;
	}
	
	public String getNombre(){
		return nombre;
	}

	public void setEncontro(Boolean found){
		encontro = found;
	}
	
	public Boolean getEncontro(){
		return encontro;
	}

	public void setTipo(String type){
		tipo = type;
	}
	
	public String getTipo(){
		return tipo;
	}

	public void setRecibe(String get){
		recibe = get;
	}
	
	public String getRecibe(){
		return recibe;
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
