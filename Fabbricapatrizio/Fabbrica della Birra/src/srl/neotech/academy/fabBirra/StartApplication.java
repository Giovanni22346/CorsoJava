package srl.neotech.academy.fabBirra;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StartApplication {

	public static void main(String[] args) {
		
		
	//	
		
		//for (int i=0;i<=100;i++) {
			//int cist=scadenza.nextInt(i);
		
			//Cisterna numeroGiorniCisterneCasuali=new Cisterna();
			
			
		
		//}

		
		Cantina cantinaDiBirra=new Cantina();
		Cisterna cisterna=null;
		
		//int giorni
		
		for (int i=0;i<=100;i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
           if(randomNum==1) {
        	  cisterna=new Alluminio();
           }
           else if(randomNum==2) {
        	   cisterna=new Rame();
           }
           else if(randomNum==3) {
        	   cisterna=new Acciaio();
           }
           int randomQuantità = ThreadLocalRandom.current().nextInt(1,1000 + 1);
           cisterna.setContent(randomQuantità);
           int randomEvapora = ThreadLocalRandom.current().nextInt(1,5 + 1);
           cisterna.setEvaPerDay(randomEvapora);
           
          cantinaDiBirra.getCisterne().add(cisterna);
           
		}//riciclo100 cisterne
		//riprendo la iesima cisterna con get i
		//while thrash cisterna corrente >trash 30
		
		
		Cantina giornoScadenzaAlluminio=new Cantina();
		giornoScadenzaAlluminio.getCisterna().setContent(1000);//da 1 a 1000
		giornoScadenzaAlluminio.getCisterna().setEvaPerDay(2);//da 1 a 5
		giornoScadenzaAlluminio.getCisterna().setThreshold(30);//30 static
		
		Integer risultatoAlluminio=giornoScadenzaAlluminio.getCisterna().getThreshold();
		Integer risultatoAlluminio1=giornoScadenzaAlluminio.getCisterna().getEvaPerDay();
		
		Cantina giornoScadenzaRame=new Cantina();
		giornoScadenzaRame.getCisterna().setContent(500);//da 1 a 1000
		giornoScadenzaRame.getCisterna().setEvaPerDay(5);//da 1 a 5
		giornoScadenzaRame.getCisterna().setThreshold(30);//30 static
		
		Integer risultatoRame=giornoScadenzaRame.getCisterna().getThreshold();
		Integer risultatoRame1=giornoScadenzaRame.getCisterna().getEvaPerDay();
		
		Cantina giornoScadenzaAcciaio=new Cantina();
		giornoScadenzaAcciaio.getCisterna().setContent(300);//da 1 a 1000
		giornoScadenzaAcciaio.getCisterna().setEvaPerDay(3);//da 1 a 5
		giornoScadenzaAcciaio.getCisterna().setThreshold(30);//30 static
		
		Integer risultatoAcciao=giornoScadenzaAcciaio.getCisterna().getThreshold();
		Integer risultatoAcciaio1=giornoScadenzaAcciaio.getCisterna().getEvaPerDay();
		
		
		System.out.println("[Scadenza cisterna Alluminio]: "+risultatoAlluminio/risultatoAlluminio1);
		System.out.println("[Scadenza cisterna Rame]: "+risultatoRame/risultatoRame1);
		System.out.println("[Scadenza cisterna Acciaio]: "+risultatoAcciao/risultatoAcciaio1);
		
		

}
}

