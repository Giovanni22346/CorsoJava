package srl.neotech;

public class Passeggero {

	 private Integer idUnivoco;
	 private Genere genere;
	 private Integer eta;
	 private ClasseViaggiatore classeViaggiatore;
	 private Boolean haBagagli;
	 private Boolean hafiore;
	 private Boolean hachampagne;
	 private Boolean hagiornale;
	 private StatoPasseggero statoPasseggero;

	 
	 
	 
	public ClasseViaggiatore getClasseViaggiatore() {
		return classeViaggiatore;
	}
	public void setClasseViaggiatore(ClasseViaggiatore classeViaggiatore) {
		this.classeViaggiatore = classeViaggiatore;
	}
	public StatoPasseggero getStatoPasseggero() {
		return statoPasseggero;
	}
	public void setStatoPasseggero(StatoPasseggero statoPasseggero) {
		this.statoPasseggero = statoPasseggero;
	}
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public Genere getGenere() {
		return genere;
	}
	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	
	public Boolean getHaBagagli() {
		return haBagagli;
	}
	public void setHaBagagli(Boolean haBagagli) {
		this.haBagagli = haBagagli;
	}
	public Boolean getHafiore() {
		return hafiore;
	}
	public void setHafiore(Boolean hafiore) {
		this.hafiore = hafiore;
	}
	public Boolean getHachampagne() {
		return hachampagne;
	}
	public void setHachampagne(Boolean hachampagne) {
		this.hachampagne = hachampagne;
	}
	public Boolean getHagiornale() {
		return hagiornale;
	}
	public void setHagiornale(Boolean hagiornale) {
		this.hagiornale = hagiornale;
	}
	
		
	
	  
	@Override
	public String toString(){
		return this.getIdUnivoco()+"--"+this.getGenere()+"--"+this.getEta()+"--"+this.getStatoPasseggero()+"--"+this.getClasseViaggiatore()+"--"+this.getHachampagne()+"--"+this.getHafiore()+"--"+this.getHagiornale()+"--"+this.getHaBagagli();
	}
	
	
	}
	





