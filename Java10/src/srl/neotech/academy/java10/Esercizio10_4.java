package srl.neotech.academy.java10;

import java.util.Scanner;
import java.math.MathContext;


public class Esercizio10_4 {

	public static void main(String[] args) {

		
		//calcoli la radice quadrata di un numero ricevuto come argomento
		
		Double num;
		
		Scanner s= new Scanner(System.in);
		System.out.print("Inserire un numero: ");
		num = s.nextDouble();
		Double squareroot = Math.pow(num, 0.5);
		System.out.println("La radice quadrata del numero inserito e': " + num + " = " + squareroot);
		}
		}
