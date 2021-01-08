package fj.ejercicio2;

public class Programador extends Trabajador {
	
	@Override
	public String toString() {
		return "Soy Programador, me llamo " + getNombre() + ", y cobro " + getSueldoBase() + " Euros al mes";
	}

	@Override
	public void run() {
		System.out.println(toString());
		
	}

}
