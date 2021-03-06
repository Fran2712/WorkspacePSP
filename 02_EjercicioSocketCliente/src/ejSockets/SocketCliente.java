package ejSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketCliente {
	
	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";
	
	public static void main(String[] args) {
		System.out.println("        APLICACIÓN CLIENTE");
		System.out.println("-----------------------------------");
		
		Socket socketCliente = null;
		InputStreamReader entrada = null;
		PrintStream salida = null;
		Scanner sc = new Scanner(System.in);
		
		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);
		boolean est = true;
		try {
			socketCliente = new Socket();
			socketCliente.connect(direccionServidor);
			System.out.println("Conexion establecida... a " + IP_SERVER + " por el puerto "
					+ PUERTO);
			while (est) {
			entrada = new InputStreamReader(socketCliente.getInputStream());
			salida = new PrintStream(socketCliente.getOutputStream());
			
			
				System.out.println("CLIENTE: Introduzca los numeros a: 1.sumar 2.restar 3.multiplicar 4.dividir");
				String numero1 = sc.nextLine();
				String numero2 = sc.nextLine();
				String operacion = sc.nextLine();
				
				String operandos = numero1 + "-" + numero2 + "-" + operacion;
				salida.println(operandos);
				BufferedReader bf = new BufferedReader(entrada);
				String resultado = bf.readLine();
				
				System.out.println("CLIENTE: " + resultado);
				
				System.out.println("CLIENTE: Desea hacer otra operacion?");
				
				String res = sc.nextLine();
				entrada = new InputStreamReader(socketCliente.getInputStream());
				salida.println(res);
				if (res.equalsIgnoreCase("no")) {
					est = false;
				}
			}
			
			
		} catch (Exception e) {
			System.err.println("Error: " + e);
			e.printStackTrace();
		}finally {		
			try {
				salida.close();
				entrada.close();
				socketCliente.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
