package srl.neotech.model;

public class TransazioneBancomat {

	private String id;
	private String dataEora;
	private String operazione;
	private String nominativo;
	private Integer taglio;
	private Integer quantita;
	private Integer totale;
	
	
	public String getDataEora() {
		return dataEora;
	}
	public void setDataEora(String dataEora) {
		this.dataEora = dataEora;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
	public String getOperazione() {
		return operazione;
	}
	public void setOperazione(String operazione) {
		this.operazione = operazione;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public Integer getTaglio() {
		return taglio;
	}
	public void setTaglio(Integer taglio) {
		this.taglio = taglio;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public Integer getTotale() {
		return totale;
	}
	public void setTotale(Integer totale) {
		this.totale = totale;
	}
	
	
	
	
}
