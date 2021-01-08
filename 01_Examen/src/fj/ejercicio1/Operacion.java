package fj.ejercicio1;

public class Operacion extends Thread{
	
	private int numero;
	
	public Operacion(int numero) {
		this.numero = numero;
	}
	
	@Override
	public void run() {
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
	}
	
	public int calcularFactorial(int numero) {
		int res = 1;
		for (int i = 1; i < numero; i++) {
			res = res *i;
		}
		res = res *numero;
		return res;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
