package videojuego;

import java.util.concurrent.ThreadLocalRandom;

public class Guerrero extends Personaje {

	private String nombre;
	private Arma arma;
	private int fuerza;
	private double vida;

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public void atacar(Personaje p) {
		double da�oAdicional;
		double bonusFuerza;
		double da�oBase;
		double da�oTotal=0;
		if (p.getVida()<= 0) {
			System.out.println("El caballero: " + p.getNombre() + " est� muerto");
		} else {
			if (arma instanceof Hechizo || arma instanceof Milagro) {
				da�oBase = arma.getDa�o() * 0.75;
			} else {
				bonusFuerza = arma.getDa�o() * (fuerza / 100);
				da�oBase = arma.getDa�o() + bonusFuerza;
			}
			if (p instanceof Mago) {
				da�oAdicional = 0.85;
				da�oTotal =da�oBase * da�oAdicional ;
				arma.setDa�o(da�oTotal);

			} else if (p instanceof Clerigo) {
				da�oAdicional = 1.5;
				da�oTotal = da�oBase * da�oAdicional;
				arma.setDa�o(da�oTotal);
			}else {
				da�oTotal = da�oBase;
			}
			//ThreadLocalRandom.current().nextInt(rangoA,rangoB);
			//para numero aleatorio 
			System.out.println("El " + this.getClass().getSimpleName()+ " " + this.nombre + " ha atacado al " +p.getClass().getSimpleName()  +" "+ p.getNombre());
			arma.usar(p);
			p.setVida(p.getVida()-da�oTotal);
			
			if (p.getVida()<= 0) {
				System.out.println(p.getNombre() + " : " + 0);
				System.out.println("El caballero: " + p.getNombre() + " ha muerto a manos de " + this.nombre);
				
			} else {
				System.out.println(p.getNombre() + " : " + p.getVida());
				System.out.println(nombre + " : " + vida);
			}
			
		}
		
	}

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

	@Override
	public void curar() {
		this.vida = this.vida + 50;
		
	}

}
