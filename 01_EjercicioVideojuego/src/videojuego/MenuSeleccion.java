package videojuego;

import java.util.Scanner;

public class MenuSeleccion {
	public static Personaje seleccionarPers() {
		Scanner in = new Scanner(System.in);
		int seleccion = in.nextInt();
		Personaje p = null;
		switch (seleccion) {
		case 1:
			p = new Guerrero();
			p.setAtributo(7);
			p.setNombre("Arturo");
			p.setVida(1000);
			
			break;
		case 2:
			p = new Mago();
			p.setAtributo(7);
			p.setNombre("Big Hat Logan");
			p.setVida(500);
			
			break;
		case 3:
			p = new Clerigo();
			p.setAtributo(5);
			p.setNombre("Solaire");
			p.setVida(800);
			break;

		}

		return p;

	}

	public static Arma seleccionarArma() {
		Scanner in = new Scanner(System.in);
		int seleccion = in.nextInt();
		Arma a=null;
		switch (seleccion) {
		case 1:
			a = new Espada();
			a.setDaño(140);
			a.setNombre("Excalibur");
			a.setTipo("Espadón");
			break;
		case 2:
			a = new Hechizo();
			a.setDaño(50);
			a.setNombre("Flecha de Alma");
			a.setTipo("Hechizo simple");
			break;
		case 3:
			a = new Milagro();
			a.setDaño(90);
			a.setNombre("Lanza Relámpago");
			a.setTipo("Milagro de Reámpago");
			break;
//		case 4:
//			a = new Arco();
//			a.setDaño(daño);
//			a.setNombre(nombre);
//			a.setTipo(tipo);
//			break;

		}
		return a;
	}

}
