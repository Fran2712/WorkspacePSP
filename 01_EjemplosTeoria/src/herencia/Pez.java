package herencia;

public abstract class Pez extends Animal{

	private int branquias;
	private int aletas;
	
	@Override
	public void comer(Object comida) {
		if (comida instanceof Plancton) { // si me estas pasando un plancton
			Plancton comida2 = (Plancton) comida;
			System.out.println("Soy el pez " + nombre + " y me voy un plancton que tiene " + comida2.getNutrientes()  + " nutrientes");
		}else {
			System.out.println("Puaj no me des caca!!!!!!!!");
		}
	}

	public int getBranquias() {
		return branquias;
	}

	public void setBranquias(int branquias) {
		this.branquias = branquias;
	}

	public int getAletas() {
		return aletas;
	}

	public void setAletas(int aletas) {
		this.aletas = aletas;
	}
	
	
}
