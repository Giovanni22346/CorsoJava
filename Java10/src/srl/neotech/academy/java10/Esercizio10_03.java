package srl.neotech.academy.java10;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Esercizio10_03 {

	public static void main(String[] args) {
		// CREO LA LISTA

		ArrayList<Integer> listaNumeri=new ArrayList<Integer>();

		Scanner scanner=new Scanner(System.in);
		System.out.print("Digitare il primo numero:");
	    int primoNumero=scanner.nextInt();
	    System.out.print("Digitare il secondo numero:");
	    int secondoNumero=scanner.nextInt();
	    Random random = new Random();
	    
	    
        for(int i=0;i<10;i++) {
        	int randomNumber = random.nextInt(secondoNumero + 1 - primoNumero) + primoNumero;
        	//AGGIUNGO UN ELEMENTO
        	listaNumeri.add(randomNumber);
        }
        //ADD ELEMENTO IN UNA CERTA POSIZIONE 
//        listaNumeri.add(4, 78);        
//        
//        listaNumeri.remove(3);
//        listaNumeri.remove(5);
	    
        System.out.println("LArrayList contiene:"+listaNumeri);
        
        //LUNGHEZZA
//        System.out.println("LArrayList è lungo:"+listaNumeri.size()); 
//        
//        //SE LA LISTA CONTIENE UN OGGETTO
//        System.out.println("LArrayList contiene 78:"+listaNumeri.contains(78));
        scanner.close();
	}

}        
