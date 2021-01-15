package com.rest.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.modelo.entidad.Videojuego;

@RestController
public class ControladorVJ {
	private Videojuego v;
	
	@PostMapping("videojuego")
	public String obtenerJuego() {
		v = new Videojuego();
		v.setID(1);
		v.setCompañia("FROM SOFTWARE");
		v.setNombre("Bloodborne");
		v.setPrecio(20);
		return "Videojuego Creado";
	}
	@GetMapping("videojuego")
	public Videojuego obVie() {
		return v;
	}
	
	
	@PutMapping("videojuego")
	public String modificarJuego() {
		v.setPrecio(v.getPrecio()+ 10);
		return "Precio Cambiado";
	}
}
