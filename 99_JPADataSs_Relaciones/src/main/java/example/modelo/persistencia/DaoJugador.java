package example.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.modelo.entidad.Equipo;
import example.modelo.entidad.Jugador;

@Repository
public interface DaoJugador extends JpaRepository<Jugador, Integer> {

}
