package srl.neotech;

import java.util.ArrayList;

public class Aereo extends Aeroporto{

	private Integer idUnivoco;
	private int orario;
	private String compagniaAerea;
	private Modello modello;
	private Integer velocita;
	private Integer distanzaDallAeroporto;
	private StatoAereo stato;
	private ArrayList<Passeggero>passeggeriAereo=new ArrayList<Passeggero>();
	
	
	
		
	
	
	public Integer getDistanzaDallAeroporto() {
		return distanzaDallAeroporto;
	}




	public void setDistanzaDallAeroporto(Integer distanzaDallAeroporto) {
		this.distanzaDallAeroporto = distanzaDallAeroporto;
	}




	public ArrayList<Passeggero> getPasseggeriAereo() {
		return passeggeriAereo;
	}




	public void setPasseggeriAereo(ArrayList<Passeggero> passeggeriAereo) {
		this.passeggeriAereo = passeggeriAereo;
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






	
		
//		if (velocita ==0 && distanzaDallAeroporto ==0);
//		setStato(StatoAereo.IN_PARTENZA);
//		velocita++;
//		
//		
//		if (distanzaDallAeroporto >0 && distanzaDallAeroporto<getRaggioDiAzione());
//		setStato(StatoAereo.DECOLLATO);
//		velocita++;
//		
//		if (getRaggioDiAzione()>=0 && getRaggioDiAzione() > distanzaDallAeroporto);
//		setStato(StatoAereo.IN_AVVICINAMENTO);
//		velocita--;
//		
//		if (distanzaDallAeroporto >getRaggioDiAzione());
//		setStato(StatoAereo.FUORI_SPAZIO_AEREO);
//		velocita++;
//		
		
		Passeggero passeggeriAereo1=new Passeggero();
		
	
	
	
	










	public StatoAereo getStato() {
		return stato;
	}




	public void setStato(StatoAereo stato) {
		this.stato = stato;
	}




	public Aereo() {
		
		modello =new Modello();
		
	}
	
	
	
		
		
		
	 
	
	

	@Override
	public String toString() {
	return this.getIdUnivoco()+"--"+this.getStato()+"--"+this.getOrario()+"--"+this.getCompagniaAerea()+"--"+this.getModello().getCostruttore()+"--"+this.getModello().getCodiceModello()+"--"+this.getModello().getCapienzaNumPasseggeri()+"--"+this.getPasseggeriAereo()+"--"+this.getDistanzaDallAeroporto()+"--"+this.getVelocita();
	}




	public Modello getModello() {
		return modello;
	}




	public void setModello(Modello modello) {
		this.modello = modello;
	}




	public Integer getVelocita() {
		return velocita;
	}




	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	



	

	}
}


			
		
	


		
	
	

