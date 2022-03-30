package srl.neotech;

import java.util.Random;

public enum StatoPasseggero {

	IMBARCATO,
	IN_CHECKIN,
	CHECKOUT;
	
	
	public static StatoPasseggero generateRandomStatoPasseggero() {
        StatoPasseggero[] values = StatoPasseggero.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
	
	}
	
}
