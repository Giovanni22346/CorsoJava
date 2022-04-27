package srl.neotech.controllers;

import java.util.UUID;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.SingletonTransazioneBancomat;

import srl.neotech.requestresponse.ResponseSearchTransazione;
import srl.neotech.requestresponse.RequestTransazione;



@RestController
public class APIController {

	
	
		
	@ResponseBody
	@PostMapping(value = "/api/add",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchTransazione add(@RequestBody RequestTransazione request) {
		ResponseSearchTransazione response=new ResponseSearchTransazione();
		
		
		
//	try {
			SingletonTransazioneBancomat.getInstance().getListaTransazioni().add(request.getTransazione());		
			response.setTransazioni(SingletonTransazioneBancomat.getInstance().getListaTransazioni());
//			response.setCode(StatusCode.OK.toString());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			response.setCode(StatusCode.ERROR.toString());
//			response.setMsg(e.getMessage());
//			e.printStackTrace();
//		}
		return response;
		
		
	}
		
		
		@ResponseBody
		@GetMapping(value = "api/delete/{uuid}",produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseSearchTransazione Delete(@PathVariable("uuid") String uuid) {	
			ResponseSearchTransazione response=new ResponseSearchTransazione();
//		try {
			
		
		SingletonTransazioneBancomat.getInstance().getListaTransazioni().removeIf(transazioneRequest->transazioneRequest.getUUID().equals(uuid));
		response.setTransazioni(SingletonTransazioneBancomat.getInstance().getListaTransazioni());
//		response.setCode(StatusCode.OK.toString());
//		} catch (Exception e) {
//		// TODO Auto-generated catch block
//		response.setCode(StatusCode.ERROR.toString());
//		response.setMsg(e.getMessage());
//		e.printStackTrace();
//		}
		return response;
		
	}
	
}
