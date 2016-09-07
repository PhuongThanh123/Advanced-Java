package main;

import java.text.ParseException;
import java.util.ArrayList;

public class ManagmentSubject {

	private ArrayList<Subject> arraySubject = new ArrayList<Subject>();
	ManagementTrainee managementTrainee = new ManagementTrainee();

	public ArrayList<Subject> getArraySubject() {
		return arraySubject;
	}

	public void setArraySubject1() throws ParseException {

		managementTrainee.setArrayTrainee1();
		this.arraySubject.add(new Subject("Java Advance", "Ms.Ngoc", 10,
				managementTrainee.getArrayTrainee()));

		managementTrainee.setArrayTrainee2();
		this.arraySubject.add(new Subject("Java Basic", "Ms.Phuong", 10,
				managementTrainee.getArrayTrainee()));

		managementTrainee.setArrayTrainee3();
		this.arraySubject.add(new Subject("Java Level 1", "Ms.Thao", 10,
				managementTrainee.getArrayTrainee()));
	}

	public void setArraySubject2() throws ParseException {

		managementTrainee.setArrayTrainee1();
		this.arraySubject.add(new Subject(".Net 1 2 3", "Ms.Hung", 12,
				managementTrainee.getArrayTrainee()));

		managementTrainee.setArrayTrainee2();
		this.arraySubject.add(new Subject(".Net 4 5 6", "Ms.Tuan", 12,
				managementTrainee.getArrayTrainee()));

	}
	public void setAllSubject() throws ParseException{
		managementTrainee.setAllTrainee();
		setArraySubject1();
		setArraySubject2();
	}
	

	public String toStringSubject() {
		String s="";
		s+="\tName Subject: \tName Teacher: \tNumber Lesson: \n";
		for(int i=0;i<arraySubject.size();i++){
			s+="STT"+(i+1)+arraySubject.get(i).toString()+"\n";
		}
		return s;
	}
	
}
