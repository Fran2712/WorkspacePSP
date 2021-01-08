import java.util.Date;

public class HiloPrimo implements Runnable {
	
	private long numero;
	
	
	public HiloPrimo(long numero) {
		this.numero = numero;
	}


	@Override
	public void run() {
		
		Date f = new Date();
		Long t1 = f.getTime();
		int contador = 0;
		for(long i = numero; i > 0; i--){
		    if(numero % i == 0 ){
		        contador++;
		    }
		}
		if(contador == 2){                           
		   System.out.println("el numero " + numero + " es Primo");
		}else {
			 System.out.println("el numero " + numero + " no ses Primo");
		}
		Date l = new Date();
		Long t2 = l.getTime();
		
		System.out.println("El hilo ha tardado "+ Thread.currentThread().getName() + (t2-t1) + " milisegundos");
		
	}

}
