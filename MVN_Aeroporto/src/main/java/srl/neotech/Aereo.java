package srl.neotech;


public class Aereo extends Modello{

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




	@Override
	public String getCostruttore() {
		// TODO Auto-generated method stub
		return super.getCostruttore();
	}




	@Override
	public void setCostruttore(String costruttore) {
		// TODO Auto-generated method stub
		super.setCostruttore(costruttore);
	}




	@Override
	public String getCodiceModello() {
		// TODO Auto-generated method stub
		return super.getCodiceModello();
	}




	@Override
	public void setCodiceModello(String codiceModello) {
		// TODO Auto-generated method stub
		super.setCodiceModello(codiceModello);
	}




	@Override
	public Integer getCapienzaNumPasseggeri() {
		// TODO Auto-generated method stub
		return super.getCapienzaNumPasseggeri();
	}




	@Override
	public void setCapienzaNumPasseggeri(Integer capienzaNumPasseggeri) {
		// TODO Auto-generated method stub
		super.setCapienzaNumPasseggeri(capienzaNumPasseggeri);
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
		
		modello = new Modello();
		
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
	return this.getIdUnivoco()+"--"+this.getStato()+"--"+this.getOrario()+"--"+this.getCompagniaAerea()+"--"+this.getCostruttore()+"--"+this.getCodiceModello()+"--"+this.getCapienzaNumPasseggeri()+"--"+this.getDistanzaDallaAeroporto()+"--"+this.getVelocita();
	}



	}




			
		
	


		
	
	

