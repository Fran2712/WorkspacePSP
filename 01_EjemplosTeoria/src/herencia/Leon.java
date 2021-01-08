package herencia;

public class Leon extends Animal {

	private int patas;
	
	@Override
	public void comer(Object comida) {
		if (comida instanceof Animal) {
			Animal a = (Animal) comida;
			System.out.println("Soy el leon " + nombre + " y me voy a comer al animal "+ comida.getClass().getSimpleName() + " que se llama" + a.getNombre());
		} else {
			System.out.println("DIOS NO ME DES ESTA " + comida.getClass().getSimpleName() + " DE MIERDA");
		}
		// comida.getClass().getSimpleName() devuelve el nombre de la clase a la que pertenece el objeto
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

}
