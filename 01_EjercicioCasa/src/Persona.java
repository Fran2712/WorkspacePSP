
public class Persona {
	
	private String nombre;
	private int edad;
	private String telefono;
	private Direccion direccion;
	
	public Persona(String nombre, int edad, String telefono, Direccion direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}
	
	
}
