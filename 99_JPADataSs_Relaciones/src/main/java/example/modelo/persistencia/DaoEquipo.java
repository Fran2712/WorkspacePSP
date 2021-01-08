package example.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.modelo.entidad.Equipo;

@Repository
public interface DaoEquipo extends JpaRepository<Equipo, Integer> {

}
