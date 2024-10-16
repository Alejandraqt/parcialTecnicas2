package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class Corrida {

	private int numeroOrden;
	private String feria;
	private int anioCelebracion;
	private ArrayList<Torero> listaToreros = new ArrayList<>();
	private ArrayList<Toro> listaToros = new ArrayList<>();
	private Plaza plaza;
	
	
	public Corrida() {
	}

	public Corrida(int numeroOrden, String feria, int anioCelebracion, ArrayList<Torero> listaToreros,
			ArrayList<Toro> listaToros, Plaza plaza) {
		this.numeroOrden = numeroOrden;
		this.feria = feria;
		this.anioCelebracion = anioCelebracion;
		this.listaToreros = listaToreros;
		this.listaToros = listaToros;
		this.plaza = plaza;
	}


	public int getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public String getFeria() {
		return feria;
	}

	public void setFeria(String feria) {
		this.feria = feria;
	}

	public int getAnioCelebracion() {
		return anioCelebracion;
	}

	public void setAnioCelebracion(int anioCelebracion) {
		this.anioCelebracion = anioCelebracion;
	}

	public ArrayList<Torero> getListaToreros() {
		return listaToreros;
	}

	public void setListaToreros(ArrayList<Torero> listaToreros) {
		this.listaToreros = listaToreros;
	}
	

	public ArrayList<Toro> getListaToros() {
		return listaToros;
	}

	public void setListaToros(ArrayList<Toro> listaToros) {
		this.listaToros = listaToros;
	}

	public Plaza getPlaza() {
		return plaza;
	}

	public void setPlaza(Plaza plaza) {
		this.plaza = plaza;
	}

	@Override
	public String toString() {
		return "Corrida [numeroOrden=" + numeroOrden + ", feria=" + feria + ", anioCelebracion=" + anioCelebracion
				 + plaza + "]";
	}

    public void agregarTorero(Torero torero) {
        if (listaToreros.size() < 3) {
            listaToreros.add(torero);
        } else {
            String a = "No se pueden agregar más toreros. El límite es 3.";
        }
    }

    public void agregarToro(Toro toro) {
        listaToros.add(toro);
    }

    
}