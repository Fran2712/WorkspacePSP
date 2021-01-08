package example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import example.modelo.entidad.Equipo;
import example.modelo.entidad.Jugador;
import example.modelo.persistencia.DaoEquipo;

@SpringBootApplication
public class JpaDataSsRelacionesApplication {
	public static ApplicationContext context = null;
	public static void main(String[] args) {
		context =SpringApplication.run(JpaDataSsRelacionesApplication.class, args);	
		
		DaoEquipo daoEquipo = context.getBean("daoEquipo", DaoEquipo.class);
		
		Equipo e1 = context.getBean("equipo",Equipo.class);
		Jugador j1 = context.getBean("jugador", Jugador.class);
		Jugador j2 = context.getBean("jugador", Jugador.class);
		
		e1.setCiudad("Fuyuki");
		e1.setNombre("Sekaijuu maho");
		
		j1.setDorsal(7);
		j1.setNombre("Serresiete");
		j1.setEquipo(e1);

		j2.setDorsal(10);
		j2.setNombre("Messi Pechofrio");
		j2.setEquipo(e1);
		List<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(j1);
		jugadores.add(j2);
		
		e1.setJugadores(jugadores);
		daoEquipo.save(e1);
	
	}

}
