package srl.neotech;

import java.util.ArrayList;

public class Aeroporto {

	//Attributi Aeroporto

	private ArrayList <Aereo> listaAereiInPartenza = new ArrayList <Aereo>();
	private ArrayList <Aereo> listaAereiInArrivo = new ArrayList <Aereo>();
    private ArrayList <Passeggero> listaPasseggeri = new ArrayList<Passeggero>();	
	private Integer raggioDiAzione;
	

	
	

	public ArrayList<Aereo> getListaAereiInPartenza() {
		return listaAereiInPartenza;
	}

	public void setListaAereiInPartenza(ArrayList<Aereo> listaAereiInPartenza) {
		this.listaAereiInPartenza = listaAereiInPartenza;
	}

	public ArrayList<Aereo> getListaAereiInArrivo() {
		return listaAereiInArrivo;
	}

	public void setListaAereiInArrivo(ArrayList<Aereo> listaAereiInArrivo) {
		this.listaAereiInArrivo = listaAereiInArrivo;
	}

	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}

	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}

	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}

	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}

		
		public Aereo atterra(Aereo aereo) {
			
			while (aereo.getDistanzaDallAeroporto()<this.raggioDiAzione) {
				Integer distanzaAttualeAereo = aereo.getDistanzaDallAeroporto()-aereo.getVelocita();
				aereo.setDistanzaDallAeroporto(distanzaAttualeAereo);
				
				}		
				System.out.println("L'aereo:"+aereo.getIdUnivoco()+" è ATTERRATO");
				aereo.setStato(StatoAereo.ATTERRATO);
				System.out.println("Blink");
				return aereo;	
			
		}
		
	
		public Aereo decolla(Aereo aereo) {
	
			while (aereo.getDistanzaDallAeroporto()<this.raggioDiAzione) {
				Integer distanzaAttualeAereo = aereo.getDistanzaDallAeroporto()+aereo.getVelocita();
				aereo.setDistanzaDallAeroporto(distanzaAttualeAereo);
		
			}		
			System.out.println("L'aereo:"+aereo.getIdUnivoco()+" è DECOLLATO");
			aereo.setStato(StatoAereo.DECOLLATO);
			System.out.println("Blink");
			
			return aereo;	
		
	}
	
	
	public Passeggero checkin (Passeggero passeggero) {
		passeggero.setStatoPasseggero(StatoPasseggero.IN_CHECKIN);
	
		if (passeggero.getClasseViaggiatore().equals(ClasseViaggiatore.EXCELSIOR)) {
			passeggero.setHachampagne(true);
		} if (passeggero.getClasseViaggiatore().equals(ClasseViaggiatore.BUSINEES)) {
			passeggero.setHagiornale(true);
		} if (passeggero.getGenere().equals(Genere.FEMMINA)) {
			passeggero.setHafiore(true);
		}  if (passeggero.getEta()<(12)) {  	
	         passeggero.setHaBagagli(false);  		
		}
		return passeggero;
		
	}	

	
	//Riempio e faccio il checkin delll'aereo con una lista di paseggeri
	public void  checkin(ArrayList<Passeggero> listaViaggiatori,Aereo aereoInPartenza) {
		System.out.println("--CHEKIN DELL'AEREO:"+aereoInPartenza.getIdUnivoco());
		for(int i=0;i<aereoInPartenza.getModello().getCapienzaNumPasseggeri();i++) {
			Passeggero passeggeroInPartenza=checkin(listaPasseggeri.get(0));
			System.out.println("Carico il passeggero:"+passeggeroInPartenza.getIdUnivoco());
			aereoInPartenza.getPasseggeriAereo().add(passeggeroInPartenza);
			listaViaggiatori.remove(0);
			if(listaPasseggeri.size()<aereoInPartenza.getModello().getCapienzaNumPasseggeri()) break;

	
		}	
	
	}
	
	
	public Passeggero checkout (Passeggero passeggero) {
		passeggero.setStatoPasseggero(StatoPasseggero.IMBARCATO );
		if (passeggero.getClasseViaggiatore().equals(ClasseViaggiatore.EXCELSIOR)) {
			passeggero.setHachampagne(true);
		} if (passeggero.getClasseViaggiatore().equals(ClasseViaggiatore.BUSINEES)) {
			passeggero.setHagiornale(true);
		} if (passeggero.getGenere().equals(Genere.FEMMINA)) {
			passeggero.setHafiore(true);
		}  if (passeggero.getEta()<(12)) {  	
	         passeggero.setHaBagagli(false);  		
		}
		return passeggero;
		
	}	

	//Faccio il checkout delll'aereo con una lista di paseggeri
	public void  checkout(ArrayList<Passeggero> listaPasseggeri,Aereo aereoInArrivo) {
		System.out.println("--CHEKOUT DELL'AEREO:"+aereoInArrivo.getIdUnivoco());
		for(int i=0;i<aereoInArrivo.getModello().getCapienzaNumPasseggeri();i++) {
			Passeggero passeggeroInArrivo=checkout(listaPasseggeri.get(0));
			System.out.println("Scarico il passeggero:"+passeggeroInArrivo.getIdUnivoco());
			aereoInArrivo.getPasseggeriAereo().add(passeggeroInArrivo);
			listaPasseggeri.remove(0);
			if(listaPasseggeri.size()<aereoInArrivo.getModello().getCapienzaNumPasseggeri()) break;

	
	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		public Aeroporto() {
			listaAereiInPartenza = new ArrayList <Aereo>();
			listaAereiInArrivo = new ArrayList <Aereo>();
			listaPasseggeri = new ArrayList<Passeggero>();
			this.raggioDiAzione=100;		
		
	
	
		}
	
		

}	

