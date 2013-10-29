package compiler.irt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import compiler.semantic.Semantic;

public class Irt {

	public Irt(String archivoEntrada, File archivo, int targeting, int encontroScan, int encontroParse, int encontroAST, int encontroSemantic, int encontroIRT, int encontroCodegen){
		Semantic semantic = new Semantic(archivoEntrada, archivo, targeting, encontroScan, encontroParse, encontroAST, encontroSemantic, encontroIRT, encontroCodegen);
		
		if(semantic.getErrores()>0){
			System.out.println("Existen errores previos a esta fase <IRT>, corrijalos para poder continuar");
		}

		FileWriter escribir;
		try {
			escribir = new FileWriter(archivo,true);
			escribir.write("Debug:Irt\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
