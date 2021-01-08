package javabean;

public class Persona {
	private String nombre;
	private int edad;
	private double estatura;
	private Direccion direccion;
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", direccion=" + direccion
				+ "]";
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		} else {
			this.edad=0;
		}
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public double getEstatura() {
		return estatura;
	}
	
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
}
