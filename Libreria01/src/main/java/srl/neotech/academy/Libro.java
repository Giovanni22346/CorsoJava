package srl.neotech.academy;

public class Libro {

	
	private Integer idLibro;
	private String titolo;
	private String autore;
	private Genere genere;
	private String scaffale;
	
	
	
	
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitolo() {
		return "titolo libro "+titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return "nome autore "+autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return "nome genere" +genere;
	}
	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	public String getScaffale() {
		return "scaffale"+ scaffale;
	}
	public void setScaffale(String scaffale) {
		this.scaffale = scaffale;
	}
	
	

	
	
}
	
	
	
	