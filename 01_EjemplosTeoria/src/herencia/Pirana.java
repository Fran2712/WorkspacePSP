package herencia;

import javabean.Persona;

public class Pirana extends Pez {

	@Override
	public void comer(Object comida) {
		// TODO Auto-generated method stub

		if (comida instanceof Persona) {
			Persona p = (Persona) comida;
			System.out.println("Soy la piraña " + nombre + " y me voy a zampar a la persona " + p.getNombre());
		} else {
			System.out.println("solo como Personas 🙃");
		}

	}
}
