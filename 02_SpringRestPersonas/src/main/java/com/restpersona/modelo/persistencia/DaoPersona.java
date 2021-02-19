package com.restpersona.modelo.persistencia;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restpersona.modelo.entidad.Persona;

@Repository
public interface DaoPersona extends JpaRepository<Persona, Integer> {

}
