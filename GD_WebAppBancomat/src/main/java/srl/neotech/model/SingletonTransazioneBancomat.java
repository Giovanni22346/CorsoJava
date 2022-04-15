package srl.neotech.model;

import java.util.ArrayList;

public class SingletonTransazioneBancomat {

	

	private static SingletonTransazioneBancomat instance=null;
	
	ArrayList<TransazioneBancomat> listaTransazioni= new ArrayList <TransazioneBancomat>(); 
	
	
	public ArrayList<TransazioneBancomat> getListaTransazioni() {
		return listaTransazioni;
	}



	public void setListaTransazioni(ArrayList<TransazioneBancomat> listaTransazioni) {
		this.listaTransazioni = listaTransazioni;
	}




	public static SingletonTransazioneBancomat getInstance() {
		if(instance == null) {
			instance = new SingletonTransazioneBancomat();
		}
		return instance;
	}
	
	
	
	
}
