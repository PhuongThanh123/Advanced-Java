package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 06-Sep-2016 11:13:15 AM
 */
public class Class {

	private Date endDate;
	private String nameClass;
	private String numberContract;
	private Date startDate;
	private int sumLesson;
	private ArrayList<Subject> subjects;
	public Class(){

	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public String getNumberContract() {
		return numberContract;
	}

	public void setNumberContract(String numberContract) {
		this.numberContract = numberContract;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getSumLesson() {
		return sumLesson;
	}

	public void setSumLesson(int sumLesson) {
		this.sumLesson = sumLesson;
	}

	

	public Class(Date endDate, String nameClass, String numberContract,
			Date startDate, int sumLesson) {
		super();
		this.endDate = endDate;
		this.nameClass = nameClass;
		this.numberContract = numberContract;
		this.startDate = startDate;
		this.sumLesson = sumLesson;
	}

	public Class(Date endDate, String nameClass, String numberContract,
			Date startDate, int sumLesson, ArrayList<Subject> subjects) {
		super();
		this.endDate = endDate;
		this.nameClass = nameClass;
		this.numberContract = numberContract;
		this.startDate = startDate;
		this.sumLesson = sumLesson;
		this.subjects = subjects;
	}
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
	



	@Override
	public String toString() {
		String s="";
		s="\t"+nameClass+"\t"+numberContract+"\t\t\t"+dateFormat.format(startDate)+"\t"+dateFormat.format(endDate)+"\t"+sumLesson;
		return s;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

	

}