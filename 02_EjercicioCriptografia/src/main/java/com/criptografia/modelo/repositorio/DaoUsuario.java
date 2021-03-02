package com.criptografia.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criptografia.modelo.entidad.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, String>{
	public Usuario findBynombre(String nombre); 
}
