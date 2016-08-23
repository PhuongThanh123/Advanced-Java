package exercise115;

public class NonStringInstrument extends Instrument {

	private String manual;
	
	public String play() {
		
		return getManual();
	}
	public String getManual() {
		return manual;
	}
	public void setManual(String manual) {
		this.manual = manual;
	}
	public NonStringInstrument() {
		super();
	}
	public NonStringInstrument(String manual) {
		super();
		this.manual = manual;
	}
	@Override
	public String toString() {
		return "Using: "+this.manual;
	}
	

}
