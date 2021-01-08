package videojuego;

public class Milagro extends Arma {
	
	private double da�o;
	private String tipo;
	private String nombre;

	
	public double getDa�o() {
		return da�o;
	}


	public void setDa�o(int da�o) {
		this.da�o = da�o;
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
		System.out.println("Mi: " + nombre + tipo + " Ha hecho un da�o de: " + da�o );
		
	}

}
