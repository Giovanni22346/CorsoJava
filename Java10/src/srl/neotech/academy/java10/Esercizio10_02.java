package srl.neotech.academy.java10;

import java.util.Random;

public class Esercizio10_02 {

	public static void main(String[] args) {

		//Scrivere un programma Java10_02 che continua a stampare interi casuali compresi fra 1 e 10 

		//fino a che non esce un numero che sia divisibile divisibile per 3	

		System.out.println("Stampa 10 numeri casuali compresi tra 1 e 10:");

	int r= (int)(Math.random()*(10)+1);
	System.out.println(r);
	while (r%3!=0) {
			r=(int)(Math.random()*(10)+1);
			System.out.println(r);

	}
			System.out.println("E uscito un numero divisibile per 3");
					

	}			

	}


