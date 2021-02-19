package com.restpersona.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restpersona.modelo.entidad.Persona;
import com.restpersona.modelo.negocio.GestorPersona;
import com.restpersona.modelo.persistencia.DaoPersona;

@RestController
public class ControladorPersona {

	@Autowired
	private GestorPersona gp;

	@GetMapping("personas")
	public ResponseEntity<List<Persona>> listar() {
		List<Persona> lista = gp.listar();
		ResponseEntity<List<Persona>> re = new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
		return re;

	}

	@GetMapping("persona/{id}")
	public ResponseEntity<Persona> obtener(@PathVariable("id") int id) {
		HttpStatus ps = null;
		Persona p = gp.obtenerPersona(id);
		if (p != null) {
			ps = HttpStatus.OK;
		} else {
			ps = HttpStatus.NOT_FOUND;
		}
		ResponseEntity<Persona> re = new ResponseEntity<Persona>(p, ps);
		return re;
	}

	@PostMapping("personas")
	public ResponseEntity<Persona> alta(@RequestBody Persona p) {
		Persona pi = gp.altaPersona(p);
		HttpStatus ps = null;
		if (pi != null) {
			ps = HttpStatus.CREATED;
		} else {
			ps = HttpStatus.BAD_REQUEST;
		}

		ResponseEntity<Persona> re = new ResponseEntity<Persona>(p, ps);

		return re;
	}

	@PutMapping("persona/{id}")
	public ResponseEntity<Persona> modificar(@RequestBody Persona p, @PathVariable("id") int id) {
		p.setId(id);
		Persona pi = gp.altaPersona(p);
		HttpStatus ps = null;
		if (pi != null) {
			ps = HttpStatus.OK;
		} else {
			ps = HttpStatus.BAD_REQUEST;
		}
		ResponseEntity<Persona> re = new ResponseEntity<Persona>(p, ps);
		return re;
	}

	@DeleteMapping("persona/{id}")
	public ResponseEntity<Integer> borrar(@PathVariable("id") int id) {
		boolean borrado = gp.borrar(id);
		HttpStatus ps = null;
		if (borrado) {
			ps = HttpStatus.OK;
		} else {
			ps = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<Integer>(id, ps);
		

	}

}
