package srl.neotech.academy.fabricabibita;

	
	import java.util.ArrayList;

	public class Cantina {

		private ArrayList<Cisterna> cisterne=new ArrayList<Cisterna>();
		
		
		public Cantina() {
			cisterne=new ArrayList<Cisterna>();
		}


		public ArrayList<Cisterna> getCisterne() {
			return cisterne;
		}


		public void setCisterne(ArrayList<Cisterna> cisterne) {
			this.cisterne = cisterne;
		}
		
		
	}
	
	
	

