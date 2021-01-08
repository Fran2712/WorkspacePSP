package example.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import example.modelo.entidad.Pelicula;

@Repository
public interface DaoPelicula extends JpaRepository<Pelicula, Integer> {
	public Pelicula findByTitulo(String s);
}
