package Exercise;

import java.util.ArrayList;

public class Exercise17ArrayCD {
	private ArrayList<Exercise17CD> arrayCD;

	public Exercise17ArrayCD(ArrayList<Exercise17CD> arrayCD) {
		super();
		this.arrayCD = arrayCD;
	}

	public Exercise17ArrayCD() {
		super();
	}

	public ArrayList<Exercise17CD> getArrayCD() {
		return arrayCD;
	}

	public void setArrayCD(ArrayList<Exercise17CD> arrayCD) {
		this.arrayCD = arrayCD;
	}

	@Override
	public String toString() {
		String s = null;
		if (arrayCD.size() != 0) {
			s += "--------------List of CD---------------";
			for (int i = 0; i < arrayCD.size(); i++) {
				s += arrayCD.get(i).toString();
				s += "-------------------------------------";
			}
			
		}
		return s;
	}

	
	

	
	

}
