import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Habitacion>habitaciones1 = new ArrayList<Habitacion>();
		ArrayList<Habitacion>habitaciones2 = new ArrayList<Habitacion>();
		
		ArrayList<Persona>inquilinos1 = new ArrayList<Persona>();
		ArrayList<Persona>inquilinos2 = new ArrayList<Persona>();
		
		Persona vanessa = new Persona("vanessa", 22, "652657846", new Direccion("Avenida", "Olímpica", "28355"));
		Persona silvia = new Persona("Silvia", 19, "652658846", new Direccion("Calle", "rosales", "28955"));
		Persona tristan = new Persona("Tristan", 26, "695657846", new Direccion("Avenida", "Olímpica", "28675"));
		Persona finn = new Persona("Finn", 22, "652655846", new Direccion("Paseo", "de las Rosas", "28955"));
		Persona jack = new Persona("Jack", 19, "652667846", new Direccion("Calle", "de la Mata", "28955"));
		Persona cristina = new Persona("Cristina", 26, "695214846", new Direccion("Avenida", "pleb", "28675"));
		
		inquilinos1.add(tristan);
		inquilinos1.add(silvia);
		
		inquilinos2.add(finn);
		inquilinos2.add(jack);
		
		habitaciones1.add(new Habitacion( TipoHabitacion.COCINA, 1, 20));
		habitaciones1.add(new Habitacion( TipoHabitacion.BAÑO, 2, 5));
		habitaciones1.add(new Habitacion( TipoHabitacion.SALON, 1, 50));
		habitaciones1.add(new Habitacion( TipoHabitacion.DORMITORIO, 3, 15));
		
		habitaciones2.add(new Habitacion( TipoHabitacion.COCINA, 1, 20));
		habitaciones2.add(new Habitacion( TipoHabitacion.BAÑO, 1, 7));
		habitaciones2.add(new Habitacion( TipoHabitacion.SALON, 1, 50));
		habitaciones2.add(new Habitacion( TipoHabitacion.DORMITORIO, 1, 15));
		
		Casa casa1 = new Casa(210, habitaciones1, vanessa, inquilinos1);
		Casa casa2 = new Casa(200, habitaciones2, cristina, inquilinos2);
		
		System.out.println(casa1.toString());
		System.out.println("===================================");
		System.out.println(casa2.toString());
		
	}

}
