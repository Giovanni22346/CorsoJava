package srl.neotech.academy.java10;

import java.util.Random;

public class Esercizio10_01 {

	public static void main(String[] args) {

//		Scrivere un programma Java10_01 che stampi a video 10 numeri casuali compresi fra 1 e 10 (estremi inclusi)
		
	
		System.out.print("Stampa 10 numeri casuali compresi tra 1 e 10:");
		
		for (int i=1;i<=10;i++) {
		int numRandom;
		Random r=new Random();
		numRandom=r.nextInt(11);
		System.out.print(numRandom);
		
	}
	}	
}	
	

