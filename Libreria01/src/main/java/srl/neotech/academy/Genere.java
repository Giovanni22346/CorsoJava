package srl.neotech.academy;

public enum Genere {

	GIALLO,
	DRAMMATICO,
	NARRATIVA,
	HORROR,
	CLASSICI;
	
	public static Genere getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    public static void main(String[] args) {
        System.out.println(Genere.getRandom());
    }
}
	

