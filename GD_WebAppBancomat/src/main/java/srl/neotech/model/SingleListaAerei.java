package srl.neotech.model;

import java.util.ArrayList;

public class SingleListaAerei {
	
	
	
	private static SingleListaAerei instance=null;
	
	ArrayList<Aereo> listaAerei=new ArrayList<Aereo>();

	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}

	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}
	
	
	
	public static SingleListaAerei getInstance() {
        // Crea l'oggetto solo se NON esiste:
        if (instance == null) {
            instance = new SingleListaAerei();
        }
        return instance;
    }
	
}


