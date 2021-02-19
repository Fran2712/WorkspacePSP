package com.rest.modelo.entidad;

public class Videojuego {
	private int ID, precio;
	private String nombre, compañia;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
