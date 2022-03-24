package srl.neotech.esercizio03;

public class Giornaliero extends Impiegato {

	
	/* attributi*/
	public double base;
	public int giorni;
	
	
	
	/*metodi*/
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public int getGiorni() {
		return giorni;
	}
	public void setGiorni(int giorni) {
		this.giorni = giorni;
	}
	@Override
	public double getPaga() {
		// TODO Auto-generated method stub
		return super.getPaga();
	}
	
	
	
	
}
