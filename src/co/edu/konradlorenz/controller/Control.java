package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Ventana;
import java.util.ArrayList;

public class Control {
	protected Corrida objCorrida = new Corrida();
	protected Plaza objPlaza = new Plaza();
	protected Torero objTorero = new Torero();
	protected Toro objToro = new Toro();
	protected Ganaderia objGanaderia = new Ganaderia();
	
	ArrayList<Corrida> listaCorridas = new ArrayList<>();
	ArrayList<Plaza> listaPlazas = new ArrayList<>();
	ArrayList<Torero> listaToreros = new ArrayList<>();
	ArrayList<Toro> listaToros = new ArrayList<>();
	ArrayList<Ganaderia> listaGanaderias = new ArrayList<>();

	public void run() {
		byte opc = 0;
		do {
			opc = Ventana.mostrarMenu();
			switch(opc) {
				case 1:
					Ventana.mostrarMensaje("- - AGREGAR CORRIDA - -");
					agregarCorrida();
					break;
				case 2:
					Ventana.mostrarMensaje("- - MOSTRAR CORRIDAS - -");
					mostrarCorridas();
					break;
				case 3:
					Ventana.mostrarMensaje("- - CORRIDAS POR FERIA - -");
					mostrarCoFeria();
					break;
				case 4:
					Ventana.mostrarMensaje("Esta saliendo, adiós");
					break;
				default:
					Ventana.mostrarMensaje("Opción no válida");
			}
		}while(opc != 4);
	}
	
	public void agregarCorrida() {
		int numOrden, anioCelebracion;
		String feria, nombrePlaza;
		numOrden = Ventana.pedirInt("el número de orden");
		feria = Ventana.pedirDato("la feria");
		anioCelebracion = Ventana.pedirInt("el año de celebración");
		nombrePlaza = Ventana.pedirDato("el nombre de la plaza");
		Plaza plaza = agregarPlaza(nombrePlaza);
		objCorrida = new Corrida(numOrden, feria, anioCelebracion, new ArrayList<>(), new ArrayList<>(), plaza);
		listaCorridas.add(objCorrida);
		Ventana.mostrarMensaje("Corrida agregada con éxito");
	}
	
	public Plaza agregarPlaza(String nombre) {

		for (Plaza plaza : listaPlazas) {
	        if (plaza.getNombre().equalsIgnoreCase(nombre)) {
	            return plaza;
	        }
	    }
		
	    String localidad = Ventana.pedirDato("la localidad");
	    String direccion = Ventana.pedirDato("la dirección");

	    Plaza nuevaPlaza = new Plaza(nombre, localidad, direccion);
	    listaPlazas.add(nuevaPlaza);

	    Ventana.mostrarMensaje("Plaza agregada con éxito");
	    return nuevaPlaza;
}

	public void mostrarCorridas() {
		if(listaCorridas.isEmpty()){
			Ventana.mostrarMensaje("No hay corridas");
		}else {
			for(int i =0; i<listaCorridas.size(); i++) {
				Ventana.mostrarMensaje((i+1)+": "+ listaCorridas.get(i).toString());
			}
		}
		gestionCorridas();
	}
	
	public void mostrarCoFeria() {
		String feria = Ventana.pedirDato("la feria");
		for (int i=0; i<listaCorridas.size(); i++) {
			if(listaCorridas.get(i).getFeria().equalsIgnoreCase(feria)) {
				Ventana.mostrarMensaje((i+1)+": "+ listaCorridas.get(i).toString());
			}
		}
		gestionCorridas();
	}

	public void gestionCorridas() {
		byte corrida = (byte)((Ventana.pedirInt("la corrida a la que desea acceder "))-1);
		byte opc = 0;
		do{
			opc = Ventana.gestionarCorrida();
			switch(opc) {
				case 1:
					Ventana.mostrarMensaje("- - AGREGAR TORERO - -");
					agregarTorero(corrida);
					break;
				case 2:
					Ventana.mostrarMensaje("- - VER TOREROS - -");
					mostrarToreros(corrida);
					break;
				case 3:
					Ventana.mostrarMensaje("- - AGREGAR TORO - -");
					agregarToro(corrida);
					break;
				case 4:
					Ventana.mostrarMensaje("- - VER TORO - -");
					mostrarToros(corrida);
					break;
				case 5:
					run();
				default:
					Ventana.mostrarMensaje("Opción no válida");
			}
		}while(opc != 5);
	}
	
	public void agregarTorero(byte Corrida) {
		String nombre, cedula, apodo, fechaAlter, padrino;
		nombre = Ventana.pedirDato("el nombre");
		cedula = Ventana.pedirDato("la cédula");
		apodo = Ventana.pedirDato("el apodo");
		fechaAlter = Ventana.pedirDato("la fecha alternatica (DD/MM/AAAA)");
		padrino = Ventana.pedirDato("el nombre del padrino");
		
		objTorero = new Torero(nombre, cedula, apodo, fechaAlter, objTorero, null, Corrida, Corrida, false);
		listaToreros.add(objTorero);
		
		
	}
	
	public Torero agregarPadrino(String nombre) {

		for (Torero torero : listaToreros) {
			if (torero.getNombre().equalsIgnoreCase(nombre)) {
				return torero;
			}
		}

		Ventana.mostrarMensaje("Agregar nuevo torero: ");
		String cedula = Ventana.pedirDato("la cédula");

		Torero nuevoTorero = new Torero(nombre, cedula);
		listaToreros.add(nuevoTorero);

		Ventana.mostrarMensaje("Torero agregado con éxito");
		return nuevoTorero;
		
		
	}
	
	public void mostrarToreros(byte corrida) {
		if(corrida >= 0 && corrida < listaCorridas.size()) {
			Corrida corridaSel = listaCorridas.get(corrida);
			ArrayList<Torero> listaTorerosC = corridaSel.getListaToreros();
			
			if(listaTorerosC.isEmpty()) {
				Ventana.mostrarMensaje("No hay toreros es la corrida");
			} else {
				for(int i=0; i<listaTorerosC.size(); i++) {
					Torero torero = listaTorerosC.get(i);
					Ventana.mostrarMensaje((i+1)+". "+ torero.mostrarDatos());
				}
			}
		}
	}

	public Ganaderia agregarGanaderia(int codigo) {
		for (Ganaderia ganaderia : listaGanaderias) {
			if (ganaderia.getCodigo() == codigo) {
				return ganaderia;
			}
		}

		Ventana.mostrarMensaje("Agregar nueva ganaderia: ");
		
		String localidad, antiguedad;
		localidad = Ventana.pedirDato("la localidad");
		antiguedad = Ventana.pedirDato("la antiguedad (DD/MM/AAAA)");
		objGanaderia = new Ganaderia(codigo, localidad, antiguedad);
		listaGanaderias.add(objGanaderia);
		Ventana.mostrarMensaje("Ganadería agregada con éxito");
		return objGanaderia;
	}
	
	public void agregarToro(byte corrida) {
		if(corrida >= 0 && corrida < listaCorridas.size()) {
			Corrida corridaSel = listaCorridas.get(corrida);
			int codigo, anioNac, numOrden, codGanaderia;
			String nombre, color;
			codigo = Ventana.pedirInt("el código");
			anioNac = Ventana.pedirInt("el año de nacicimiento");
			numOrden = Ventana.pedirInt("el número de orden");
			nombre = Ventana.pedirDato("el nombre");
			color = Ventana.pedirDato("el color");
			codGanaderia = Ventana.pedirInt("el codigo de la ganadería");
			Ganaderia ganaderia = agregarGanaderia(codGanaderia);
			objToro = new Toro(codigo, anioNac, numOrden, nombre, color, ganaderia);
			corridaSel.agregarToro(objToro);
			listaToros.add(objToro);
			Ventana.mostrarMensaje("Toro agregado con éxito a la corrida");
		}			
	}		
	
	
	public void mostrarToros(byte corrida) {
		if(corrida >= 0 && corrida < listaCorridas.size()) {
			Corrida corridaSel = listaCorridas.get(corrida);
			ArrayList<Toro> listaTorosC = corridaSel.getListaToros();
			
			if(listaTorosC.isEmpty()) {
				Ventana.mostrarMensaje("No hay toros en la corrida");
			}else {
				for(int i =0; i<listaToros.size(); i++) {
					Toro toro = listaToros.get(i);
					Ventana.mostrarMensaje((i+1)+". "+ toro.toString());
				}
			}
		}
	}
}
