package srl.neotech;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
	
public class Aereoporto {

	private ArrayList<Aereo>listaAerei=new ArrayList<Aereo>();
	private ArrayList<Passeggero>viaggiatori=new ArrayList<Passeggero>();
	private Integer raggioDiAzione;//da 1 a 100 km
	

	public Aereo atterra(Aereo aereo) {
			
			while (aereo.getDistanzaDallAereoporto()>0); {
				System.out.println("L'aereo:"+aereo.getIdUnivoco()+" e' in avvicinamento");
				Integer distanzaAttualeAereo = aereo.getDistanzaDallAereoporto()-aereo.getVelocita();
				aereo.setDistanzaDallAereoporto(distanzaAttualeAereo);
				System.out.println("Blink");
				
				}		
				System.out.println("L'aereo:"+aereo.getIdUnivoco()+" è ATTERRATO");
				aereo.setStatoAereo(StatoAereo.ATTERRATO);
				
				return aereo;
						
}
	
		
	public Aereo decollo(Aereo aereo) {
		while(aereo.getDistanzaDallAereoporto()<this.raggioDiAzione) {
			Integer distanzaAttualeAereo=aereo.getDistanzaDallAereoporto()+aereo.getVelocita();
			aereo.setDistanzaDallAereoporto(distanzaAttualeAereo);
			System.out.println("Blink!");
			
		}
		
		System.out.println("L'aereo:"+aereo.getIdUnivoco()+" e' uscito fuori dal raggio d'azione");
		aereo.setStatoAereo(StatoAereo.FUORI_SPAZIO_AEREO);
		return aereo;
	}
	
	
	
	public Passeggero checkIn(Passeggero passeggero) {
		passeggero.setStatoPasseggero(StatoPasseggero.IN_CHECKIN);
		if(passeggero.getClassePasseggero().equals(ClassePasseggero.EXCELSIOR)) {
			passeggero.setHaChampagne(true);
			}if(passeggero.getSessoPasseggero().equals(SessoPasseggero.FEMMINA)) {
			passeggero.setHaFiore(true);
		}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUSINESS)) {
			passeggero.setHaGiornale(true);
		}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUSINESS.EXCELSIOR.TURISTA)) {
			passeggero.setHaBagagli(true);
		}
		
		return passeggero;
	}
	
	
	//Riempio e faccio il checkin delll'aereo con una lista di paseggeri
	public void  checkIn(ArrayList<Passeggero> listaViaggiatori,Aereo aereoInPartenza) {
		System.out.println("--CHEKIN DELL'AEREO:"+aereoInPartenza.getIdUnivoco());
		for(int i=0;i<aereoInPartenza.getModelloAereo().getCapienzaNumeroPasseggeri();i++) {
			Passeggero passeggeroInPartenza=checkIn(listaViaggiatori.get(0));
			System.out.println("Carico il passeggero:"+passeggeroInPartenza.getIdUnivocoPasseggero());
			aereoInPartenza.getPasseggeriAereo().add(passeggeroInPartenza);
			listaViaggiatori.remove(0);
			if(listaViaggiatori.size()<aereoInPartenza.getModelloAereo().getCapienzaNumeroPasseggeri()) break;
		}	
	}

	
	
	//Faccio il checkout delll'aereo con una lista di paseggeri
			public void  checkOut(Aereo aereoInArrivo,ArrayList<Passeggero> listaViaggiatori) {
				System.out.println("--CHEKOUT DELL'AEREO:"+aereoInArrivo.getIdUnivoco());
				for(int i=0;i<aereoInArrivo.getModelloAereo().getCapienzaNumeroPasseggeri();i++) {
						Passeggero passeggero=new Passeggero();
						Aereoporto aereoporto=new Aereoporto();					
						passeggero.setIdUnivocoPasseggero(i);
						passeggero.setStatoPasseggero(StatoPasseggero.SBARCATO);
						passeggero.setClassePasseggero(ClassePasseggero.generateRandomPasseggero());
						passeggero.setEta(ThreadLocalRandom.current().nextInt(1, 80 + 1));
						passeggero.setSessoPasseggero(SessoPasseggero.generateRandomGenere());
						passeggero.getSessoPasseggero().equals(SessoPasseggero.FEMMINA);					
						aereoporto.getViaggiatori().add(passeggero);
					
					
					System.out.println("E' sbarcato il passeggero:"+passeggero.getIdUnivocoPasseggero()+1);
				
					//if(listaViaggiatori.size()<aereoInArrivo.getModelloAereo().getCapienzaNumeroPasseggeri()) break;	
	
	
				}
			}
		
	
	public Passeggero checkOut(Passeggero passeggero) {
		passeggero.setStatoPasseggero(StatoPasseggero.CHECKOUT);
		if(passeggero.getClassePasseggero().equals(ClassePasseggero.EXCELSIOR)) {
			passeggero.setHaChampagne(true);
		}if(passeggero.getSessoPasseggero().equals(SessoPasseggero.FEMMINA)) {
			passeggero.setHaFiore(true);
		}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUSINESS)) {
			passeggero.setHaGiornale(true);
		}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUSINESS.EXCELSIOR.TURISTA)) {
			passeggero.setHaBagagli(true);
		}
		return passeggero;
	}
	
	
	public Aereoporto(){
		listaAerei=new ArrayList<Aereo>();
		viaggiatori=new ArrayList<Passeggero>();
		this.raggioDiAzione=100;
	}
	
	
	
	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}
	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}
	
	public ArrayList<Passeggero> getViaggiatori() {
		return viaggiatori;
	}
	public void setViaggiatori(ArrayList<Passeggero> viaggiatori) {
		this.viaggiatori = viaggiatori;
	}
	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}
	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
	
	
	

	
}
