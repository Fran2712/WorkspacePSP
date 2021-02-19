package com.restconcesionario.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restconcesionario.modelo.entidad.Coche;
import com.restconcesionario.modelo.persistencia.DaoCoche;

@Service
public class GestorCoches {

	@Autowired
	private DaoCoche daoCoche;

	/**
	 * Método que lista todos los coches guardados en la Base de Datos
	 * 
	 * @return lista con todos los coches
	 */
	public List<Coche> listarCoches() {
		List<Coche> lista = daoCoche.findAll();
		return lista;
	}

	/**
	 * Método que busca en la base de datos un objeto Coche dado un id
	 * 
	 * @param id a buscar
	 * @return objeto coche con dicho id, si no existe devuelve null
	 */
	public Coche buscarPorId(int id) {
		Optional<Coche> opt = daoCoche.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}

	/**
	 * Metodo que añade un coche a la base de datos
	 * 
	 * @param car el objeto coche a guardar
	 * @return el coche guardado
	 */
	public Coche alta(Coche car) {
		Coche c = null;
		if (Integer.parseInt(car.getPotencia()) < 0) {
			return null;
		} else {
			try {
				c = daoCoche.save(car);
			} catch (Exception e) {
				c = null;
			}
			return c;
		}

	}

	public Coche modificar(Coche car) {
		Coche c = daoCoche.save(car);
		return c;
	}

	/**
	 * Metodo que borra un coche dado un id
	 * 
	 * @param id del coche a borrar
	 * @return boolean true si se ha borrado, false si no se ha borrado
	 */
	public boolean borrar(int id) {
		if (daoCoche.findById(id).isPresent()) {
			daoCoche.deleteById(id);
			return true;
		} else {
			return false;
		}

	}

}
