package srl.neotech.academy.morracinese;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		
//		Java_09, che chieda agli utenti due stringhe in ingresso, le stringhe possono valere solo: 
	//	“carta”, “forbice” o “sasso”. Il programma dovrà quindi effettuare i dovuti controlli e dichiarare 
	//	il vincitore secondo le note regole della “morra cinese” 
//		(forbice vince su carta, carta vince su sasso, sasso vince su forbice).	
//		
		
		System.out.println("Scegliere tra: sasso, carta, forbice");
	    Scanner tastiera = new Scanner(System.in);
	    System.out.print("Scelta del primo giocatore: ");
	    String primoGiocatore = tastiera.next();
	    
	    
	    System.out.print("Scelta del secondo giocatore: ");
	    String secondoGiocatore = tastiera.next();
	    
	    if (primoGiocatore.equals(secondoGiocatore))
	      System.out.println("Pareggio!");
	    else if (primoGiocatore.equals("sasso") && secondoGiocatore.equals("forbice")
	             || primoGiocatore.equals("carta") && secondoGiocatore.equals("sasso")
	             || primoGiocatore.equals("forbice") && secondoGiocatore.equals("carta"))
	      System.out.println("Ha vinto il primo giocatore!");
	    else
	      System.out.println("Ha vinto il secondo giocatore!");
	    
	}
}