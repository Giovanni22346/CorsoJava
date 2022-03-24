package srl.neotech.academi.verifica;

public class Astronave implements IAstronave{

	private int velocita;


	@Override
	public String decolla(int velocita) {
		this.velocita=velocita;
		String valoreRitornato="Ho impostato la velocità iniziale:"+velocita;
		return valoreRitornato;
	}

	@Override
	public String accellera(int velocita) {
		this.velocita=this.velocita+velocita;
		String valoreRitornato="Ho accellerato a:"+velocita;
		return valoreRitornato;
	}

	@Override
	public String decellera(int velocita) {
		this.velocita=this.velocita-velocita;
		if(this.velocita<0) this.velocita=0;
		String valoreRitornato="Ho decellerato a:"+velocita;
		return valoreRitornato;
	}

	public int getVelocita() {
		return velocita;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

	
}

