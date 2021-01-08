package herencia;

public abstract class Animal {
	protected String nombre;
	protected double peso;
	
	public abstract void comer(Object comida);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
		
	
}
