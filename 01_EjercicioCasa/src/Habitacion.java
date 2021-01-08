	
public class Habitacion {
	
	private TipoHabitacion tpHabitacion;
	private int cantidad;
	private double metros2;
	
	public Habitacion(TipoHabitacion tpHabitacion, int cantidad, double metros2) {
		this.tpHabitacion = tpHabitacion;
		this.cantidad = cantidad;
		this.metros2 = metros2;
	}

	public TipoHabitacion getTpHabitacion() {
		return tpHabitacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getMetros2() {
		return metros2;
	}
	
	
}
