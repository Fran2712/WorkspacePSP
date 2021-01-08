package javabean;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Direccion d1 = new Direccion();
		
		p1.setNombre("Naruto-kun");
		p1.setEdad(28);
		p1.setEstatura(1.70);
		
		// los numeros que empiezan con 0 tienen su base en octal
		// los numeros que empiezan en 0x tienen su base en hexadecimal
		// los numeros que empiezan en 0b tienen su base en hexadecimal
		
		
		p1.setDireccion(d1);
		d1.setCiudad("Konoha");
		System.out.println(p1.getDireccion().getCiudad());
		p1.getDireccion().setCodPostal("28933");
		System.out.println(d1.getCodPostal());
		
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		Persona p2 = new Persona();
		p2.setNombre("Sasuke");
		listaPersona.add(p2);
		System.out.println(listaPersona);
		listaPersona.get(0).setNombre("pcolo");
		Persona p3 = p2;
		p3.setNombre("Sasaki");
		System.out.println(listaPersona.get(0).getNombre());
		
	}

}
