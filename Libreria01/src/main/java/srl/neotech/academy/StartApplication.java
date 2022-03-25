package srl.neotech.academy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.ajbrown.namemachine.NameGenerator;
import org.apache.commons.text.RandomStringGenerator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class StartApplication extends Biblioteca {

	public static void main(String[] args) {
    
			
	String convertitoInJason = null;	
	try {
    ArrayList<Libro> listaLibri= new ArrayList<Libro>();
    ArrayList <Associato> associati = new ArrayList<Associato>(); 
	
		 Biblioteca biblioteca = new Biblioteca();

		 RandomStringGenerator generator = new RandomStringGenerator
	                .Builder()
	                .withinRange('0', 'z')
	                .build();	 
		  
		 NameGenerator nameGenerator = new NameGenerator();
		 
	  
	
	for (int i=0;i<=100;i++) {
		Libro libro = new Libro();
		libro.setGenere(Genere.GIALLO);
		libro.setIdLibro(i);
		libro.setTitolo(generator.generate(10));
		libro.setAutore(nameGenerator.generateName().toString());
		libro.setScaffale(generator.generate(5));
	  	biblioteca.getListaLibri().add(libro);
	
	for (int j=0;j<=100;j++ ) {
		Associato associato = new Associato();
		associato.setNominativo(generator.generate(15));
		associato.setIdAssociato(j);
		associato.setStato(Stato.ATTIVO);
		associato.setIdLibriPresi(null);
		biblioteca.getListaAssociati().add(associato);
		
		
		
//		ObjectMapper o= new ObjectMapper();
//			convertitoInJason = o.writeValueAsString(biblioteca);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
	//	System.out.println(convertitoInJason);
	
	
		String scelta = null;
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lista di possibili comandi che l'utente puo eseguire:"
//			
			+ "CL	classificareLibro  -->aggiunta di un libro alla lista dei libri della Biblioteca\n"
			+ "XL	rimuovereLibro     -->rimozione di un libro dalla lista dai libri della Biblioteca\n"
			+ "LL   listaLibri         -->visualizzare la lista dei libri e per ogni libro stampare le info\n"
			+ "IA	iscrivereAssociato -->aggiunta di un associato alla lista degli Associati\n"
			+ "XA	cancellareAssociato-->rimozione di un associato dalla lista degli Associati\n"
			+ "LA   listaAssociati     -->visualizzare la lista degli associati e per ogni associato stampare le info (compresa la lista dei libriPresi)\n"
			+ "PL	presaLibro         -->aggiunta alla lista deli libri dell'associato\n"
			+ "RL	restituzioneLibro  -->rimozione dalla lista deli libri dell'associato\n");
//	
		System.out.println("Prego inserire istruzione che si vuole eseguire tra quelle sopra elencate:");
		String inserireComando= scan.next();
	
//     	 
			switch (inserireComando) { 
//     		
     		case "CL": 
     			scelta = "CL classificare Libro"; 			
     			System.out.println("scelta");
     		break; 
     		case  "XL":
     			scelta= "XL Rimuovere Libro";
     			System.out.println("scelta");
     		break; 
     		case "LL listaLibri":  
     			scelta= "LL Lista Libri";
     			System.out.println("scelta");
     			break; 
     		case  "IA IscrivereAssociato": 
     			System.out.println("scelta");
     			break;
     		case "XA CancellareAssociato": 
     			System.out.println("scelta");
     			break; 
     		case "LA ListaAssociati": 
     			System.out.println("scelta");
     			break;
     		case  "PL PresaLibro": 
     			System.out.println("scelta");
     			break; 
     		case "RL RestituzioneLibro": 
     			System.out.println("scelta");
     			break;
     		
     		
			}
	}
	
	
	
	
	
	
	
	

		

	

