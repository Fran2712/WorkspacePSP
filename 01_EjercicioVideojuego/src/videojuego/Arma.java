package videojuego;

public abstract class Arma {
	
	private double daño;
	private String tipo;
	private String nombre;
	
	
	public abstract void usar(Personaje p);
	
	

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDaño() {
		return daño;
	}

	public void setDaño(double daño) {
		this.daño = daño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
