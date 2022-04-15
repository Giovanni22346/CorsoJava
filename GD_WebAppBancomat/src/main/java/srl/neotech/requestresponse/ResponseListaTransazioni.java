package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.TransazioneBancomat;

public class ResponseListaTransazioni {

	
	ArrayList<TransazioneBancomat> listaTransazioniRestituite = new ArrayList<TransazioneBancomat>();
	
	

	

	public ArrayList<TransazioneBancomat> getListaTransazioniRestituite() {
		return listaTransazioniRestituite;
	}

	public void setListaTransazioniRestituite(ArrayList<TransazioneBancomat> listaTransazioniRestituite) {
		this.listaTransazioniRestituite = listaTransazioniRestituite;
	}

	
	
	
}
