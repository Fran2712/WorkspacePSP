package enumerados;

import java.util.Scanner;

public class PruebaEnumerado {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la maquina de cafe!");
		for (int i = 0; i < TipoCafe.values().length; i++) {
			TipoCafe tp = TipoCafe.values()[i];
			System.out.println(i + "-" + tp + "-" + tp.getPrecio());
		}
		System.out.println("Escoja una opción:");
		
		//TipoCafe tp = TipoCafe.CAPUCCINO;
		Scanner in = new Scanner(System.in);
		int opcion = in.nextInt();
		TipoCafe cafeEscogido = TipoCafe.values()[opcion];
		System.out.println("Preparando cafe: " + cafeEscogido);
	}

}
//4clasess habitaon(enum) rrellenar casa completa imprimir casa.tostring mostrar tdo 