package co.edu.konradlorenz.model;

public abstract class Persona {
	
	private String nombre;
	private String cedula;
	
	protected Persona() {
	}
	
	protected Persona(String nombre, String cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
		
	public abstract String mostrarDatos(); 
}
