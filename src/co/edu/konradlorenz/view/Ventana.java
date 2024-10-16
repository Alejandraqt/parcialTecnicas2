package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Ventana {

	private static Scanner leer = new Scanner(System.in);

	public static byte mostrarMenu() {
		System.out.println("- - - - - - M E N Ú - - - - - -");
		System.out.println("1. Agregar Corrida");
		System.out.println("2. Mostrar Corridas");
		System.out.println("3. Mostrar Corridas por Feria");
		System.out.println("4. Salir");
		System.out.println("Seleccione una opción: ");
		byte opcion = leer.nextByte();
		leer.nextLine();
		return opcion;
	}
	
	public static byte gestionarCorrida() {
		System.out.println("- - - - - - - - - - - - - - - -");
		System.out.println("1. Agregar Torero");
		System.out.println("2. Ver Toreros");
		System.out.println("3. Agregar Toro");
		System.out.println("4. Ver Toros");
		System.out.println("5. Volver");
		System.out.println("Seleccione una opción: ");
		byte opcion = leer.nextByte();
		leer.nextLine();
		return opcion;
	}
	
	public static void mostrarMensaje(String mensaje) {		
		System.out.println(mensaje);
	}
	
	public static String pedirDato(String dato) {		
		System.out.println("Por favor ingrese "+dato+": ");
		String datoRecibido = leer.nextLine();
		return datoRecibido;
	}
	
	public static int pedirInt(String dato) {		
		System.out.println("Por favor ingrese "+dato+": ");
		int datoRecibido = leer.nextInt();
		return datoRecibido;
	}
}
