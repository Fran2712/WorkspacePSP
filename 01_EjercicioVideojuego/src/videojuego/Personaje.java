package videojuego;

public abstract class Personaje {
	
	private String nombre;
	private Arma arma;
	private int atributo; 
	private double vida;
	
	public abstract void atacar(Personaje p);
	public abstract void curar();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getAtributo() {
		return atributo;
	}

	public void setAtributo(int atributo) {
		this.atributo = atributo;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}
	
	
}
