package co.edu.konradlorenz.model;

public class Torero extends Persona implements Premio {


	private String apodo;
	private String fechaAlternativa;
	private Torero padrino;
	private Manager apoderado;
	private int orejas;
	private int rabos;
	private boolean puertaGrande;
	
	public Torero() {
		super();
	}

	public Torero(String apodo, String fechaAlternativa, Torero padrino, Manager apoderado, int orejas, int rabos,
			boolean puertaGrande) {
		super();
		this.apodo = apodo;
		this.fechaAlternativa = fechaAlternativa;
		this.padrino = padrino;
		this.apoderado = apoderado;
		this.orejas = orejas;
		this.rabos = rabos;
		this.puertaGrande = puertaGrande;
	}
	
	public Torero(String nombre, String cedula) {
		super(nombre, cedula);
	}
	
	public Torero(String nombre, String cedula, String apodo, String fechaAlternativa, Torero padrino, Manager apoderado, int orejas, int rabos,
			boolean puertaGrande) {
		super(nombre, cedula);
		this.apodo = apodo;
		this.fechaAlternativa = fechaAlternativa;
		this.padrino = padrino;
		this.apoderado = apoderado;
		this.orejas = orejas;
		this.rabos = rabos;
		this.puertaGrande = puertaGrande;
	}

	
	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getFechaAlternativa() {
		return fechaAlternativa;
	}

	public void setFechaAlternativa(String fechaAlternativa) {
		this.fechaAlternativa = fechaAlternativa;
	}

	public Torero getPadrino() {
		return padrino;
	}

	public void setPadrino(Torero padrino) {
		this.padrino = padrino;
	}

	public Manager getApoderado() {
		return apoderado;
	}

	public void setApoderado(Manager apoderado) {
		this.apoderado = apoderado;
	}

	public int getOrejas() {
		return orejas;
	}

	public void setOrejas(int orejas) {
		this.orejas = orejas;
	}

	public int getRabos() {
		return rabos;
	}

	public void setRabos(int rabos) {
		this.rabos = rabos;
	}

	public boolean isPuertaGrande() {
		return puertaGrande;
	}

	public void setPuertaGrande(boolean puertaGrande) {
		this.puertaGrande = puertaGrande;
	}

	
	@Override
	public String toString() {
		return "Torero [apodo=" + apodo + ", fechaAlternativa=" + fechaAlternativa + ", padrino=" + padrino
				+ ", apoderado=" + apoderado + ", orejas=" + orejas + ", rabos=" + rabos + ", puertaGrande="
				+ puertaGrande + "]";
	}

	@Override
	public String mostrarDatos() {
		String puerta = "";
		
		if(puertaGrande()) {
        	puerta = "El torero salio por la puerta grande.";
        }else {
        	puerta = "El torero no salio por la puerna grande.";
        }
        
		
		return "Datos Torero: \n"
				+ "Nombre: "+ getNombre()
				+ "Cedula: "+ getCedula()
				+ "Apodo: "+ apodo
				+ "Fecha alternativa: "+ fechaAlternativa
				+ "Padrino: "+ padrino
				+ "Apoderado: "+ apoderado
				+ "Premios"
				+ "Orejas: "+ cantidadOrejas()
				+ "Rabos: "+ cantidadRabos()
				+ puerta;
		
	}

	@Override
	public int cantidadOrejas() {
		return orejas;
	}

	@Override
	public int cantidadRabos() {
		return rabos;
	}

	@Override
	public boolean puertaGrande() {
		return false;
	}
	
}
