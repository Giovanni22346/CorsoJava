package srl.neotech.academy.java07;

import java.util.Scanner;


public class Giorno07_03 {


	public static void main(String[] args) {

		//Scrivere un programma Java07_03 che stampi le tabellina del numero dato come argomento
	
		System.out.print (" Inserisci numero intero ");
		Scanner s1= new Scanner(System.in);
		int n=s1.nextInt();
		
		
		
		System.out.print("Tabellina del numero scelto:");
		
		 {
		    for (int j = 1; j <= 10; j++) {
			int prodotto = n*j;
			System.out.print(n*j+ " "); 
		    }
			
		}
	}
		
}	
	
	


