package videojuego;

public class Clerigo extends Personaje {

	private String nombre;
	private Arma arma;
	private int fe;
	private double vida;

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

	public int getFe() {
		return fe;
	}

	public void setFe(int fe) {
		this.fe = fe;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	@Override
	public void atacar(Personaje p) {
		double da�oAdicional;
		double bonusFuerza;
		double da�oBase;
		double da�oTotal = 0;

		if (p.getVida() <= 0) {
			System.out.println("El caballero: " + p.getNombre() + " est� muerto");

		} else {

			if (arma instanceof Hechizo || arma instanceof Arco || arma instanceof Espada) {
				da�oBase = arma.getDa�o() * 0.75;
			} else {
				bonusFuerza = arma.getDa�o() * (fe / 100);
				da�oBase = arma.getDa�o() + bonusFuerza;
			}
			if (p instanceof Guerrero) {
				da�oAdicional = 0.85;
				da�oTotal = da�oBase * da�oAdicional;
				arma.setDa�o(da�oTotal);

			} else if (p instanceof Mago) {
				da�oAdicional = 1.5;
				da�oTotal = da�oBase * da�oAdicional;
				arma.setDa�o(da�oTotal);
			} else {
				da�oTotal = da�oBase;
			}
			System.out.println("El " + this.getClass().getSimpleName() + " " + this.nombre + " ha atacado al "
					+ p.getClass().getSimpleName() + " " + p.getNombre());
			arma.usar(p);
			p.setVida(p.getVida() - da�oTotal);

			if (p.getVida() <= 0) {
				System.out.println(p.getNombre() + " : " + 0);
				System.out.println("El caballero: " + p.getNombre() + " ha muerto a manos de " + this.nombre);

			} else {
				System.out.println(p.getNombre() + " : " + p.getVida());
				System.out.println(nombre + " : " + vida);
			}
		}

	}

	@Override
	public void curar() {
		this.vida = this.vida + 50;

	}

}
