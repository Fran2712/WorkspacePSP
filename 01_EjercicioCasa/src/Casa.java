import java.util.ArrayList;

public class Casa {

	private double superficie;
	private ArrayList<Habitacion> habitaciones;
	private Persona due�o;
	private ArrayList<Persona> inquilinos;

	public Casa(double superficie, ArrayList<Habitacion> habitaciones, Persona due�o, ArrayList<Persona> inquilinos) {
		this.superficie = superficie;
		this.habitaciones = habitaciones;
		this.due�o = due�o;
		this.inquilinos = inquilinos;
	}

	@Override
	public String toString() {
		String res = "";
		String hab = "";
		String due = "";
		String in = "";

		for (int i = 0; i < this.habitaciones.size(); i++) {

			hab += " " + this.habitaciones.get(i).getCantidad() + ", " + this.habitaciones.get(i).getMetros2() + "m2 "
					+ ", " + this.habitaciones.get(i).getTpHabitacion() + ", ";

		}
		due = this.due�o.getNombre() + ", " + this.due�o.getEdad() + ", " + this.due�o.getTelefono();

		for (int i = 0; i < this.inquilinos.size(); i++) {
			in += i + " " + this.inquilinos.get(i).getNombre() + ", "
					+ this.inquilinos.get(i).getDireccion().getTipoVia() + ", "
					+ this.inquilinos.get(i).getDireccion().getNombrevia() + ", ";
		}

		res = "Superficie: " + this.superficie + ", Habitaciones: " + hab + ", Due�o: " + due + ", Inquilinos: " + in;

		return res;
	}

}
