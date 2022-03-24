package srl.neotech.academy.esercizio12marzo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		// inserisci comando scanner per introdurre input
			System.out.print("Inserisci prima lettera Giocatore 1:");
			Scanner scan= new Scanner(System.in);
		// inserisci PRIMO Valore ed inizializzalo
		
			String valore = scan.nextLine();
		 
		// inserisci SECONDO Valore e inizializzalo
			System.out.print("Inserisci seconda lettera Giocatore 2:");
			String valore1 = scan.nextLine();
		
		
		if( valore =="f" && valore1 =="s") {
			System.out.print("Vince Giocatore 2!!!!");
			
		}	
		else if (valore=="f" && valore1=="c") {
			System.out.print("Vince  Giocatore 1!!!");
		}   
		else if (valore=="s" && valore1=="c");	{	
			System.out.print("Vince Giocatore 2!!!");
		
		}
		}
		
		
	}
	
		

	

