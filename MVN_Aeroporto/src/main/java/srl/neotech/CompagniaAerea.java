package srl.neotech;

import java.util.Random;

public enum CompagniaAerea {

	

		Ryanair,//boing commercial airplanes boing737-400 posti 188
		Wizz_Air,//airbusaindustries airbusA320 posti 195
		Volotea,//boing commercial airplanes boing737-800 posti 189
		EasyJet,//airbusaindustries airbusA318-100 posti 132
		Eurowings,//airbusaindustries airbusA319-100 posti 156
		ITA_Italia_Trasporto_Aereo,//Embraer(Azienda aereonautica brasiliana) embraerE-190 posti 114
		Vueling_Airlines,//airbusaindustries airbusA320-200 posti186
		Lufthansa;//boing commercial airplanes boing747 posti 410
		
		
		

	public static CompagniaAerea generateRandomCompagniaAerea() {
		CompagniaAerea[]values=CompagniaAerea.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
		
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

