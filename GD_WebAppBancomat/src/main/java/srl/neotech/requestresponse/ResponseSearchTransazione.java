package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.TransazioneBancomat;

public class ResponseSearchTransazione {

	
	ArrayList<TransazioneBancomat> transazioni = new ArrayList<TransazioneBancomat>();


	private String code;
	
	private String msg;
	

	public ArrayList<TransazioneBancomat> getTransazioni() {
		return transazioni;
	}

	public void setTransazioni(ArrayList<TransazioneBancomat> transazioni) {
		this.transazioni = transazioni;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
