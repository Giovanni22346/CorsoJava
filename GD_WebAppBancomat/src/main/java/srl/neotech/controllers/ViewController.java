package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	
	
	@RequestMapping(value="/lista_movimenti", method = RequestMethod.GET)
	public String lista_movimenti() {
		return "lista_movimenti";
	}
	
	
	
	@RequestMapping(value="/ajax", method = RequestMethod.GET)
	public String ajax() {
		return "ajax";
	}
}
