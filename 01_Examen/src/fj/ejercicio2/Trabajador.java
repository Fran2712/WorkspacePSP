package fj.ejercicio2;

public abstract class Trabajador implements Runnable {
	
	private String nombre;
	private int sueldoBase;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	
}
