package srl.neotech;



import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;



public class StartApplication {

	public static void main(String[] args) {

		
		Aeroporto aeroporto = new Aeroporto();
		ArrayList <Aereo> listaAereiInPartenza = new ArrayList <Aereo>();
		ArrayList <Aereo> listaAereiInArrivo = new ArrayList <Aereo>();
		ArrayList <Passeggero> listaPasseggeri = new ArrayList <Passeggero>();

		
		Aereo aereoInPartenza = new Aereo();
		Aereo aereoInArrivo = new Aereo();
		
		for (int i=1;i<=100;i++) {
		aereoInPartenza = new Aereo();
		aereoInPartenza.setIdUnivoco(i);
		aereoInPartenza.setStato(StatoAereo.IN_PARTENZA);
		aereoInPartenza.setOrario(ThreadLocalRandom.current().nextInt(1, 130 + 1));
		aereoInPartenza.setCompagniaAerea("ATA");
		aereoInPartenza.setCostruttore("Airbus");
		aereoInPartenza.setCodiceModello("A380");
		aereoInPartenza.setCapienzaNumPasseggeri(475);
		aereoInPartenza.setDistanzaDallaAeroporto(ThreadLocalRandom.current().nextInt(1, 500 + 1));
		aereoInPartenza.setVelocita(ThreadLocalRandom.current().nextInt(1, 100 + 1));
		aeroporto.getListaAereiInPartenza().add(aereoInPartenza);
		}
		for (int j=1;j<=200;j++) {
		aereoInArrivo = new Aereo();
		aereoInArrivo.setIdUnivoco(j);
		aereoInArrivo.setStato(StatoAereo.IN_AVVICINAMENTO);
		aereoInArrivo.setOrario(ThreadLocalRandom.current().nextInt(1, 130 + 1));
		aereoInArrivo.setCompagniaAerea("JAL");
		aereoInArrivo.setCostruttore("BOEING");
		aereoInArrivo.setCodiceModello("MD-80");
		aereoInArrivo.setCapienzaNumPasseggeri(290);
		aereoInArrivo.setDistanzaDallaAeroporto(ThreadLocalRandom.current().nextInt(1, 500 + 1));
		aereoInArrivo.setVelocita(ThreadLocalRandom.current().nextInt(1, 100 + 1));
		aeroporto.getListaAereiInArrivo().add(aereoInArrivo);	
		}
		
		Passeggero passeggero= new Passeggero();
		for (int t=1;t<=1000;t++) {
		passeggero = new Passeggero();
		passeggero.setIdUnivoco(t);
		passeggero.setGenere(Genere.generateRandomGenere());
		passeggero.setEta(ThreadLocalRandom.current().nextInt(1, 99 + 1));
		passeggero.setStatoPasseggero(StatoPasseggero.generateRandomStatoPasseggero());
		passeggero.setClasseViaggiatore(ClasseViaggiatore.generateRandomClasseViaggiatore());
		passeggero.setHaBagagli(Math.random()<0.5);
		passeggero.setHachampagne(Math.random() < 0.5);
		passeggero.setHafiore(Math.random() <0.5);
		passeggero.setHagiornale(Math.random()<0.5);
		aeroporto.getListaPasseggeri().add(passeggero);
		
			
		}
            
		System.out.println(aeroporto.getListaAereiInPartenza());
		System.out.println(aeroporto.getListaAereiInArrivo());
		System.out.println(aeroporto.getListaPasseggeri());

	}
}
	
		
		
	


