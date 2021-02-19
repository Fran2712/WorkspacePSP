package com.restpersona.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restpersona.modelo.entidad.Persona;
import com.restpersona.modelo.persistencia.DaoPersona;

@Service
public class GestorPersona {

	@Autowired
	private DaoPersona daoPersona;

	public List<Persona> listar() {

		List<Persona> lista = daoPersona.findAll();
		return lista;
	}

	public Persona obtenerPersona(int id) {
		Optional<Persona> opt = daoPersona.findById(id);
		if (opt.isPresent()) {

			return opt.get();
		} else {
			return null;
		}

	}

	public Persona altaPersona(Persona p) {
		if (p.getNombre().length() < 3) {
			return null;
		}
		Persona po = daoPersona.save(p);

		return po;

	}

	public Persona modificar(Persona p) {
		if (p.getNombre().length() < 3) {
			return null;
		}
		// save sirve para guardar y para modificar
		Persona po = daoPersona.save(p);
		return p;
	}

	public boolean borrar(int id) {
		if (daoPersona.findById(id).isPresent()) {
			daoPersona.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

}
