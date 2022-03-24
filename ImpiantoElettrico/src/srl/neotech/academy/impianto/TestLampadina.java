package srl.neotech.academy.impianto;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TestLampadina {

	public static void main(String[] args) {

		
//		Definire una lampadina elettrica. Una lampadina può essere accesa, spenta o rotta, e mette a disposizione due sole operazioni: getStato()  che indica lo stato corrente della lampadina 
//		e click() che ne cambia lo stato da accesa a spenta o da spenta a accesa o la rompe. 
//
//		Una lampadina si rompe dopo un certo numero di click Random da 1 a 100 (vedere FabbricaDiBibita).
//		Per testare la classe, scrivere un programma TestLampadina che crea un oggetto della classe Lampadina, chiede all'utente il numero di click 
//		e poi iterativamente effetui il click, visualizzando lo stato.		
//	
		Lampadina l= new Lampadina();
		Scanner s= new Scanner(System.in);
		System.out.println("Inserire numero di click:");
		int numeroClick= s.nextInt();
		
		
		for (int i=0;i<numeroClick;i++) {
			Lampadina click;
			int Randomclick= ThreadLocalRandom.current().nextInt(1, 3+1);
			//Specializzazione con classi 
			
//			
////			if (Randomclick==1) {
////				click = new LampadinaAccesa(); 
////			} else if (Randomclick==2) {
////				click =new LampadinaSpenta();}
////				else {
////				click = new LampadinaRotta();
////				}

			
			//		//Specializzazione con enumerator
//			
				if (Randomclick ==1) {
					l.setClick(Click.ACCESA);
				} else if 
					(Randomclick==2) {
					l.setClick(Click.SPENTA);
				}	else {
					l.setClick(Click.ROTTA);
				
				}
		
				
		
		
		System.out.println(l.getClick());
				
			}
			
	}	
		}
	


		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
