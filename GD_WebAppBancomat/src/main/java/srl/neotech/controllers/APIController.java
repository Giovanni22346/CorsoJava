package srl.neotech.controllers;

import org.apache.catalina.authenticator.SingleSignOnListener;
import org.apache.catalina.connector.Response;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.cfg.ConstructorDetector.SingleArgConstructor;

import srl.neotech.model.Aereo;
import srl.neotech.model.SingletonTransazioneBancomat;
import srl.neotech.requestresponse.RequestTransazione;
import srl.neotech.requestresponse.ResponseListaTransazioni;



@RestController
public class APIController {

	
	
	
	@ResponseBody
	@PostMapping(value = "/api/transazioneAdd",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseListaTransazioni Add(@RequestBody RequestTransazione request) {
		SingletonTransazioneBancomat.getInstance().getListaTransazioni().add(request.getTransazioneRequest());
		
		
		
		ResponseListaTransazioni response = new ResponseListaTransazioni();
	    response.setListaTransazioniRestituite(SingletonTransazioneBancomat.getInstance().getListaTransazioni());
	    
		
		return response;
	
	}
	
}
