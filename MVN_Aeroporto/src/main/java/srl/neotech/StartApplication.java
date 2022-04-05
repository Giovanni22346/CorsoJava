package srl.neotech;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;


public class StartApplication {

	public static void main(String[] args) {

		Aereoporto aereoporto=new Aereoporto();
		Aereo aereo=new Aereo();
		Passeggero passeggero=new Passeggero();


		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=1; i<301; i++) {
			list.add(i);
		}
        for(int orarioPartenza=1;orarioPartenza<=100;orarioPartenza++) {
			Collections.shuffle(list);
			aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_PARTENZA);
			aereo.setIdUnivoco(orarioPartenza );
			aereo.setCompagniaAerea(CompagniaAerea.generateRandomCompagniaAerea());

			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Ryanair)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(737-400);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(188);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Wizz_Air)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(320);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(195);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Volotea)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(737-800);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(189);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.EasyJet)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(318-100);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(132);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Eurowings)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(319-100);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(156);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.ITA_Italia_Trasporto_Aereo)) {
				aereo.getModelloAereo().setCostruttore("Embraer(Azienda aereonautica brasiliana)");
				aereo.getModelloAereo().setCodiceModello(190);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(114);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Vueling_Airlines)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(320-200);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(186);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Lufthansa)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(747);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(410);
			}
			aereo.setOrario(list.get(0));
			list.remove(0);
			aereo.setVelocita(ThreadLocalRandom.current().nextInt(1, 10 + 1));
			aereo.setDistanzaDallAereoporto(0);
			aereoporto.getListaAerei().add(aereo);
        }	

		for(int orarioArrivo=1;orarioArrivo<=200;orarioArrivo++) {
			Collections.shuffle(list);
			aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
			aereo.setIdUnivoco(orarioArrivo);
			aereo.setOrario(list.get(0));
			list.remove(0);
			aereo.setCompagniaAerea(CompagniaAerea.generateRandomCompagniaAerea());
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Ryanair)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(737-400);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(188);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Wizz_Air)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(320);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(195);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Volotea)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(737-800);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(189);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.EasyJet)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(318-100);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(132);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Eurowings)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(319-100);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(156);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.ITA_Italia_Trasporto_Aereo)) {
				aereo.getModelloAereo().setCostruttore("Embraer(Azienda aereonautica brasiliana)");
				aereo.getModelloAereo().setCodiceModello(190);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(114);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Vueling_Airlines)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(320-200);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(186);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Lufthansa)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(747);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(410);
			}
			aereo.setVelocita(ThreadLocalRandom.current().nextInt(1, 10 + 1));
			aereo.setDistanzaDallAereoporto(ThreadLocalRandom.current().nextInt(1, 500 + 1));
			aereoporto.getListaAerei().add(aereo);
			
		} 

		for(int j=1;j<1000;j++) {
			passeggero=new Passeggero();
			passeggero.setIdUnivocoPasseggero(j);
			passeggero.setStatoPasseggero(StatoPasseggero.IN_CHECKIN);
			passeggero.setClassePasseggero(ClassePasseggero.generateRandomPasseggero());
			if(passeggero.getClassePasseggero().equals(ClassePasseggero.EXCELSIOR)) {
				passeggero.setHaChampagne(true);
			}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUSINESS)) {
				passeggero.setHaGiornale(true);
			}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUSINESS.EXCELSIOR.TURISTA)) {
				passeggero.setHaBagagli(true);
			}
			passeggero.setEta(ThreadLocalRandom.current().nextInt(1, 80 + 1));
			passeggero.setSessoPasseggero(SessoPasseggero.generateRandomGenere());
			if(passeggero.getSessoPasseggero().equals(SessoPasseggero.FEMMINA)) {
				passeggero.setHaFiore(true);
			}
			aereoporto.getViaggiatori().add(passeggero);
		}
		//System.out.println(aereoporto.getViaggiatori() );

		 String casi = null;
		 String situazione="";

		 
		 //Estraggo la lista degli aerei IN_PARTENZA
		ArrayList<Aereo> aereiInPartenza=new ArrayList<Aereo>();
		ArrayList<Aereo> aereiInArrivo=new ArrayList<Aereo>();
		
		for(Aereo aereoDaSmistare:aereoporto.getListaAerei()) {
			if(aereoDaSmistare.getStatoAereo().equals(StatoAereo.IN_PARTENZA)) {
				aereiInPartenza.add(aereoDaSmistare);
			}else {
				
				aereiInArrivo.add(aereoDaSmistare);
			}
		}
			

		//Ordinamento aereiInPartenza
		Collections.sort(aereiInPartenza,new Comparator<Aereo>() {
			public int compare(Aereo o1, Aereo o2){
		         if(o1.getOrario() == o2.getOrario())
		             return 0;
		         return o1.getOrario() < o2.getOrario() ? -1 : 1;
		     }
		});
		
		
		//Ordinamento aereiInArrivo
				Collections.sort(aereiInArrivo,new Comparator<Aereo>() {
					public int compare(Aereo o1, Aereo o2){
				         if(o1.getOrario() == o2.getOrario())
				             return 0;
				         return o1.getOrario() < o2.getOrario() ? -1 : 1;
				     }
				});
		
		
		
		System.out.println("----- IN PARTENZA--------");
		for(Aereo aereoInPartenza: aereiInPartenza) {
			System.out.println(aereoInPartenza);
		}
		System.out.println("----- IN ARRIVO--------");
		for(Aereo aereoInArrivo: aereiInArrivo) {
			System.out.println(aereoInArrivo);
		}
	
        
		//Far Decollare gi Aerei..... per ogni Aereo
		for(Aereo aereoinPartenza: aereiInPartenza) {
			//Checkin.... sposto i viaggiatori nell'iesimo aereo.
			aereoporto.checkIn(aereoporto.getViaggiatori(),aereoinPartenza);
			//Decollo.. dell'iesimo aereo.
			aereoporto.decollo(aereoinPartenza);	
		}
		
		
		//Far Atterrare gli Aerei... per ogni Aereo...
		for(Aereo aereoinArrivo: aereiInArrivo) {
			
			aereoporto.checkOut(aereoinArrivo, aereoporto.getViaggiatori());
			
			aereoporto.atterra(aereoinArrivo);
		
		
		}
	
		
        }
	

	}

		


	




