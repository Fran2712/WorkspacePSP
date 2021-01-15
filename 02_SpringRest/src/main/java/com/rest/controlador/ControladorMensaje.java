package com.rest.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.modelo.entidad.Persona;

@RestController
public class ControladorMensaje {
	
	private String mensaje = "Mensaje de prueba";
	
	@GetMapping("mensaje")
	public String obtenerMensaje() {
		return mensaje;
	}
//	@GetMapping(value = "HTML", produces = "text/html")
//	public String obtenerll() {
//		StringBuffer sb = new StringBuffer();;
//		sb.append("<html>");
//		return "Mensaje de prueba";
//	}
	@GetMapping("persona")
	public Persona obtenerPersona() {
		Persona p = new Persona();
		p.setNombre("Emiya");
		p.setApellido("Shirou");
		return p;
	}
	
	@PutMapping("mensaje")
	public String modificarMensaje() {
		mensaje = "mensaje modificado";
		return "OK";
	}
	
}
