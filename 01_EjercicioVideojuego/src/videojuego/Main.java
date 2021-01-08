package videojuego;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Personaje p1= new Guerrero();
//		Arma a1 = new Espada();
//		a1.setDaño(140);
//		a1.setNombre("Excalibur");
//		a1.setTipo("Espada Corta");
//			
//		p1.setArma(a1);
//		p1.setAtributo(3);
//		p1.setNombre("Rey Arturo");
//		p1.setVida(100);
//		
//		Personaje p2= new Clerigo();
//		Arma a2 = new Espada();
//		a2.setDaño(90);
//		a2.setNombre("Espada de Astora");
//		a2.setTipo("Espada recta");
//			
//		p2.setArma(a2);
//		p2.setAtributo(4);
//		p2.setNombre("Solaire de Astora");
//		p2.setVida(1);
//		
//		p1.atacar(p2);
		
		System.out.println("Jugador 1: Selecciona un personaje");
		System.out.println("Gerrero(1) - Mago(2) - Clerigo(3)");
		Personaje p1 = MenuSeleccion.seleccionarPers();
		System.out.println("Jugador 1: Selecciona un Arma");
		System.out.println("Espada(1) GUERRERO↑↑ - Hechizo(2)MAGO↑↑ - Milagro(3)CLERIGO↑↑ - Arco(4)GUERRERO↑↑");
		Arma a1 = MenuSeleccion.seleccionarArma();
		p1.setArma(a1);
		System.out.println("Jugador 2: Selecciona un personaje");
		System.out.println("Gerrero(1) - Mago(2) - Clerigo(3)");
		Personaje p2 = MenuSeleccion.seleccionarPers();
		System.out.println("Jugador 2: Selecciona un Arma");
		System.out.println("Espada(1) GUERRERO↑↑ - Hechizo(2)MAGO↑↑ - Milagro(3)CLERIGO↑↑ - Arco(4)GUERRERO↑↑");
		Arma a2 = MenuSeleccion.seleccionarArma();
		p2.setArma(a2);
		Batalla.empezarBatalla(p1,p2);
		
	}
	
}
