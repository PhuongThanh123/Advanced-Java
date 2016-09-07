package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ManagementClass {
	private ArrayList<Class> arrayCLass = new ArrayList<Class>();
	ManagmentSubject managmentSubject = new ManagmentSubject();

	public ArrayList<Class> getArraySubjects() {
		return arrayCLass;
	}

	public void setArraySubjects() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date startDate = dateFormat.parse("15/07/2016");
		Date endtDate = dateFormat.parse("15/09/2016");

		managmentSubject.setArraySubject1();
		this.arrayCLass.add(new Class(endtDate, "JavaTrainee01", "HD001",
				startDate, 12, managmentSubject.getArraySubject()));

		startDate = dateFormat.parse("15/10/2016");
		endtDate = dateFormat.parse("15/12/2016");

		managmentSubject.setArraySubject2();
		this.arrayCLass.add(new Class(endtDate, ".NETTrainee02", "HD002",
				startDate, 12, managmentSubject.getArraySubject()));
	}

	public void setAllClass() throws ParseException {
		managmentSubject.setAllSubject();
		setArraySubjects();
	}
	public String getClassSelect(int index){
		String s = "";
		s+="\tName Class ";
		for (int i = 0; i < 1; i++) {
			s +=arrayCLass.get(index-1).getNameClass()+"\n";
			//managmentSubject.toStringSelectSubject(index);
		}
		return s;
	}
	public String toStringClass() {
		String s = "";
		s+="\tName Class \tNumber Contract \tStart Date: \tEndDate:\tSumlesson\n";
		s+="-------------------------------------------------------------------\n";
		for (int i = 0; i < arrayCLass.size(); i++) {
			s +="No. "+(i+1)+ arrayCLass.get(i).toString()+"\n";
		}
		return s;
	}

}
