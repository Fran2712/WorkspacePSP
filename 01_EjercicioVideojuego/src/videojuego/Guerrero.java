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
		double dañoAdicional;
		double bonusFuerza;
		double dañoBase;
		double dañoTotal=0;
		if (p.getVida()<= 0) {
			System.out.println("El caballero: " + p.getNombre() + " está muerto");
		} else {
			if (arma instanceof Hechizo || arma instanceof Milagro) {
				dañoBase = arma.getDaño() * 0.75;
			} else {
				bonusFuerza = arma.getDaño() * (fuerza / 100);
				dañoBase = arma.getDaño() + bonusFuerza;
			}
			if (p instanceof Mago) {
				dañoAdicional = 0.85;
				dañoTotal =dañoBase * dañoAdicional ;
				arma.setDaño(dañoTotal);

			} else if (p instanceof Clerigo) {
				dañoAdicional = 1.5;
				dañoTotal = dañoBase * dañoAdicional;
				arma.setDaño(dañoTotal);
			}else {
				dañoTotal = dañoBase;
			}
			//ThreadLocalRandom.current().nextInt(rangoA,rangoB);
			//para numero aleatorio 
			System.out.println("El " + this.getClass().getSimpleName()+ " " + this.nombre + " ha atacado al " +p.getClass().getSimpleName()  +" "+ p.getNombre());
			arma.usar(p);
			p.setVida(p.getVida()-dañoTotal);
			
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
