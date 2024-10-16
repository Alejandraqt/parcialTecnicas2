package co.edu.konradlorenz.model;

public class Toro {

	private int codigo;
	private int anioNacimiento;
	private int numeroOrden;
	private String nombre;
	private String color;
	private Ganaderia ganaraderia;
	
	public Toro() {
	}
	
	public Toro(int codigo, int anioNacimiento, int numeroOrden, String nombre, String color, Ganaderia ganaraderia) {
		this.codigo = codigo;
		this.anioNacimiento = anioNacimiento;
		this.numeroOrden = numeroOrden;
		this.nombre = nombre;
		this.color = color;
		this.ganaraderia = ganaraderia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public int getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Ganaderia getGanaraderia() {
		return ganaraderia;
	}

	public void setGanaraderia(Ganaderia ganaraderia) {
		this.ganaraderia = ganaraderia;
	}

	@Override
	public String toString() {
		return "Toro [codigo=" + codigo + ", anioNacimiento=" + anioNacimiento + ", numeroOrden=" + numeroOrden
				+ ", nombre=" + nombre + ", color=" + color + ", ganaraderia=" + ganaraderia + "]";
	}

}

