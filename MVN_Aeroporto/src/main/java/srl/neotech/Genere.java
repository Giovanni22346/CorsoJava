package srl.neotech;

import java.util.Random;

public enum Genere {

	MASCHIO,
	FEMMINA;
	
	
	public static Genere generateRandomGenere() {
        Genere[] values = Genere.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
	
}
}