package srl.neotech;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;



public class StartApplication {

	public static void main(String[] args) {

		
		Aeroporto aeroporto = new Aeroporto();
		ArrayList <Aereo> listaAereiInPartenza = new ArrayList <Aereo>();
		ArrayList <Aereo> listaAereiInArrivo = new ArrayList <Aereo>();
		ArrayList<Passeggero> passeggeriAeroporto = new ArrayList <Passeggero>();
//		ArrayList<Passeggero>passeggeriAereo=new ArrayList<Passeggero>();
		
		
		
		Aereo aereoInPartenza = new Aereo();
		Aereo aereoInArrivo = new Aereo();
		Passeggero passeggeroAereo = new Passeggero();
		
		aereoInPartenza.setVelocita(0);		
		aeroporto.setRaggioDiAzione(0);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<301; i++) {
			list.add(i);
		
		}	
		
//		List<Integer> list = new ArrayList<>();
//		IntStream.range(0, 255).forEach(list::add);
		
		for (int orarioInPartenza=1;orarioInPartenza<=100;orarioInPartenza++) {
			
		Collections.shuffle(list);		
		aereoInPartenza = new Aereo();
		aereoInPartenza.setIdUnivoco(orarioInPartenza);
		aereoInPartenza.setStato(StatoAereo.IN_PARTENZA);
		aereoInPartenza.setCompagniaAerea("ATA");
		aereoInPartenza.getModello().setCostruttore("Airbus");
		aereoInPartenza.getModello().setCodiceModello("A380");
		aereoInPartenza.getModello().setCapienzaNumPasseggeri(75);
		aereoInPartenza.setOrario(list.get(0));
		list.remove(0);
		aereoInPartenza.setDistanzaDallAeroporto(0);
		aereoInPartenza.setVelocita(ThreadLocalRandom.current().nextInt(1, 10 + 1));
		
		aeroporto.getListaAereiInPartenza().add(aereoInPartenza);
		
		
		}
		
		
		for (int orarioInArrivo=1;orarioInArrivo<=200;orarioInArrivo++) {		
		Collections.shuffle(list);	
		aereoInArrivo = new Aereo();
		aereoInArrivo.setIdUnivoco(orarioInArrivo);
		aereoInArrivo.setStato(StatoAereo.IN_AVVICINAMENTO);
		aereoInArrivo.setOrario(list.get(orarioInArrivo));
		list.remove(0);
		aereoInArrivo.setCompagniaAerea("JAL");
		aereoInArrivo.getModello().setCostruttore("BOEING");
		aereoInArrivo.getModello().setCodiceModello("MD-80");
		aereoInArrivo.getModello().setCapienzaNumPasseggeri(290);
		aereoInArrivo.setDistanzaDallAeroporto(ThreadLocalRandom.current().nextInt(1, 500 + 1));
		aereoInArrivo.setVelocita(ThreadLocalRandom.current().nextInt(1, 100 + 1));
		
		aeroporto.getListaAereiInArrivo().add(aereoInArrivo);	
		}
		
		Passeggero passeggero= new Passeggero();
		for (int t=1;t<=1000;t++) {
		passeggero = new Passeggero();
		passeggero.setIdUnivoco(t);
		passeggero.setGenere(Genere.generateRandomGenere());
		passeggero.setEta(ThreadLocalRandom.current().nextInt(1, 99 + 1));
		passeggero.setStatoPasseggero(StatoPasseggero.IN_CHECKIN);
		passeggero.setClasseViaggiatore(ClasseViaggiatore.generateRandomClasseViaggiatore());       
		passeggero.setHachampagne(false);
		passeggero.setHafiore(false);
		passeggero.setHagiornale(false);	
	//	if (passeggero.getEta()<(12)) {  	
	    passeggero.setHaBagagli(false);  		
		 
		aeroporto.getListaPasseggeri().add(passeggero);	

		}
		
		//Estraggo la lista degli aerei IN_PARTENZA
				ArrayList<Aereo> aereiInPartenza=new ArrayList<Aereo>();
				ArrayList<Aereo> aereiInArrivo=new ArrayList<Aereo>();
				
				for(Aereo aereoDaSmistare:aeroporto.getListaAereiInArrivo()) {
					if(aereoDaSmistare.getStato().equals(StatoAereo.IN_PARTENZA)) {
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
						for(Aereo aereoInPartenza1: aereiInPartenza) {
							System.out.println(aereoInPartenza1);
						}
						System.out.println("----- IN ARRIVO--------");
						for(Aereo aereoInArrivo1: aereiInArrivo) {
							System.out.println(aereoInArrivo1);
						}
						
						

						//Far Decollare gi Aerei..... per ogni Aereo
						for(Aereo aereoinPartenza: aereiInPartenza) {
							//Checkin.... sposto i viaggiatori nell'iesimo aereo.
							aeroporto.checkin(aeroporto.getListaPasseggeri(),aereoinPartenza);
							//Decollo.. dell'iesimo aereo.
							aeroporto.decolla(aereoinPartenza);	
						}	
						

						//Far Atterrare gli Aerei... per ogni Aereo...
						for(Aereo aereoinArrivo: aereiInArrivo) {
							//Checkout.... sposto i passeggeri  nell'iesimo aereo.
							aeroporto.checkout(aeroporto.getListaPasseggeri(),aereoinArrivo);
							//Decollo.. dell'iesimo aereo.
							aeroporto.atterra(aereoinArrivo);	
	
	
	
	
	
	
	} 
						
	}					
						
						
						
						
						
			
//			System.out.println(aeroporto.getListaAereiInPartenza());
			
		}
		
	
							
		
		
		
	//	System.out.println(aeroporto.getListaAereiInPartenza());
//		System.out.println(aeroporto.getListaAereiInArrivo());
	//	System.out.println(aeroporto.getListaPasseggeri());
	
	

		
	
	


