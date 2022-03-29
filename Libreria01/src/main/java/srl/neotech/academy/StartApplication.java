package srl.neotech.academy;

import java.util.ArrayList;
import java.util.Scanner;

import org.ajbrown.namemachine.NameGenerator;
import org.apache.commons.text.RandomStringGenerator;
import org.kohsuke.randname.RandomNameGenerator;

public class StartApplication extends Biblioteca {

	public static void main(String[] args) {

		
		ArrayList<Libro> listaLibri= new ArrayList<Libro>();
        ArrayList <Associato> associati = new ArrayList<Associato>(); 
	
			Biblioteca biblioteca = new Biblioteca();	
	
		String convertitoInJason = null;	
	
    
	
		 

		 RandomStringGenerator generator = new RandomStringGenerator
	                .Builder()
	                .withinRange('0', 'z')
	                .build();	 
		  
		 NameGenerator nameGenerator = new NameGenerator();
		 
	
			 
//aggiunta di un libro nella lista libri	CL  
	
	for (int i=0;i<=100;i++) {
		Libro libro = new Libro();
		libro.setGenere(Genere.GIALLO);
		libro.setIdLibro(i);
		libro.setTitolo(generator.generate(10));
		libro.setAutore(nameGenerator.generateName().toString());
		libro.setScaffale(generator.generate(5));
	  	biblioteca.getListaLibri().add(libro);
	
	String a=null;
	
	}	
// aggiunta di un associato nell lista associati	IA  	
	  	
	for (int j=0;j<=100;j++ ) {
		Associato associato = new Associato();
		associato.setNominativo(generator.generate(15));
		associato.setIdAssociato(j);
		associato.setStato(Stato.ATTIVO);
		associato.setIdLibriPresi(associato.getIdLibriPresi());
		biblioteca.getListaAssociati().add(associato);
		
		// rimozione di un libro dall lista libri XL
		
	//	Libro libro1 = new Libro();
	//	biblioteca.getListaLibri().get(i).getIdLibro();
		
		
		
//		ObjectMapper o= new ObjectMapper();
//			convertitoInJason = o.writeValueAsString(biblioteca);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//		System.out.println(convertitoInJason);
//	
	
	
	}
	
	String controllo = "XX";
	String scelta = null;
		
	do {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lista di possibili comandi che l'utente puo eseguire:\n"
//			
			+ "CL	Classificare	Libro		-->aggiunta di un libro alla lista dei libri della Biblioteca\n"
			+ "XL	Rimuovere	Libro		-->rimozione di un libro dalla lista dai libri della Biblioteca\n"
			+ "LL	Lista		Libri		-->visualizzare la lista dei libri e per ogni libro stampare le info\n"
			+ "IA	Iscrivere	Associato	-->aggiunta di un associato alla lista degli Associati\n"
			+ "XA	Cancellare	Associato	-->rimozione di un associato dalla lista degli Associati\n"
			+ "LA	Lista		Associati	-->visualizzare la lista degli associati e per ogni associato stampare le info (compresa la lista dei libriPresi)\n"
			+ "PL	Presa		Libro		-->aggiunta alla lista deli libri dell'associato\n"
			+ "RL	Restituzione	Libro		-->rimozione dalla lista deli libri dell'associato\n");
//	
		System.out.println("Prego inserire istruzione che si vuole eseguire tra quelle sopra elencate:");
		String inserireComando= scan.next();
	
//     	 
			switch (inserireComando) { 
//     		
     		case "CL": 
     			
     			scelta = "CL classificare Libro"; 			
     			Libro libro= new Libro();
     			libro.setIdLibro(biblioteca.getListaLibri().size()+1);
     			Scanner titolo= new Scanner(System.in);
     			System.out.println("Quale titolo vuoi aggiungere?");
     			String titoloDaAggiungere = titolo.next();
     			Scanner autore= new Scanner(System.in);
     			System.out.println("Quale autore vuoi aggiungere?");
     			String autoreDaAggiungere = autore.next();
     			Scanner genere= new Scanner(System.in);
     			System.out.println("Quale genere vuoi aggiungere?");
     			String genereDaAggiungere = genere.next();
     			libro.setScaffale(generator.generate(5));
     			biblioteca.getListaLibri().add(libro);
     			controllo ="CL";
     			System.out.println(libro);
     			System.out.println("E' stato aggiunto un libro:");
     			break; 
    
     		case  "XL":
     			scelta= "XL E' stato rimosso un Libro";
     			controllo = "XL";
     			System.out.println("Quale titolo di libro desideri rimuoveve?");
     			Scanner libroRim = new Scanner(System.in);
     			String libroDaRimuovere = libroRim.next();
     			
     			
     			
     			
     			System.out.println(scelta);
     			break; 
    
     		case "LL":  
     			scelta= "LL Lista Libri";
     			
    			Integer lunghezzaArrayLibri=biblioteca.getListaLibri().size();
    			controllo="LL";
    		for(int i=0;i<lunghezzaArrayLibri;i++) {
    			if((int) (biblioteca.getListaLibri().get(i).getIdLibro())==0){
    			}else {
    			libro=biblioteca.getListaLibri().get(i);
    			System.out.println(libro);
    			}
    			}
    			break;
     		case  "IA": 
     			scelta= "IA E' stato iscritto un nuovo Associato";
     			System.out.println(scelta);
     			break;
     		case "XA": 
     			scelta= "XA E' stato cancellato un Associato"; 
     			System.out.println(scelta);
     			break; 
     		case "LA": 
     			scelta = "LA Lista Associati";
     			System.out.println(scelta);
     			break;
     		case  "PL": 
     			scelta ="PL E' stato preso Presa un Libro";
     			System.out.println(scelta);
     			break; 
     		case "RL": 
     			scelta= "RL E' stato restituito un Libro";
     			System.out.println(scelta);
     			break;
     		case "XX": 
     			scelta= "XX Uscita dal Programma";
     			System.out.println(scelta);
     			break;

     			
     			
     			
			}
		
     			
     			
			}  while(!(controllo.equals("XX")));
			
			System.out.println("[PROGRAMMA TERMINATO]");
     			
	}	
     			
			}

	
	

	
	
	

		

	

