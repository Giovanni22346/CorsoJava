package srl.neotech.controllers;

import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.SingletonTransazioneBancomat;
import srl.neotech.requestresponse.RequestTransazione;
import srl.neotech.requestresponse.ResponseListaTransazioni;



@RestController
public class APIController {

	
	
	
	@ResponseBody
	@PostMapping(value = "/api/add",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseListaTransazioni Add(@RequestBody RequestTransazione request) {
		request.getTransazioneRequest().setUUID(UUID.randomUUID().toString());
		SingletonTransazioneBancomat.getInstance().getListaTransazioni().add(request.getTransazioneRequest());
		
		ResponseListaTransazioni response = new ResponseListaTransazioni();
	    response.setListaTransazioniRestituite(SingletonTransazioneBancomat.getInstance().getListaTransazioni());
	    
		return response;
	
	}	
		
		@ResponseBody
		@GetMapping(value = "/api/transazione/delete{uuid}",produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseListaTransazioni Delete(@PathVariable("uuid") String UUID_transazioni) {
			ResponseListaTransazioni response = new ResponseListaTransazioni();
			SingletonTransazioneBancomat.getInstance().getListaTransazioni().removeIf(transazioneRequest->transazioneRequest.getUUID().equals(UUID_transazioni));
			
			
			
		    response.setListaTransazioniRestituite(SingletonTransazioneBancomat.getInstance().getListaTransazioni());
		    		
			return response;
		
		
		
	}
	
}
