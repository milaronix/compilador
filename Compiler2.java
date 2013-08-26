//Compilador.java
//Milton Godinez
//12002306
//Seccion AN
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Compiler2 {
    public static void main (String args[]) {
        if (args.length > 0){
		switch (args[0]){
			case "-o":
				System.out.println("Se creó el archivo:	" + args[1]);
				try{
					File archivo = new File(args[1]);
					FileWriter escribir = new FileWriter(archivo, true);
					escribir.write("si funciona");
					escribir.close();
				}catch(Exception e){
					System.out.println("Error al escribir");
				}
			
			case "-target":
				System.out.println("entro al target");

			default:
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
		}
	}	
    }
}
