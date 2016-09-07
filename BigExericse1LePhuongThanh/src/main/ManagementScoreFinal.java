package main;

import java.text.ParseException;
import java.util.ArrayList;

public class ManagementScoreFinal {
	
	private ScoreFinal scoreFinal;
	MangementScorelesson mangementScorelesson = new MangementScorelesson();
	
	public ScoreFinal getScoreFinal() {
		return scoreFinal;
	}

	public void setScoreFinal1() throws ParseException {
		mangementScorelesson.setArrayScorelessons2();
		scoreFinal = new ScoreFinal("Good", "Good", 10, 10, mangementScorelesson.getArrayScorelessons1());
	}


	public void setScoreFinal2() throws ParseException {
		mangementScorelesson.setArrayScorelessons1();
		scoreFinal = new ScoreFinal("Good", "Good", 6, 8, mangementScorelesson.getArrayScorelessons1());
	}
	
	public void setScoreFinal3() throws ParseException {
		mangementScorelesson.setArrayScorelessons3();
		scoreFinal = new ScoreFinal("Good", "Good", 4, 10, mangementScorelesson.getArrayScorelessons1());
	}
	
	public void setScoreFinal(ScoreFinal scoreFinal) {
		this.scoreFinal = scoreFinal;
	}
	public void setAllScoreFinal() throws ParseException{
		mangementScorelesson.setAllScorelesson();
		setScoreFinal1();
		setScoreFinal2();
		setScoreFinal3();
	}
	public String toStringScoreFinal() {
		
		return mangementScorelesson.toStringScorelesson()+scoreFinal.toString();
	}
	

}
