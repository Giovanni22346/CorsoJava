package srl.neotech;

import java.util.Random;

public enum ClassePasseggero {

	BUSINEES,
	EXCELSIOR,
	TURISTA;
	
	
	public static ClassePasseggero generateRandomClassePasseggero() {
		 ClassePasseggero[]values=ClassePasseggero.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
	
	
	}	
	
}
