package ejSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketSvr {

	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";

	public static final int SUMA = 1;
	public static final int RESTA = 2;
	public static final int MULTIPLICACION = 3;
	public static final int DIVISION = 4;

	public static void main(String[] args) throws InterruptedException {

		System.out.println("      APLICACI�N DE SERVIDOR      ");
		System.out.println("----------------------------------");

		ServerSocket servidorSocket = null;
		Socket socketConexion = null;
		PrintStream salida = null;
		InputStreamReader entrada = null;
		Boolean cont = true;
		int estado = 0;
		try {
			servidorSocket = new ServerSocket();
			InetSocketAddress direccion = new InetSocketAddress(IP_SERVER, PUERTO);
			servidorSocket.bind(direccion);

			while (cont) {
				if (estado == 0) {

					System.out.println("SERVIDOR: Esperando peticion...");
					socketConexion = servidorSocket.accept();
					entrada = new InputStreamReader(socketConexion.getInputStream());
					BufferedReader bf = new BufferedReader(entrada);

					String stringRecibido = bf.readLine();

					System.out.println("SERVIDOR: Me ha llegado del cliente: " + stringRecibido);

					String[] operadores = stringRecibido.split("-");

					int iNumero1 = Integer.parseInt(operadores[0]);
					int iNumero2 = Integer.parseInt(operadores[1]);
					int ioperacion = Integer.parseInt(operadores[2]);
					int resultado = 0;
					String res = "";

					switch (ioperacion) {
					case SUMA:
						resultado = iNumero1 + iNumero2;
						break;
					case RESTA:
						resultado = iNumero1 - iNumero2;
						break;

					case MULTIPLICACION:
						resultado = iNumero1 * iNumero2;
						break;

					case DIVISION:
						resultado = iNumero1 / iNumero2;
						break;
					default:
						resultado = 0;
						break;
					}
					salida = new PrintStream(socketConexion.getOutputStream());
					salida.println(resultado);
					estado = 1;
				} else {

					System.out.println("SERVIDOR: Esperando respuesta...");
					socketConexion = servidorSocket.accept();
					entrada = new InputStreamReader(socketConexion.getInputStream());
					BufferedReader bf2 = new BufferedReader(entrada);

					String stringRecibido2 = bf2.readLine();

					System.out.println("SERVIDOR: Me ha llegado del cliente: " + stringRecibido2);

					if (stringRecibido2.equalsIgnoreCase("no")) {
						cont = false;
						
					}
				}
			}
		} catch (IOException excepcion) {
			System.out.println(excepcion);
		} finally {
			try {
				if (salida != null && entrada != null) {
					salida.close();
					entrada.close();
					socketConexion.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}