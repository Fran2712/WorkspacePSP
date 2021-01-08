package videojuego;

public class Espada extends Arma{
	
	private double daño;
	private String tipo;
	private String nombre;
	
	
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
	
	@Override
	public void usar(Personaje p) {
		System.out.println("Mi: " + nombre + " del tipo '"+tipo + "' ha hecho un daño de: " + daño );
	}
	

	
}
