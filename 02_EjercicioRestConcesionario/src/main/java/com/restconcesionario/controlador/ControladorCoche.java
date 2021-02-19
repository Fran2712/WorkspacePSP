package com.restconcesionario.controlador;

import java.util.List;
import java.util.Optional;

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

import com.restconcesionario.modelo.entidad.Coche;
import com.restconcesionario.modelo.negocio.GestorCoches;
import com.restconcesionario.modelo.persistencia.DaoCoche;

@RestController
public class ControladorCoche {
	@Autowired
	private GestorCoches gp;

	@GetMapping("coches")
	public ResponseEntity<List<Coche>> listar() {
		List<Coche> lista = gp.listarCoches();
		ResponseEntity<List<Coche>> re = new ResponseEntity<List<Coche>>(lista, HttpStatus.OK);
		return re;
	}

	@GetMapping("coches/{id}")
	public ResponseEntity<Coche> obtener(@PathVariable("id") int id) {// 1
		Coche p = gp.buscarPorId(id);
		HttpStatus codigoRespuesta = null;
		if (p != null) {
			codigoRespuesta = HttpStatus.OK;
		} else {
			codigoRespuesta = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Coche> re = new ResponseEntity<Coche>(p, codigoRespuesta);
		return re;
	}

	@PostMapping("coches")
	public ResponseEntity<Coche> alta(@RequestBody Coche csr) {
	
		Coche car = gp.alta(csr);
		HttpStatus codigoRespuesta = null;
		if (car != null) {
			codigoRespuesta = HttpStatus.CREATED;
		} else {
			codigoRespuesta = HttpStatus.BAD_REQUEST;
		}
		ResponseEntity<Coche> re = new ResponseEntity<Coche>(car, codigoRespuesta);
		return re;
	}

	@PutMapping("coches/{id}")
	public ResponseEntity<Coche> modificar(@RequestBody Coche car, @PathVariable("id") int id) {
		car.setId(id);

		Coche pModificado = gp.modificar(car);
		HttpStatus codigoRespuesta = null;
		if (pModificado != null) {
			codigoRespuesta = HttpStatus.OK;
		} else {
			codigoRespuesta = HttpStatus.BAD_REQUEST;
		}

		ResponseEntity<Coche> re = new ResponseEntity<Coche>(pModificado, codigoRespuesta);
		return re;
	}
	@DeleteMapping("coches/{id}")
	public ResponseEntity<Integer> borrar(@PathVariable("id") int id){
		boolean borrado = gp.borrar(id);
		HttpStatus codigoRespuesta = null;
		if(borrado) {
			codigoRespuesta = HttpStatus.OK;
		}else {
			codigoRespuesta = HttpStatus.BAD_REQUEST;
		}

		return new ResponseEntity<Integer>(id,codigoRespuesta);
	}

}
