package srl.neotech.academy.fabricabibita;

import java.util.concurrent.ThreadLocalRandom;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Cantina cantina=new Cantina();
		
		for(int i=0;i<=100;i++) {
			Cisterna cisternaDaAggiungere = null;
			int randomTipologia = ThreadLocalRandom.current().nextInt(1, 3 + 1);
	
			if(randomTipologia==1) {
				cisternaDaAggiungere.setTipologia(Tipologia.ACCIAIO);
			}else if(randomTipologia==2) {
				cisternaDaAggiungere.setTipologia(Tipologia.RAME);
			}else cisternaDaAggiungere.setTipologia(Tipologia.ALLUMINIO);
			
			int randomQuantita = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
			cisternaDaAggiungere.setContent(randomQuantita);			
			int randomEvap = ThreadLocalRandom.current().nextInt(1, 5 + 1);
			cisternaDaAggiungere.setEvapDay(randomEvap);
			
			cantina.getCisterne().add(cisternaDaAggiungere);
		
			System.out.print("sono all'iesimo giro:"+i+"  ");
			System.out.println(cisternaDaAggiungere);
			
			}	
		
			int giorniTotaliRame=0;
			int giorniTotaliAlluminio=0;
			int giorniTotaliAcciaio=0;
			for(int j=0;j<100;j++) {
			Cisterna cisternaDaAnalizzare=cantina.getCisterne().get(j);
			int thresoldCorrente=100;
			while(thresoldCorrente>cisternaDaAnalizzare.getThreshold()) {
				if(cisternaDaAnalizzare.getTipologia().equals(Tipologia.ACCIAIO)) giorniTotaliAcciaio=giorniTotaliAcciaio+1;
				if(cisternaDaAnalizzare.getTipologia().equals(Tipologia.ALLUMINIO)) giorniTotaliAlluminio=giorniTotaliAlluminio+1;
				if(cisternaDaAnalizzare.getTipologia().equals(Tipologia.RAME)) giorniTotaliRame=giorniTotaliRame+1;
				thresoldCorrente=thresoldCorrente-cisternaDaAnalizzare.getEvapPerDay();
			}
			
		}
		System.out.println("Giorni per cisterna di Acciaio:"+giorniTotaliAcciaio);
		System.out.println("Giorni per cisterna di Rame:"+giorniTotaliRame);
		System.out.println("Giorni per cisterna di Alluminio:"+giorniTotaliAlluminio);
	

		
		
	}
}
		
	


