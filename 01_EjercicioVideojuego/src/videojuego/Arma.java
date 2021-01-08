package videojuego;

public abstract class Arma {
	
	private double da�o;
	private String tipo;
	private String nombre;
	
	
	public abstract void usar(Personaje p);
	
	

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
	
	
}
