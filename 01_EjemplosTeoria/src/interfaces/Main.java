package interfaces;

public class Main {

	public static void main(String[] args) {
		// con una referencia puedo apuntar a cualquier objeto de una

		Imprimible i = new ImprimirFichero();
		Imprimible i2 = new ImprimirPorPantalla();

		usarImprimir(i);
		usarImprimir(i2);
	}

	public static void usarImprimir(Imprimible i) {
		i.imprimir("Esta es la FRASE");
	}
}
