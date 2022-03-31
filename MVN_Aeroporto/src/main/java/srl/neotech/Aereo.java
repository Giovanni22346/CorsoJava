package srl.neotech;


public class Aereo {

	private Integer idUnivoco;
	private Integer orario;
	private String compagniaAerea;
	private Modello modello;
	private Integer velocita;
	private Integer distanzaDallaAeroporto;
	private StatoAereo stato;
	
	
	public Integer getIdUnivoco() {
		return idUnivoco;
	}




	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}




	public Integer getOrario() {
		return orario;
	}




	public void setOrario(Integer orario) {
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




	public Integer getDistanzaDallaAeroporto() {
		return distanzaDallaAeroporto;
	}




	public void setDistanzaDallaAeroporto(Integer distanzaDallaAeroporto) {
		this.distanzaDallaAeroporto = distanzaDallaAeroporto;
	}




	public StatoAereo getStato() {
		return stato;
	}




	public void setStato(StatoAereo stato) {
		this.stato = stato;
	}




	public Aereo() {
		
		setModello(new Modello());
		
	}
	
	
	
	
	public String inPartenza(Integer distanzaDallAeroporto, Integer velocita) {
		this.velocita=velocita-distanzaDallAeroporto;
		return "Aereo in Partenza!" + velocita;
		
		
	}
	
	public String decollato(Integer distanzaDallAeroporto, Integer velocita) {
		this.velocita=velocita+velocita+distanzaDallAeroporto;
		return "Aereo decollato!"+ velocita;
		
		
		
	}
	
	public String inAvvicinamento(Integer distanzaDallAreoporto, Integer velocita) {
		this.velocita= velocita-velocita-distanzaDallAreoporto;
		return "Aereo in Avvicinamento!"+velocita;
		
	}
	
	public String atterrato(Integer distanzaDallAreoporto, Integer velocita) {
		this.velocita= velocita-distanzaDallAreoporto;
		return "Aereo Atterrato!" + velocita;
		
		
		
		
	} 
	
	

	@Override
	public String toString() {
	return this.getIdUnivoco()+"--"+this.getStato()+"--"+this.getOrario()+"--"+this.getCompagniaAerea()+"--"+this.getModello().getCostruttore()+"--"+this.getModello().getCodiceModello()+"--"+this.getModello().getCapienzaNumPasseggeri()+"--"+this.getDistanzaDallaAeroporto()+"--"+this.getVelocita();
	}




	public Modello getModello() {
		return modello;
	}




	public void setModello(Modello modello) {
		this.modello = modello;
	}



	}




			
		
	


		
	
	

