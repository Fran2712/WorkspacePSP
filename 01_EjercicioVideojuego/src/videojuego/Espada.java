package videojuego;

public class Espada extends Arma{
	
	private double da�o;
	private String tipo;
	private String nombre;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDa�o() {
		return da�o;
	}
	public void setDa�o(double da�o) {
		this.da�o = da�o;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void usar(Personaje p) {
		System.out.println("Mi: " + nombre + " del tipo '"+tipo + "' ha hecho un da�o de: " + da�o );
	}
	

	
}
