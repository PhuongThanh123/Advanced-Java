package exercise63Student;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class ManagementStudent {
	Student student = new Student();

	ArrayList<Student> arrayStudent = new ArrayList<Student>();

	public ArrayList<Student> getArrayStudent() {
		return arrayStudent;
	}

	public void setArrayStudent(ArrayList<Student> arrayStudent) {
		this.arrayStudent = arrayStudent;
	}

	public ManagementStudent(ArrayList<Student> arrayStudent) {
		super();
		this.arrayStudent = arrayStudent;
	}

	public ManagementStudent() {
		super();
	}

	public void listEducationEvaluation() {
		long countExcellent = arrayStudent.stream()
				.filter(e -> e.avgAllYear() == 1).count();
		long countGood = arrayStudent.stream().filter(e -> e.avgAllYear() == 2)
				.count();
		long countAverage = arrayStudent.stream()
				.filter(e -> e.avgAllYear() == 3).count();
		long countWeak = arrayStudent.stream().filter(e -> e.avgAllYear() == 4)
				.count();
		System.out.println("Totla Student Excellent: " + countExcellent
				+ "\nTotal Good: " + countGood + "\nTotal Average: "
				+ countAverage + "\nTotal Weak: " + countWeak);
	}
	public void addNewStudent(){
		arrayStudent.add(student);
	}

	public void listAvgGrade10() {
		// Create list content list grade 10
		ArrayList<Student> arayGrade10 = (ArrayList<Student>) arrayStudent
				.stream().filter(e -> e.getGrade() == 10)
				.collect(Collectors.toList());

		// Get number student of grade 10
		int numberSutdent10 = arayGrade10.size();
		// get mark average of grade 10
		DoubleSummaryStatistics doubleSummaryStatistics = arayGrade10.stream()
				.mapToDouble((x) -> x.avgAllYear()).summaryStatistics();

		System.out.println("Number student of Grade is: " + numberSutdent10);
		System.out.println("Average of all grade: "
				+ doubleSummaryStatistics.getAverage());
	}

	public void listAvgGrade11() {
		// Create list content list grade 11
		ArrayList<Student> arayGrade11 = (ArrayList<Student>) arrayStudent
				.stream().filter(e -> e.getGrade() == 11)
				.collect(Collectors.toList());

		// Get number student of grade 10
		int numberSutdent11 = arayGrade11.size();
		// get mark average of grade 10
		DoubleSummaryStatistics doubleSummaryStatistics = arayGrade11.stream()
				.mapToDouble((x) -> x.avgAllYear()).summaryStatistics();

		System.out.println("Number student of Grade is: " + numberSutdent11);
		System.out.println("Average of all grade: "
				+ doubleSummaryStatistics.getAverage());
	}

	public void listAvgGrade12() {
		ArrayList<Student> arayGrade12 = (ArrayList<Student>) arrayStudent
				.stream().filter(e -> e.getGrade() == 12)
				.collect(Collectors.toList());

		// Get number student of grade 10
		int numberSutdent12 = arayGrade12.size();
		// get mark average of grade 10
		DoubleSummaryStatistics doubleSummaryStatistics = arayGrade12.stream()
				.mapToDouble((x) -> x.avgAllYear()).summaryStatistics();

		System.out.println("Number student of Grade is: " + numberSutdent12);
		System.out.println("Average of all grade: "
				+ doubleSummaryStatistics.getAverage());
	}

	@Override
	public String toString() {
		String s="Name: \t Grade: \tMark1 \tMark2 \tAvg All Year";
		for(int i=0;i<arrayStudent.size();i++){
			s+=arrayStudent.get(i).toString()+"\n";
		}
		return s;
	}
	
}
