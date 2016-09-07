package main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 06-Sep-2016 11:13:20 AM
 */
public class Scorelesson {

	private Date date;
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private int lesson;
	private double scoreActive;
	private double scoreAgssiment;
	private double scoreAttendance;

	public Scorelesson() {

	}
	
	/**
	 * @return total score of lesson 
	 */
	public double calTotalScoreLesson() {
		double total = 0;
		total = scoreAttendance * 0.3 + scoreActive * 0.1 + scoreAgssiment
				* 0.6;
		return total;
	}

	

	public Scorelesson(double scoreActive, double scoreAgssiment,
			double scoreAttendance) {
		super();
		this.scoreActive = scoreActive;
		this.scoreAgssiment = scoreAgssiment;
		this.scoreAttendance = scoreAttendance;
	}

	public int getLesson() {
		return lesson;
	}

	public void setLesson(int lesson) {
		this.lesson = lesson;
	}

	public double getScoreActive() {
		return scoreActive;
	}

	public void setScoreActive(double scoreActive) {
		this.scoreActive = scoreActive;
	}

	public double getScoreAgssiment() {
		return scoreAgssiment;
	}

	public void setScoreAgssiment(double scoreAgssiment) {
		this.scoreAgssiment = scoreAgssiment;
	}

	public double getScoreAttendance() {
		return scoreAttendance;
	}

	public void setScoreAttendance(double scoreAttendance) {
		this.scoreAttendance = scoreAttendance;
	}

	public Scorelesson(Date date, int lesson, double scoreActive,
			double scoreAgssiment, double scoreAttendance) {
		super();
		this.date = date;
		this.lesson = lesson;
		this.scoreActive = scoreActive;
		this.scoreAgssiment = scoreAgssiment;
		this.scoreAttendance = scoreAttendance;
		
	}
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public String toString() {
		String s = "\n\tDate: " + dateFormat.format(date) + "\n\tLesson: " + lesson + "\n\tScore Active: "
				+ scoreActive + "\n\tScore Agssiment; " + scoreAgssiment
				+ "\n\tScore Attendance: " + scoreAttendance
				+"\nTotal: "+calTotalScoreLesson();
		return s;
	}

}