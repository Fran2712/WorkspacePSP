package interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImprimirFichero implements Imprimible {


	/* esto es antes de java 1.7
	@Override
	public void imprimir(String frase) {
		File file = new File("prueba.txt");
		PrintWriter pw= null;
		try {
			pw = new PrintWriter(file);
			pw.print(frase);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//se ejecuta siempre haaya o no excepcion
			if (pw!=null) {
				pw.close();
			}
			
		}
		
	}*/
	
	// try catch autoclosable
	@Override
	public void imprimir(String frase) {
		File file = new File("prueba.txt");
		
		//lo que esta dentro del try va a ejecutar el metodo close
		try (PrintWriter pw = new PrintWriter(file);){
			pw.print(frase);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
