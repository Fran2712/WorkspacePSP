package fj.ejercicio2;

public class JefeProyecto extends Trabajador {
	@Override
	public String toString() {
		return "Soy Jefe de proyecto, me llamo " + getNombre() + ", y cobro " + getSueldoBase() + " Euros al mes";
	}

	@Override
	public void run() {
		System.out.println(toString());
		
	}

}
