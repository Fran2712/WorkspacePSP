package fj.ejercicio2;

public class Director extends Trabajador{
	
	public double incentivo;
	
	@Override
	public void run() {
		System.out.println(toString());
		
	}
	
	@Override
	public String toString() {
		return "Soy el Director " + getNombre() + " y cobro " + (getSueldoBase()+getIncentivo()) + " Euros al mes";
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	
}
