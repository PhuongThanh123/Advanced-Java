package exercise115;
/**
 * Author: Le Phuong Thanh
 * Date: 23/08/2016
 * Version: 1.0
 * Create class StringIntrument
 *
 */

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
