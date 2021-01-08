package fj.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dame 5 numeros para calcular su Factorial:");
		int numero1 = in.nextInt();
		int numero2 = in.nextInt();
		int numero3 = in.nextInt();
		int numero4 = in.nextInt();
		int numero5 = in.nextInt();
	
		Operacion o1 = new  Operacion(numero1);
		Operacion o2 = new  Operacion(numero2);
		Operacion o3 = new  Operacion(numero3);
		Operacion o4 = new  Operacion(numero4);
		Operacion o5 = new  Operacion(numero5);
	
		o1.start();
		o2.start();
		o3.start();
		o4.start();
		o5.start();
	
	
	
	
	
	}

}
