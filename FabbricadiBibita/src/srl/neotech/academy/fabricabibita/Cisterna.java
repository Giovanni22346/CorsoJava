package srl.neotech.academy.fabricabibita;

public class Cisterna {
	
	private Integer content;
	private Integer evapPerDay;
	private Integer threshold;
	private Tipologia tipologia;
	
	
	
	public Cisterna(){

		threshold=30;
		
	}



	public Integer getContent() {
		return content;
	}



	public void setContent(Integer content) {
		this.content = content;
	}



	public Integer getEvapPerDay() {
		return evapPerDay;
	}



	public void setEvapPerDay(Integer evapPerDay) {
		this.evapPerDay = evapPerDay;
	}



	public Integer getThreshold() {
		return threshold;
	}



	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}



	public Tipologia getTipologia() {
		return tipologia;
	}



	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}



	public void setEvapDay(int randomEvap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return this.getTipologia()+"--"+this.getContent()+"--"+this.getEvapPerDay()+"--"+this.getThreshold();
	}
	
	
}
