package com.criptografia;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

import javax.swing.text.StringContent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.criptografia.modelo.entidad.Usuario;
import com.criptografia.modelo.repositorio.DaoUsuario;

@SpringBootApplication
public class Application {

	public static ApplicationContext context = null;

	public static void main(String[] args) throws NoSuchAlgorithmException {
		context = SpringApplication.run(Application.class, args);
		Scanner in = new Scanner(System.in);
		DaoUsuario daoUsuario = context.getBean("daoUsuario", DaoUsuario.class);
		System.out.println("Que quieres hacer:\n 1- alta usuario\n 2- login usuario \n 0-salir");

		int res = Integer.parseInt(in.nextLine());
		while (res != 0) {

			switch (res) {
			case 1:
				System.out.println("escriba el nombre de usuario:");
				String usuario = in.nextLine();
				System.out.println("escriba la contraseña:");
				String contraseña = in.nextLine();

				//
				byte[] bycont = contraseña.getBytes();
				MessageDigest md = MessageDigest.getInstance("SHA-512");
				md.update(bycont);
				byte[] rsu = md.digest();
				String passHash = Base64.getEncoder().encodeToString(rsu);
				//

				Usuario u = new Usuario(usuario, passHash);
				daoUsuario.save(u);
				break;
			case 2:
				System.out.println("escriba el nombre de usuario:");
				String usuarioIntro = in.nextLine();
				System.out.println("escriba la contraseña:");
				String contraseñaIntro = in.nextLine();
				Usuario p = daoUsuario.findBynombre(usuarioIntro);
				
				//
				byte[] bycontintroducida = contraseñaIntro.getBytes();
				MessageDigest md2 = MessageDigest.getInstance("SHA-512");
				md2.update(bycontintroducida);
				byte[] rsu2 = md2.digest();
				String passHash2 = Base64.getEncoder().encodeToString(rsu2);
				//
				
				if (passHash2.equals(p.getPass())) {
					System.out.println("Ha iniciado Sesion Correctamente");
				} else {
					System.out.println("ERROR: Contraseña o usuario incorrecto");
				}

				break;
			case 0:

				break;

			default:
				break;
			}
			System.out.println("Escriba la opcion");
			res = Integer.parseInt(in.nextLine());
		}

	}

}
