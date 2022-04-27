package srl.neotech.controllers;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.apache.taglibs.standard.lang.jstl.EqualsOperator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.model.SingletonTransazioneBancomat;
import srl.neotech.model.TipologiaMovimento;
import srl.neotech.model.TransazioneBancomat;
import srl.neotech.requestresponse.ListaTransazioniResponse;
import srl.neotech.requestresponse.ResponseSearchTransazione;
import srl.neotech.requestresponse.RequestEliminaTransazione;




@Controller
public class ViewController {

	

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	
	@RequestMapping(value="/versamento", method = RequestMethod.GET)
	public String versamento() {
		return "versamento";
		
	}
	

	@RequestMapping(value="/prelevamento", method = RequestMethod.GET)
	public String prelevamento() {
		return "prelevamento";
		
	}	
	
	
	
//
//	
//	@RequestMapping(value="/genera_transazioni", method = RequestMethod.GET)
//	public String (Model model) {
//		
//		for (int i=0;i<50;i++) {
//		
//			TransazioneBancomat transazione= new TransazioneBancomat();
//		
//		 
//		
//			transazione.setId(UUID.randomUUID().toString());
//			transazione.setDataEora("14/04/21");
//			transazione.setNominativo("Giovanni");
//			transazione.setOperazione("versamento");
//			transazione.setQuantita(ThreadLocalRandom.current().nextInt(1, 1000 + 1));;
//			transazione.setTaglio(ThreadLocalRandom.current().nextInt(1, 100 + 1));
//			transazione.setTotale(null);
//
//			SingletonTransazioneBancomat.getInstance().getListaTransazioni().add(transazione);
//			
//		}
//		
//		model.addAttribute("numeroTransazioniGenerate",SingletonTransazioneBancomat.getInstance().getListaTransazioni().size());
//		
//		return "genera_transazioni";
//	
//	}	

	
	
	@RequestMapping(value="/elimina-transazione", method = RequestMethod.GET)
	public String eliminaTransazione(@ModelAttribute RequestEliminaTransazione uuidDaEliminare, Model model) {
		
		SingletonTransazioneBancomat.getInstance().getListaTransazioni().removeIf(transazione->transazione.getUUID().equals(uuidDaEliminare.getUuid()));
		//return lista
		ListaTransazioniResponse response=new ListaTransazioniResponse();
		response.setListaTransazioniRestituite(SingletonTransazioneBancomat.getInstance().getListaTransazioni());
		model.addAttribute("lista_transazioni", response);
		return "lista_movimenti";
	}
	
	

	@RequestMapping(value="/lista_movimenti", method = RequestMethod.GET)
	public String lista_transazioni(Model model) {
		ListaTransazioniResponse response= new ListaTransazioniResponse();
		response.setListaTransazioniRestituite(SingletonTransazioneBancomat.getInstance().getListaTransazioni());
		Integer valoreSaldo= new Integer(0);
		for (TransazioneBancomat mov: SingletonTransazioneBancomat.getInstance().getListaTransazioni()) {
			if (mov.getOperazione().equals(TipologiaMovimento.VERSAMENTO)) valoreSaldo= valoreSaldo+(mov.getQuantita()*mov.getTaglio());
			if (mov.getOperazione().equals(TipologiaMovimento.PRELIEVO)) valoreSaldo = valoreSaldo-(mov.getQuantita()*mov.getTaglio());
			
		
		}
		
		
		model.addAttribute("saldo",valoreSaldo);
		model.addAttribute("lista_transazioni", response);
	
	
	
	return "lista_movimenti";
	}
	
	
	
	
	
	
	@RequestMapping(value="/ajax", method = RequestMethod.GET)
	public String ajax() {
		return "ajax";
	}
}
