package com.criptografia.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	private String nombre;
	private String pass;
	
	public Usuario(String nombre, String pass) {
		this.nombre = nombre;
		this.pass = pass;
	}
	
	
	public Usuario() {

	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
}
