package srl.neotech.academy.calcoloesame;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcoloEsame {


		public static void main(String[] args) {

//		Scrivere un programma java che calcoli il risultato dell’esame di uno studente.
//		Il programma avrà un array(ArrayList) di 2 elementi numerici interi: il primo è il voto della prova scritta, 
//		il secondo della prova orale.
//		Il voto ottenuto nella prova scritta (variabile tra -8 e +8)
//		Il voto ottenuto nella prova orale(variabile tra 0 e 24)
//		il Programma procederà al calcolo del risultato finale in trentesimi procedendo come segue:
//		Il risultato finale è la somma dei risultati.
//
//	1	se il voto scritto è minore (o uguale) di zero e la somma dei voti scritto e orale è maggiore di 18, 
//		lo studente è bocciato.
//		
//	2	se il voto scritto è minore (o uguale) di zero e il voto  orale è minore di 18, lo studente è bocciato.
//		
//	3	se il voto scritto è maggiore di zero e la somma dei voti scritto e orale è minore di 18, lo studente è bocciato.
//		
//	4	se la somma scritto e orale vale 31 o 32 il programma stampa: “congratulazioni: 30 e lode”
//		in tutti gli altri casi lo studente è promosso e viene riportato il voto calcolato.
//	
//		Il programma dovrà chiedere i due voti (scritto, orale) e procedere con il calcolo.

		
		
	    	Scanner scanner=new Scanner(System.in);
			System.out.print("Inserire risultato voto Scritto:");
		    int votoScritto=scanner.nextInt();



	    while (votoScritto<-8  || votoScritto > 8) {
	    	Scanner scanner1=new Scanner(System.in);
			System.out.print("Il numero inserito e' fuori dal range consentito(-8/8), inserire nuovamente il risultato voto Scritto:");
		    votoScritto=scanner1.nextInt();
	    }
	    	
	   
	    System.out.print("Inserire risultato voto Orale:");
    	Scanner scanner1=new Scanner(System.in);
    	int votoOrale=scanner1.nextInt();
	    
	    
	    	
	    while (votoOrale<0 || votoOrale>24) {
	    
	    	System.out.print("Il numero inserito e' fuori dal range consentito(0/24), inserire nuovamente il risultato voto Orale:");
	    	Scanner scanner2=new Scanner(System.in);
	    	votoOrale=scanner2.nextInt();
	    
	    }
	    
	 //   	if (votoOrale <0 || votoOrale  > 24) {
//	 		System.out.print("voto prova orale errato");}	
	    	
	    	
	     if (votoScritto<=0 && votoScritto+votoOrale>18) {
	    	System.out.println("lo studente e' bocciato");}
	    	else if (votoScritto<=0 && votoOrale<18) {
	    		System.out.println("lo studente e' bocciato");}
	    		else if (votoScritto>0 && votoScritto + votoOrale<18) {
	    			System.out.println("lo studente e' bocciato");}
	    			else if (votoScritto + votoOrale ==31||votoScritto + votoOrale ==32)  {
	    				System.out.println("Congratulazioni: 30 e lode");}
	    				else { 
	    				System.out.print("Studente promosso con (votazione): ");}
	    
	    			    		    		
							System.out.print(votoScritto + votoOrale);}

				 {					
		}
}
