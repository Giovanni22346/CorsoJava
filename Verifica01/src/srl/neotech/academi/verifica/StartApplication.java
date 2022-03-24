package srl.neotech.academi.verifica;

import java.util.Scanner;

public class StartApplication {

	public static void main(String[] args) {

		
		
		Astronave falcon = new Astronave();
		Scanner s= new Scanner(System.in);
		System.out.println("Impostare la velocita iniziale:");
		int velocitaIniziale= s.nextInt();
		
		
		int b=98;
		String risultatoDelDecollo= falcon.decolla(velocitaIniziale);
		System.out.println(risultatoDelDecollo);
		System.out.println("Impostare il numero di manovre:");
		int numeroManovre= s.nextInt();
		for (int i=0;i<numeroManovre;i++) {
		
			
			System.out.println("Premere A per Accellerare o D per Decellerare");
			String manovra= s.next();
			while(!(manovra.equals("A")|| manovra.equals("D"))) {
				System.out.println("Hai sbagliato!!!La manovra deve essere A oppure D");
				System.out.println("premere A per accellerare oppure D per decellerare");
				manovra = s.next();
			}
			
			System.out.println("Impostare la velocita' della manovra:");	
				int velocitaDaImpostare =s.nextInt();
				while (velocitaDaImpostare<0) {
					System.out.println("Hai sbagliato!!!la velocita' deve essere maggiore di 0");
					System.out.println("Impostare la velocita' della manovra:");
					velocitaDaImpostare = s.nextInt();		
					
				}
			
			String risultatoManovra=null;
			if(manovra.equals("A")) risultatoManovra= falcon.accellera(velocitaDaImpostare);
			if(manovra.equals("D")) risultatoManovra= falcon.decellera(velocitaDaImpostare);
			System.out.println(risultatoManovra);
			
			}
			
		    System.out.println("La velocita finale dell'Astronave e':" +falcon.getVelocita());	
		    	
		}
		
		
	}

