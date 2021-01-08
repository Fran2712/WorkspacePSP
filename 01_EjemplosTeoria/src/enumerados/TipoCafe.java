package enumerados;

//los objetos estan predefinidos desde el comienzo del programa

//VENTAJA: es una coleccion ordenada
public enum TipoCafe {
	// objetos:
	SOLO(1), CON_LECHE(8.50), EXPRESSO(9.90), LATTE(1.50), CARAJILLO(1.20), CAPUCCINO(2.6);
	// NO SE PUEDEN CREAR OBJETOS DE TIPOCAFE
	
	private double precio;
	private TipoCafe(double precio) {
		this.precio = precio;
	}
	public double getPrecio() {
		return this.precio;
				
	}
}
