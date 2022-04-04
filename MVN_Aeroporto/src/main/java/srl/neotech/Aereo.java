package srl.neotech;

import java.util.ArrayList;

public class Aereo {

	private Integer idUnivoco;
	private int orario;
	private String compagniaAerea;
	private Modello modello;
	private Integer velocita;
	private Integer distanzaDallAeroporto;
	private StatoAereo stato;
	private ArrayList<Passeggero>passeggeriAereo=new ArrayList<Passeggero>();
	
	

	public Modello getModello() {
		return modello;
	}
		
	

	public Integer getIdUnivoco() {
		return idUnivoco;
	}


	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}



	public int getOrario() {
		return orario;
	}



	public void setOrario(int orario) {
		this.orario = orario;
	}



	public String getCompagniaAerea() {
		return compagniaAerea;
	}



	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}



	public Integer getVelocita() {
		return velocita;
	}



	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}



	public Integer getDistanzaDallAeroporto() {
		return distanzaDallAeroporto;
	}



	public void setDistanzaDallAeroporto(Integer distanzaDallAeroporto) {
		this.distanzaDallAeroporto = distanzaDallAeroporto;
	}




	public StatoAereo getStato() {
		return stato;
	}


	public void setStato(StatoAereo stato) {
		this.stato = stato;
	}




	public ArrayList<Passeggero> getPasseggeriAereo() {
		return passeggeriAereo;
	}




	public void setPasseggeriAereo(ArrayList<Passeggero> passeggeriAereo) {
		this.passeggeriAereo = passeggeriAereo;
	}






	public void setModello(Modello modello) {
		this.modello = modello;
	}






	@Override
	public String toString() {
	return this.getIdUnivoco()+"--"+this.getStato()+"--"+this.getOrario()+"--"+this.getCompagniaAerea()+"--"+this.getModello().getCostruttore()+"--"+this.getModello().getCodiceModello()+"--"+this.getModello().getCapienzaNumPasseggeri()+"--"+this.getDistanzaDallAeroporto()+"--"+this.getVelocita();
	}



	

	}



			
		
	


		
	
	

