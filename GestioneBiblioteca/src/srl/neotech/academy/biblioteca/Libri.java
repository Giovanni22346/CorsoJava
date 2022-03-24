package srl.neotech.academy.biblioteca;

public abstract class Libri {

	
	private Integer idLibro;
	private String titolo;
	private String autore;
	private String sezione;
	private String scaffale;

	
	
	public Libri(Integer idLibro, String titolo, String autore, String sezione, String scaffale) {
		super();
		
		this.idLibro = idLibro;
		this.titolo = titolo;
		this.autore = autore;
		this.sezione = sezione;
		this.scaffale = scaffale;
	}


	
	public void classificareLibro() {
	System.out.println("Ho aggiunto un libro alla lista dei libri della Biblioteca" +idLibro);
		
	}
	
	
	
	public Integer getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return this.autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getSezione() {
		return this.sezione;
	}

	public void setSezione(String sezione) {
		this.sezione = sezione;
	}

	public String getScaffale() {
		return this.scaffale;
	}

	public void setScaffale(String scaffale) {
		this.scaffale = scaffale;
	}

	
	
	
}