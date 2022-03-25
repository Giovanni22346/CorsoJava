package srl.neotech.academy;

import java.util.ArrayList;

public class Associato {

	
	private Integer idAssociato;
	private String nominativo;
	private Stato stato;
	private ArrayList<Associato> IdLibriPresi;
	
	
	
	
	
	public Integer getIdAssociato() {
		return idAssociato;
	}
	public void setIdAssociato(Integer idAssociato) {
		this.idAssociato = idAssociato;
	}
	public String getNominativo() {
		return "nominativo"+ nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public String getStato() {
		return "stato"+stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public ArrayList<Associato> getIdLibriPresi() {
		return IdLibriPresi;
	}
	public void setIdLibriPresi(ArrayList<Associato> idLibriPresi) {
		IdLibriPresi = idLibriPresi;
	}
	
	@Override
	public String toString() {
		return this.getIdAssociato()+"--"+this.getNominativo()+"--"+this.getStato();
	}



	
	
}
