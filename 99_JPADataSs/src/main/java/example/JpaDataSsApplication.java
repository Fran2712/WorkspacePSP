package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import example.modelo.entidad.Pelicula;
import example.modelo.repositorio.DaoPelicula;

@SpringBootApplication
public class JpaDataSsApplication {
	
	public static ApplicationContext context = null;
	public static void main(String[] args) {
		context =SpringApplication.run(JpaDataSsApplication.class, args);
		Pelicula p = new Pelicula();
//		p.setId(1);
//		p.setAnio(2020);
//		p.setDirector("Yuki Tabata");
//		p.setTitulo("Fate/Stay Night: Heaven's feel III: Spring Song");
		
		DaoPelicula dao = context.getBean("daoPelicula",DaoPelicula.class);
		Pelicula p2 = dao.findById(1).get();
		System.out.println(p2);
		
		p2 = dao.findByTitulo("Fate/Stay Night: Heaven's feel III: Spring Song");
		System.out.println(p2);
	}

}
