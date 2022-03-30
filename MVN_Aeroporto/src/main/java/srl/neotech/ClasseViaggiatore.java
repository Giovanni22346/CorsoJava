package srl.neotech;

import java.util.Random;

public enum ClasseViaggiatore {

	BUSINEES,
	EXCELSIOR,
	TURISTA;
	
	
	public static ClasseViaggiatore generateRandomClasseViaggiatore() {
		 ClasseViaggiatore[]values=ClasseViaggiatore.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
	
	
	}	
	
}
