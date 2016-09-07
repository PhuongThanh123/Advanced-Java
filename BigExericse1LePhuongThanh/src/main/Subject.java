package main;

import java.util.ArrayList;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 06-Sep-2016 11:13:16 AM
 */
public class Subject {

	private String name;
	private String nameTeacher;
	private int numberLesson;
	private ArrayList<Trainee> trainees;
	public Subject() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameTeacher() {
		return nameTeacher;
	}

	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}

	public int getNumberLesson() {
		return numberLesson;
	}

	public void setNumberLesson(int numberLesson) {
		this.numberLesson = numberLesson;
	}

	

	public Subject(String name, String nameTeacher, int numberLesson,
			ArrayList<Trainee> trainees) {
		super();
		this.name = name;
		this.nameTeacher = nameTeacher;
		this.numberLesson = numberLesson;
		this.trainees = trainees;
	}

	public Subject(String name, String nameTeacher, int numberLesson) {
		super();
		this.name = name;
		this.nameTeacher = nameTeacher;
		this.numberLesson = numberLesson;
	}

	@Override
	public String toString() {
		String s = "\t"+name +"\t"+ nameTeacher +"\t\t"+ numberLesson;
		return s;
	}

	public ArrayList<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(ArrayList<Trainee> trainees) {
		this.trainees = trainees;
	}

}