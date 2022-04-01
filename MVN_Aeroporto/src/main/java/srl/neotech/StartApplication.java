package srl.neotech;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;



public class StartApplication {

	public static void main(String[] args) {

		
		Aeroporto aeroporto = new Aeroporto();
		ArrayList <Aereo> listaAereiInPartenza = new ArrayList <Aereo>();
		ArrayList <Aereo> listaAereiInArrivo = new ArrayList <Aereo>();
		ArrayList<Passeggero> passeggeriAeroporto = new ArrayList <Passeggero>();
		ArrayList<Passeggero>passeggeriAereo=new ArrayList<Passeggero>();
		
		List<Integer> list = new ArrayList<>();
		IntStream.range(0, 255).forEach(list::add);
		
		Aereo aereoInPartenza = new Aereo();
		Aereo aereoInArrivo = new Aereo();
		Passeggero passeggeroAereo = new Passeggero();
		
		aereoInPartenza.setVelocita(0);
		aereoInPartenza.setDistanzaDallAeroporto(0);
		aeroporto.setRaggioDiAzione(0);
		
		
		for (int i=1;i<=100;i++) {
		aereoInPartenza = new Aereo();
		Collections.shuffle(list);
		aereoInPartenza.setIdUnivoco(i);
		aereoInPartenza.setStato(StatoAereo.IN_PARTENZA);
		aereoInPartenza.setOrario(list.get(i));
		aereoInPartenza.setCompagniaAerea("ATA");
		aereoInPartenza.getModello().setCostruttore("Airbus");
		aereoInPartenza.getModello().setCodiceModello("A380");
		aereoInPartenza.getModello().setCapienzaNumPasseggeri(475);
		
		aereoInPartenza.setVelocita(ThreadLocalRandom.current().nextInt(1, 10 + 1));
		aereoInPartenza.setDistanzaDallAeroporto(ThreadLocalRandom.current().nextInt(1, 500 + 1));
		aeroporto.getListaAereiInPartenza().add(aereoInPartenza);
		
		
		
		
		}
		
		
		
		
		
		
		for (int j=1;j<=200;j++) {
		aereoInArrivo = new Aereo();
		aereoInArrivo.setIdUnivoco(j);
		aereoInArrivo.setStato(StatoAereo.IN_AVVICINAMENTO);
		aereoInArrivo.setOrario(list.get(j));
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
		if (passeggero.getEta()<(12)) {  	
	         passeggero.setHaBagagli(false);  		
		} 
		aeroporto.getListaPasseggeri().add(passeggero);	

		
//		
		
//		for (int j=0;j<100;j++) {
//			int app = 130;
//			int indice = 0;
//			for (int i=0;i<100;i++) {
//				if (aereoInPartenza.getStatoAereo.IN_PARTENZA));   {
//					if (orario < app) {
//						app = orario;
//						indice = i;
						
				
				
		}
		
			
		for (Aereo aereoDaRiempire : aeroporto.getListaAereiInPartenza()) {
	//		listaPasseggeri.toString();
			
			System.out.println(aeroporto.getListaAereiInPartenza());
			
		}
		
	
							
		
		
		
	//	System.out.println(aeroporto.getListaAereiInPartenza());
		System.out.println(aeroporto.getListaAereiInArrivo());
		System.out.println(aeroporto.getListaPasseggeri());
	
		}
	}

		
	
	


