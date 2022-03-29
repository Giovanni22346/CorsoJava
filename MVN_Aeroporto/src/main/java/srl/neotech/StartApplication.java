package srl.neotech;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StartApplication {

	public static void main(String[] args) {

		
		
		
		Aeroporto aeroporto = new Aeroporto();
		ArrayList <Aereo> listaAerei = new ArrayList <Aereo>();
		ArrayList <Passeggero> listaPasseggeri = new ArrayList <Passeggero>();

		
		 StatoPasseggero[] values = StatoPasseggero.values();
		 
		 
		Random random = new Random();
		
		
		
		
		
		
		
		
		
		
		
	for (int i=0;i<=100;i++) {
		
		Passeggero passeggero= new Passeggero();
		Aereo aereo = new Aereo();;
		
		aereo.setStato(StatoAereo.IN_PARTENZA);
		aereo.setIdUnivoco(i);
		aereo.setOrario(ThreadLocalRandom.current().nextInt(1, 130 + 1));
		aereo.setCompagniaAerea("ATA");
		aereo.setModello("Airbus","A380",475);
		aereo.setVelocita(ThreadLocalRandom.current().nextInt(1, 10 + 1));
		aereo.setDistanzaDallaAeroporto(ThreadLocalRandom.current().nextInt(0, 500 + 1));
		passeggero.setStatoPasseggero(StatoPasseggero.IN_CHECKIN);
		passeggero.setIdUnivoco(ThreadLocalRandom.current().nextInt(1, 1000 + 1));
		passeggero.setEta(ThreadLocalRandom.current().nextInt(1, 99 + 1));
		passeggero.setClassePasseggero(ClassePasseggero.generateRandomClassePasseggero());
		
		
		
		
		
		passeggero.setGenere(Math.random() < 0.5);
		
		
		
		passeggero.setHaBagagli(Math.random() < 0.5);
		passeggero.setHachampagne(Math.random() < 0.5);
		passeggero.setHagiornale(Math.random() < 0.5);
		passeggero.setHafiore(Math.random() < 0.5);

		
		aereo.getListaAerei().add(aereo);
		
		
		}
		
		
		
		
		
	}

}
