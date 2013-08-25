//Stephanie Garcia Y Milton Godinez
//13000932 - 12002306
//Seccion AN


import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;

import compiler.ast.Ast;
import compiler.codegen.Codegen;
import compiler.irt.Irt;
import compiler.opt.Algebraic;
import compiler.opt.ConstantFolding;
import compiler.parser.CC4Parser;
import compiler.scanner.Scanner;
import compiler.semantic.Semantic;

public class Compiler {
	
	public static void main(String[] args) {
		File archivo = null;
		FileWriter escribir = null;
		
		int target,opt,debug,o;
		target=0;
		opt=0;
		debug=0;
		o=0;
		
		String targetPos,optPos,debugPos,oPos;
		targetPos="";
		optPos="";
		debugPos="";
		oPos="";
		
		if(args[args.length-1].charAt(0)!='-'){
			for(int i=args.length-1;i>=0;i--){
				if(args[i].equals("-o") && o==0){
					o=1;
					oPos=args[i+1];
				}
				if(args[i].equals("-target") && target==0){
					target=1;
					targetPos=args[i+1];
				}
				if(args[i].equals("-opt") && opt==0){
					opt=1;
					optPos=args[i+1];
				}
				if(args[i].equals("-debug") && debug==0){
					debug=1;
					debugPos=args[i+1];
				}
				
			}
		
		if(o==1){
			archivo = new File(oPos);
			try {
				escribir = new FileWriter(archivo,true);
				escribir.write("Se creo archivo "+oPos+"\n");
				escribir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			archivo = new File("default.txt");
			try {
				escribir = new FileWriter(archivo,true);
				escribir.write("Se creo archivo "+oPos+"\n");
				escribir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(target==1){
			if(targetPos.equals("scan")){
				Scanner scan = new Scanner(archivo);
			}
			if(targetPos.equals("parse")){
				CC4Parser parse = new CC4Parser(archivo);
			}
			if(targetPos.equals("ast")){
				Ast ast = new Ast(archivo);
			}
			if(targetPos.equals("semantic")){
				Semantic semantic = new Semantic(archivo);
			}
			if(targetPos.equals("irt")){
				Irt irt = new Irt(archivo);
			}
			if(targetPos.equals("codegen")){
				Codegen codegen = new Codegen(archivo);
			}
		}
		if(opt==1){
			if(optPos.equals("algebraic")){
				Algebraic algebraic = new Algebraic(archivo);
			}
			if(optPos.equals("constant")){
				ConstantFolding constant = new ConstantFolding(archivo);
			}
		}
		if(debug==1){
			String[] stages = new String[6];
			String s="";
			int contador = 0;
			for(int i=0;i<debugPos.length();i++){
				if((debugPos.charAt(i)==':') || (i==debugPos.length()-1)){
					if (debugPos.length()-1==i){
						s = s + debugPos.charAt(i);
					}
					stages[contador]=s;
					s="";
					contador = contador + 1;
				}else{
					s = s + debugPos.charAt(i);
					
				}
			}
			for(int i=0;i<contador;i++){
				System.out.println("Target: "+stages[i]+"\n");
			}
		}
		}else{
			if(args[args.length-1].equals("-h")){
			String texto = "";
					try{
					FileReader leer = new FileReader("ayuda.txt");
					BufferedReader contenido = new BufferedReader(leer);
					while((texto=contenido.readLine())!=null){
						System.out.println(texto);
					}
				}catch(Exception e){
					System.out.println("Error al leer");
				}	
		}else{
			System.out.println("ERROR");
		}}
		
	}

}
