package srl.neotech.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.requestresponse.RequestRegistrazione;




@Controller
public class ViewController {

	

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	
	@RequestMapping(value="/versamento", method = RequestMethod.POST)
	public String versamento() {
		return "versamento";
		
	}
	

	@RequestMapping(value="/registrazione_dati", method = RequestMethod.POST)
	public String registrazioneDati(@ModelAttribute("registrazione") RequestRegistrazione dati_in_input, Model model) {
         System.out.println(dati_in_input.getNominativo());
         System.out.println(dati_in_input.getImporto());
         model.addAttribute("utente", dati_in_input.getNominativo());
         return "lista_movimenti";

	}
	
	
         @RequestMapping(value="/inviodati_get", method = RequestMethod.POST)
     	public String ricezioneDati(@ModelAttribute("mapping_dati") RequestRegistrazione dati_in_input, Model model) {
        	 System.out.println(dati_in_input.getNominativo());
             System.out.println(dati_in_input.getImporto());
             model.addAttribute("utente", dati_in_input.getNominativo());
              return "lista_movimenti";
     	
	}	
         
	

	@RequestMapping(value="/prelevamento", method = RequestMethod.GET)
	public String prelevamento() {
		return "prelevamento";
	}
	
	
	
	@RequestMapping(value="/lista_movimenti", method = RequestMethod.GET)
	public String lista_movimenti() {
		return "lista_movimenti";
	}
	
	
	@RequestMapping(value="/ajax", method = RequestMethod.GET)
	public String ajax() {
		return "ajax";
	}
}
