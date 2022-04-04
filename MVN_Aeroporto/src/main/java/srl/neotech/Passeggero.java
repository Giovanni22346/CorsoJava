package srl.neotech;

public class Passeggero {

	private Integer idUnivocoPasseggero;
	private SessoPasseggero sessoPasseggero;
	private Integer eta;
	private ClassePasseggero classePasseggero;
	private Boolean haBagagli;
	private Boolean haChampagne;
	private Boolean haFiore;
	private Boolean haGiornale;
	private StatoPasseggero statoPasseggero;
	
	
	
	public Integer getIdUnivocoPasseggero() {
		return idUnivocoPasseggero;
	}
	public void setIdUnivocoPasseggero(Integer idUnivocoPasseggero) {
		this.idUnivocoPasseggero = idUnivocoPasseggero;
	}
	public SessoPasseggero getSessoPasseggero() {
		return sessoPasseggero;
	}
	public void setSessoPasseggero(SessoPasseggero sessoPasseggero) {
		this.sessoPasseggero = sessoPasseggero;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	public ClassePasseggero getClassePasseggero() {
		return classePasseggero;
	}
	public void setClassePasseggero(ClassePasseggero classePasseggero) {
		this.classePasseggero = classePasseggero;
	}
	
	
	
	
	public Boolean getHaBagagli() {
		
		
		return haBagagli;
		 
	}
	public void setHaBagagli(Boolean haBagagli) {
		
		this.haBagagli = haBagagli ;
	}
	public Boolean getHaChampagne() {
		return  haChampagne;
	}
	public void setHaChampagne(Boolean haChampagne) {
		this.haChampagne = haChampagne;
	}
	public Boolean getHaFiore() {
		return haFiore;
	}
	public void setHaFiore(Boolean haFiore) {
		this.haFiore = haFiore;
	}
	public Boolean getHaGiornale() {
		return haGiornale;
	}
	public void setHaGiornale(Boolean haGiornale) {
		this.haGiornale =haGiornale;
	}
	public StatoPasseggero getStatoPasseggero() {
		return statoPasseggero;
	}
	public void setStatoPasseggero(StatoPasseggero statoPasseggero) {
		this.statoPasseggero = statoPasseggero;
	}
	 
	
	
	@Override
	public String toString(){
	return "[ID]:"+this.getIdUnivocoPasseggero()+"[SESSO PASSEGGERO]:"+this.getSessoPasseggero()+"[ETÀ]:"+this.getEta()+"[CLASSE PASSEGGERO]:"+
	this.getClassePasseggero()+"[HA BAGAGLI (T/F)]:"+this.getHaBagagli()+"[HA CHAMPAGNE (T/F)]:"+this.getHaChampagne()+"[HA FIORE (T/F)]:"
	+this.getHaFiore()+"[HA GIORNALE (T/F)]:"+this.getHaGiornale()+"[STATO PASSEGGERO]:"+this.getStatoPasseggero();
	}
	
}