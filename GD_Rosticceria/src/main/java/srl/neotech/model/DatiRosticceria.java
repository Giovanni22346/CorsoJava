package srl.neotech.model;

import java.util.ArrayList;

public class DatiRosticceria {

	
	private static DatiRosticceria instance;
	
	public ArrayList<Ordine> ordini= new ArrayList <Ordine>();
	public ArrayList<Prodotto> listino = new ArrayList<Prodotto>();
	
	
	
	public ArrayList<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(ArrayList<Ordine> ordini) {
		this.ordini = ordini;
	}

	public ArrayList<Prodotto> getListino() {
		return listino;
	}

	public void setListino(ArrayList<Prodotto> listino) {
		this.listino = listino;
	}

	public static void setInstance(DatiRosticceria instance) {
		DatiRosticceria.instance = instance;
	}

	private DatiRosticceria ()  {
		
		
	}

	public static DatiRosticceria getInstance() {
		
		
		
		if (instance==null) instance = new DatiRosticceria();
		return instance;
		
		
	}
	
}

