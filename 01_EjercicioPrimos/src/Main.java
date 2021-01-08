
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("intodzca 3 numeros");
		System.out.println("Numero 1:");
		long num1 = in.nextLong();
		System.out.println("Numero 2:");
		long num2 = in.nextLong();
		System.out.println("Numero 3:");
		long num3 = in.nextLong();
		
		
		HiloPrimo h1 = new HiloPrimo(num1);
		HiloPrimo h2 = new HiloPrimo(num2);
		HiloPrimo h3 = new HiloPrimo(num3);
		
		Thread t1 = new Thread(h1,"hilo1");
		Thread t2 = new Thread(h2,"hilo2");
		Thread t3 = new Thread(h3,"hilo3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Calculando...");
		
	}

}
