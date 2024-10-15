package co.edu.konradlorenz.model;

public class Ganaderia {
	
	private int codigo;
	private String localidad;
	private String antiguedad;
	

	public Ganaderia() {
	
	}
	
	
	public Ganaderia(int codigo, String localidad, String antiguedad) {
		super();
		this.codigo = codigo;
		this.localidad = localidad;
		this.antiguedad = antiguedad;
	}

	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public String toString() {
		return "Ganaderia [codigo=" + codigo + ", localidad=" + localidad + ", antiguedad=" + antiguedad + "]";
	}

}
