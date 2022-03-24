package srl.neotech.esercizio03;

public abstract class Impiegato {

	
	public interface IImpiegato {

	}
	public String nome;
	public String indirizzo;
	public String telefono;
	public double paga;

/* definisci metodi*/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public double getPaga() {
		return paga;
	}
	public void setPaga(double paga) {
		this.paga = paga;
	}
	}
	
	
	
	


