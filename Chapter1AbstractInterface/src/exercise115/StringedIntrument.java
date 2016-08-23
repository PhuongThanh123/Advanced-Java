package exercise115;

public class StringedIntrument extends Instrument {
	private int numberTune;

	public int getNumberTune() {
		return numberTune;
	}

	public void setNumberTune(int numberTune) {
		this.numberTune = numberTune;
	}

	public String play() {
		String s;
		s = "Name: "+this.getName() + ", Number Tune: " + getNumberTune();
		return s;
	}

	

}
