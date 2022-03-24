package srl.neotech.esercizio04;

public class Licantropo implements Umano, Mostro{
	
	/* attributi/variabili*/
	
	public boolean uomo;
	public int forzaUmano;
	public int forzaMostro;
	
	
	/* metodi*/
	
	public boolean isUomo() {
		return uomo;
	}
	public void setUomo(boolean uomo) {
		this.uomo = uomo;
	}
	public int getForzaUmano() {
		return forzaUmano;
	}
	public void setForzaUmano(int forzaUmano) {
		this.forzaUmano = forzaUmano;
	}
	public int getForzaMostro() {
		return forzaMostro;
	}
	public void setForzaMostro(int forzaMostro) {
		this.forzaMostro = forzaMostro;
	}
	
	/* polimorfismo/interfaccia*/
	
	
	@Override
	public void azzanna() {
		
		
	}
	@Override
	public void combatti() {
		
		
	}
	
	
	
	

}
