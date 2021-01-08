package herencia;

import java.util.ArrayList;
import java.util.List;

public class MainH  {

	public static void main(String[] args) {
		Trucha t = new Trucha();
		t.setNombre("Godofredo");
		t.setBranquias(2);
		t.setPeso(2);
		t.setAletas(2);
		
		Pirana p = new Pirana();
		p.setNombre("olivia");
		p.setAletas(2);
		p.setPeso(2);
		p.setBranquias(1);
		
		Leon l = new Leon();
		l.setNombre("petilde");
		l.setPatas(4);
		l.setPeso(250);
		
		//Podemos crear clases anonimas.
		//ej. Necesito crear un oso pero no tengo una clase oso creada:
		
		Animal a = new Animal() {
			
			@Override
			public void comer(Object comida) {
				if (comida instanceof Pez) {
					System.out.println("Soy el oso " + nombre + " y voy a comer un pez :)");
				}else {
					System.out.println("Soy un oso no un pussy");
				}
				
			}
		}; 
		a.setNombre("Yogui");
		a.setPeso(450);
		
		List<Animal> listaanimales = new ArrayList<Animal>();
		listaanimales.add(a);
		listaanimales.add(t);
		listaanimales.add(p);
		listaanimales.add(l);
		
		Plancton planc = new Plancton();
		planc.setNutrientes(15);
		
		t.comer(planc);
		p.comer(planc);
		
		for (Animal animal : listaanimales) {
			animal.comer(planc);
		}
	}

}
