package srl.neotech.academy.fabBirra;

import java.util.ArrayList;

public class Cantina {//100 cisterne casuali

	
	private Cisterna cisterna;
	//Array list cisterne
	
	ArrayList<Cisterna>cisterne=new ArrayList<Cisterna>();
	public Cantina() {
		cisterna=new Cisterna();
	
	
	
	}
	
		public Cisterna getCisterna() {
			return cisterna;
		}

		
		public ArrayList<Cisterna> getCisterne() {
			return cisterne;
		}

		public void setCisterne(ArrayList<Cisterna> cisterne) {
			this.cisterne = cisterne;
		}

		public void setCisterna(Cisterna cisterna) {
			this.cisterna = cisterna;
		}
		
	  
		
		
	}


