package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Ventana {

	private static Scanner leer = new Scanner(System.in);

	public static byte mostrarMenu() {
		System.out.println("---");
		
		byte opcion = leer.nextByte();
		
		return opcion;
	}
	
	public static void mostrarMensaje(String mensaje) {		
		System.out.println(mensaje);
	}
	
	public static String pedirDato(String dato) {		
		System.out.println(dato+": ");
		String datoRecibido = leer.nextLine();
		return datoRecibido;
	}
	
}
