package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Ventana;
import java.util.ArrayList;

public class Control {
	protected Corrida objCorrida = new Corrida();
	protected Plaza objPlaza = new Plaza();
	protected Torero objTorero = new Torero();
	
	ArrayList<Corrida> listaCorridas = new ArrayList<>();
	ArrayList<Plaza> listaPlazas = new ArrayList<>();
	ArrayList<Torero> listaToreros = new ArrayList<>();

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
					//mostrarCoFeria();
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
		int nO, aC;
		String f, nP;
		nO = Ventana.pedirInt("el número de orden");
		f = Ventana.pedirDato("la feria");
		aC = Ventana.pedirInt("el año de celebración");
		nP = Ventana.pedirDato("el nombre de la plaza");
		Plaza plaza = agregarPlaza(nP);
		objCorrida = new Corrida(nO, f, aC, new ArrayList<>(), new ArrayList<>(), plaza);
		listaCorridas.add(objCorrida);
		Ventana.mostrarMensaje("Corrida agregada con éxito");
	}
	
	public Plaza agregarPlaza(String nombre) {

		for (Plaza plaza : listaPlazas) {
	        if (plaza.getNombre().equalsIgnoreCase(nombre)) {
	            return plaza;
	        }
	    }
		
		Ventana.mostrarMensaje("Agregar nueva plaza: ");
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
			if(listaCorridas.get(i).getFeria().equalsIgnoreVase(feria)) {
				Ventana.mostrarMensaje((i+1)+": "+ listaCorridas.get(i).toString();
			}
		}
		gestionCorridas();
	}
	
	public void gestionCorridas() {
		byte corrida = (byte)((Ventana.pedirInt("Seleccione la corrida que desea ver: "))-1);
		byte opc = 0;
		do{
			opc = Ventana.gestionarCorrida();
			switch(opc) {
				case 1:
					Ventana.mostrarMensaje("- - AGREGAR TORERO - -");
					agregarTorero();
					break;
				case 2:
					Ventana.mostrarMensaje("- - VER TOREROS - -");
					mostrarToreros();
					break;
				case 3:
					Ventana.mostrarMensaje("- - AGREGAR TORO - -");
					//agregarToro();
					break;
				case 4:
					Ventana.mostrarMensaje("- - VER TORO - -");
					//mostrarToros(corrida);
					break;
				case 5:
					run();
				default:
					Ventana.mostrarMensaje("Opción no válida");
			}
		}while(opc != 5);
	}
	
	
	
	public void agregarTorero() {
		String n, c, a, fA, p;
		n = Ventana.pedirDato("el nombre");
		c = Ventana.pedirDato("la cédula");
		a = Ventana.pedirDato("el apodo");
		fA = Ventana.pedirDato("la fecha alternatica (DD/MM/AAAA)");
		objTorero = new Torero(n, c, a, fA, null, null, 0, 0, false);
		listaToreros.add(objTorero);
		p = Ventana.pedirDato("el nombre del padrino");
		
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
	
	public void mostrarToreros() {
		
	}
}
