package srl.neotech;

import java.util.ArrayList;

public class Aeroporto {

	//Attributi Aeroporto

	private ArrayList <Aereo> listaAereiInPartenza = new ArrayList <Aereo>();
	private ArrayList <Aereo> listaAereiInArrivo = new ArrayList <Aereo>();
    private ArrayList <Passeggero> listaPasseggeri = new ArrayList<Passeggero>();	
	private Integer raggioDiAzione;
	

	
	

	public ArrayList<Aereo> getListaAereiInPartenza() {
		return listaAereiInPartenza;
	}

	public void setListaAereiInPartenza(ArrayList<Aereo> listaAereiInPartenza) {
		this.listaAereiInPartenza = listaAereiInPartenza;
	}

	public ArrayList<Aereo> getListaAereiInArrivo() {
		return listaAereiInArrivo;
	}

	public void setListaAereiInArrivo(ArrayList<Aereo> listaAereiInArrivo) {
		this.listaAereiInArrivo = listaAereiInArrivo;
	}

	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}

	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}

	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}

	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}

	
	
	
	public Aereo atterra(Aereo aereo) {
	
		aereo.setStato(StatoAereo.IN_AVVICINAMENTO);
		return aereo;
		
		
	}
	
	public Aereo decolla(Aereo aereo) {
		aereo.setStato(StatoAereo.IN_PARTENZA);
		return aereo;
		
		
	}
	
	public Passeggero checkin (Passeggero passeggero) {
		passeggero.setStatoPasseggero(StatoPasseggero.IN_CHECKIN);
		return passeggero;
		
	}	

	
	public Passeggero checkout (Passeggero passeggero) {
		passeggero.setStatoPasseggero(StatoPasseggero.IMBARCATO );
		return passeggero;
		
	}
		
		
		
	}
	
	
	
	
	
	

