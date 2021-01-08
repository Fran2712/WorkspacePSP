package videojuego;

import java.util.Scanner;

public class Batalla {

	public static void empezarBatalla(Personaje p1, Personaje p2) {
		int contador = 0;
		Scanner in = new Scanner(System.in);
		while (p1.getVida() <= 0 || p2.getVida() <= 0) {
			if (contador == 0) {
				System.out.println("Qué quiere hacer P1:");
				System.out.println("Atacar(1) - Curar(2)");
				int s = in.nextInt();
				if (s== 1) {
					p1.atacar(p2);
				} else if (s==2) {
					p1.curar();
				}
				contador++;
			} else {
				System.out.println("Qué quiere hacer P2:");
				System.out.println("Atacar(1) - Curar(2)");
				int s = in.nextInt();
				if (s== 1) {
					p2.atacar(p1);
				} else if (s==2) {
					p2.curar();
				}
				contador--;
			}
		}
		
	}

}
