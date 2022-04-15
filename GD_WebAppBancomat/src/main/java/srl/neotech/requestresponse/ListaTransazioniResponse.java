package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.TransazioneBancomat;

public class ListaTransazioniResponse {

	ArrayList<TransazioneBancomat> listaTransazioniResponse = new ArrayList<TransazioneBancomat>();

	public ArrayList<TransazioneBancomat> getListaTransazioniResponse() {
		return listaTransazioniResponse;
	}

	public void setListaTransazioniResponse(ArrayList<TransazioneBancomat> listaTransazioniResponse) {
		this.listaTransazioniResponse = listaTransazioniResponse;
	}
	
	
	
}
