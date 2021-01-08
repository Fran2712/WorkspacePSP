package fj.ejercicio2;

public class Main {

	public static void main(String[] args) {
		Programador prog = new Programador();
		prog.setNombre("Pepe");
		prog.setSueldoBase(500);
		
		JefeProyecto bossu = new JefeProyecto();
		bossu.setNombre("Gimodeo");
		bossu.setSueldoBase(3000);
		
		Director dire = new Director();
		dire.setNombre("Amancio");
		dire.setSueldoBase(5000);
		dire.setIncentivo(835.2);
		
		Thread t1 = new Thread(prog);
		Thread t2 = new Thread(bossu);
		Thread t3 = new Thread(dire);
	
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
