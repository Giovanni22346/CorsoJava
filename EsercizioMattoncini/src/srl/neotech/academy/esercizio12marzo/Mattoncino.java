package srl.neotech.academy.esercizio12marzo;

import java.util.Scanner;

public class Mattoncino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Digitare numero elementi:");
		Scanner s= new Scanner(System.in);
		int numeroElementi = s.nextInt();
		for (int i=0;i<numeroElementi;i++) {
		MattoncinoLego m= new MattoncinoLego();
		m.setColore("nero");
		m.setLarghezza((int)(Math.random()*100));
		m.setLunghezza((int)(Math.random()*100));
		System.out.println("il mattoncino e' di colore: " +m.getColore());
		System.out.println("il mattoncino e' largo: " +m.getLarghezza());
		System.out.println("il mattoncino e' lungo: " +m.getLunghezza());
		
		}
		}
			
		
		
		
		
		
	}