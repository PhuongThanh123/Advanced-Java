package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MangementScorelesson {
	
	private ArrayList<Scorelesson> arrayScorelessons = new ArrayList<Scorelesson>();
	
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");

	public ArrayList<Scorelesson> getArrayScorelessons1() {
		return arrayScorelessons;
	}
	public ArrayList<Scorelesson> getArrayScorelessons2() {
		return arrayScorelessons;
	}
	public ArrayList<Scorelesson> getArrayScorelessons3() {
		return arrayScorelessons;
	}


	/**
	 * @throws ParseException
	 * Method: set information score lesson of trainee 1 daily. 
	 * return list score of daily
	 */
	public void setArrayScorelessons1() throws ParseException {
		arrayScorelessons = new ArrayList<Scorelesson>();
		
		
		Date date=dateFormat.parse("12/08/2016");
		this.arrayScorelessons.add(new Scorelesson(date, 1, 10, 10, 10));
		
		date=dateFormat.parse("13/08/2016");
		this.arrayScorelessons.add(new Scorelesson(date, 2, 5, 10, 10));
		
		date=dateFormat.parse("14/08/2016");
		this.arrayScorelessons.add(new Scorelesson(date, 3, 0, 10, 5));
	}
	/**
	 * @throws ParseException
	 * Method: set information score lesson of trainee 2 daily. 
	 * return list score of daily
	 */
	public void setArrayScorelessons2() throws ParseException {
		arrayScorelessons = new ArrayList<Scorelesson>();
		
		
		Date date=dateFormat.parse("12/08/2016");
		this.arrayScorelessons.add(new Scorelesson(date, 1, 10, 10, 10));
		
		date=dateFormat.parse("13/08/2016");
		this.arrayScorelessons.add(new Scorelesson(date, 2, 5, 10, 10));
		
		date=dateFormat.parse("14/08/2016");
		this.arrayScorelessons.add(new Scorelesson(date, 3, 0, 10, 5));
	}
	/**
	 * @throws ParseException
	 * Method: set information score lesson of trainee 3 daily. 
	 * return list score of daily
	 */
	public void setArrayScorelessons3() throws ParseException {
		arrayScorelessons = new ArrayList<Scorelesson>();
		
		
		Date date=dateFormat.parse("12/08/2016");
		this.arrayScorelessons.add(new Scorelesson(date, 1, 5, 5, 10));
		
		date=dateFormat.parse("13/08/2016");
		this.arrayScorelessons.add(new Scorelesson(date, 2, 0, 0, 5));
		
		date=dateFormat.parse("14/08/2016");
		this.arrayScorelessons.add(new Scorelesson(date, 3, 0, 5, 5));
	}

	public MangementScorelesson(ArrayList<Scorelesson> arrayScorelessons) {
		super();
		this.arrayScorelessons = arrayScorelessons;
	}

	public MangementScorelesson() {
		super();
	}
	
	public void deleteScore(int index){
		arrayScorelessons.remove(index-1);
	}
	public void addScore(Scorelesson se){
		arrayScorelessons.add(se);
	}
	/**
	 * set all array score lesson
	 * @throws ParseException
	 */
	public void setAllScorelesson() throws ParseException{
		setArrayScorelessons1();
		setArrayScorelessons2();
		setArrayScorelessons3();
	}

	public String toStringScorelesson() {
		String s;
		s="--List Score--\n";
		for(int i=0;i<arrayScorelessons.size();i++){
			s+="\t"+arrayScorelessons.get(i).toString();
		}
		return s;
	}
	
	

}
