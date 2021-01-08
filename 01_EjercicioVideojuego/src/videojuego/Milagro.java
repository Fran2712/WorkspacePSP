package videojuego;

public class Milagro extends Arma {
	
	private double daño;
	private String tipo;
	private String nombre;

	
	public double getDaño() {
		return daño;
	}


	public void setDaño(int daño) {
		this.daño = daño;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public void usar(Personaje p) {
		System.out.println("Mi: " + nombre + tipo + " Ha hecho un daño de: " + daño );
		
	}

}
