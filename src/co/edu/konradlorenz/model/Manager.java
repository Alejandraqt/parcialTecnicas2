package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class Manager extends Persona{

	private String direccion;
	private long telefono;
	private ArrayList<Torero> listaToreros = new ArrayList<>();
	
	public Manager() {
		super();
	}
	
	public Manager(String direccion, long telefono, ArrayList<Torero> listaToreros) {
		super();
		this.direccion = direccion;
		this.telefono = telefono;
		this.listaToreros = listaToreros;
	}

	public Manager(String nombre, String cedula) {
		super(nombre, cedula);
	}

	public Manager(String nombre, String cedula ,String direccion, long telefono, ArrayList<Torero> listaToreros) {
		super(nombre, cedula);
		this.direccion = direccion;
		this.telefono = telefono;
		this.listaToreros = listaToreros;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public ArrayList<Torero> getListaToreros() {
		return listaToreros;
	}

	public void setListaToreros(ArrayList<Torero> listaToreros) {
		this.listaToreros = listaToreros;
	}

	@Override
	public String toString() {
		return "Manager [direccion=" + direccion + ", telefono=" + telefono + "]";
	}

	@Override
	public String mostrarDatos() {
		return "Datos Manager: \n"
				+ "Nombre: "+ getNombre()
				+ "Cedula: "+ getCedula()
				+ "Direccion: "+ direccion
				+ "Telefono: "+ telefono
				+ "Lista de toreros apoderados: "+ listaToreros;
	}

	
	
}
