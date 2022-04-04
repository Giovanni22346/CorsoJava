package srl.neotech;

import java.util.Random;

public enum ClassePasseggero {

	BUSINESS,
	EXCELSIOR,
	TURISTA;
	
	
	public static ClassePasseggero generateRandomPasseggero() {
		 ClassePasseggero[]values=ClassePasseggero.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
	
	
	}	
	
}
