package exercise63Student;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ManagementStudent {
	Student student = new Student();

	// ArrayList<Student> arrayStudent = new ArrayList<Student>();
	ArrayList<Student> arrayListFile = new ArrayList<Student>();

	public ManagementStudent() {
		super();
	}

	public ManagementStudent(Student student, ArrayList<Student> arrayListFile) {
		super();
		this.student = student;
		this.arrayListFile = arrayListFile;
	}

	public ArrayList<Student> getArrayListFile() {
		return arrayListFile;
	}

	public void setArrayListFile(ArrayList<Student> arrayListFile) {
		this.arrayListFile = arrayListFile;
	}

	public void listEducationEvaluation() {
		long countExcellent = arrayListFile.stream()
				.filter(e -> e.gradedStudent() == 1).count();
		long countGood = arrayListFile.stream()
				.filter(e -> e.gradedStudent() == 2).count();
		long countAverage = arrayListFile.stream()
				.filter(e -> e.gradedStudent() == 3).count();
		long countWeak = arrayListFile.stream()
				.filter(e -> e.gradedStudent() == 4).count();
		System.out.println("Totla Student Excellent: " + countExcellent
				+ "\nTotal Good: " + countGood + "\nTotal Average: "
				+ countAverage + "\nTotal Weak: " + countWeak);
	}

	public void addNewStudent() {
		converFile();
		arrayListFile.add(student);
		
	}

	public void converFile() {
		try {
			arrayListFile = (ArrayList<Student>) readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void listAvgGrade10() {
		converFile();
		// Create list content list grade 10
		ArrayList<Student> arayGrade10 = (ArrayList<Student>) arrayListFile
				.stream().filter(e -> e.getGrade() == 10)
				.collect(Collectors.toList());

		// Get number student of grade 10
		int numberSutdent10 = arayGrade10.size();
		// get mark average of grade 10
		DoubleSummaryStatistics doubleSummaryStatistics = arayGrade10.stream()
				.mapToDouble((x) -> x.avgAllYear()).summaryStatistics();
		System.out.println("List report Grade 10: ");
		System.out.println("Number student of Grade is: " + numberSutdent10);
		System.out.println("Average of all grade: "
				+ doubleSummaryStatistics.getAverage());
	}

	public void listAvgGrade11() {
		converFile();
		// Create list content list grade 11
		ArrayList<Student> arayGrade11 = (ArrayList<Student>) arrayListFile
				.stream().filter(e -> e.getGrade() == 11)
				.collect(Collectors.toList());

		// Get number student of grade 10
		int numberSutdent11 = arayGrade11.size();
		// get mark average of grade 10
		DoubleSummaryStatistics doubleSummaryStatistics = arayGrade11.stream()
				.mapToDouble((x) -> x.avgAllYear()).summaryStatistics();

		System.out.println("List report Grade 11: ");
		System.out.println("Number student of Grade is: " + numberSutdent11);
		System.out.println("Average of all grade: "
				+ doubleSummaryStatistics.getAverage());
	}

	public void listAvgGrade12() {
		converFile();
		ArrayList<Student> arayGrade12 = (ArrayList<Student>) arrayListFile
				.stream().filter(e -> e.getGrade() == 12)
				.collect(Collectors.toList());

		// Get number student of grade 10
		int numberSutdent12 = arayGrade12.size();
		// get mark average of grade 10
		DoubleSummaryStatistics doubleSummaryStatistics = arayGrade12.stream()
				.mapToDouble((x) -> x.avgAllYear()).summaryStatistics();

		System.out.println("List report Grade 12: ");
		System.out.println("Number student of Grade is: " + numberSutdent12);
		System.out.println("Average of all grade: "
				+ doubleSummaryStatistics.getAverage());
	}

	public List<Student> readFile() throws FileNotFoundException,
			IOException {
		// System.out.println("Name: \t\t Grade: Mark1 \tMark2 \tAvg \tAll Year");
		double avg = 0;
		List<Student> listStudent = new ArrayList<Student>();
		Student student;
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src/exercise63Student/tongketnamhoc.txt")))) {
			while (in.available()>0) {
				student = new Student();
				student.setName(in.readUTF());
				student.setGrade(in.readInt());
				student.setMark1(in.readDouble());
				student.setMark2(in.readDouble());
				avg = (student.getMark1() + student.getMark2() * 2) / 3;
				DecimalFormat decimalFormat = new DecimalFormat("###.##");
				avg = Double.parseDouble(decimalFormat.format(avg));
				// System.out.println(student.toString());
				listStudent.add(student);
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return listStudent;
	}

	public void writerFile(Student student)
			throws FileNotFoundException, IOException {
		addNewStudent();
		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(
						"src/exercise63Student/tongketnamhoc.txt", true)))) {
			out.writeUTF(student.getName());
			out.writeInt(student.getGrade());
			out.writeDouble(student.getMark1());
			out.writeDouble(student.getMark2());
			System.out.println("written is recorded success");
		}

	}

	@Override
	public String toString() {
		converFile();
		String s = "Name: \t Grade: \tMark1 \tMark2 \tAvg All Year\n";
		for (int i = 0; i < arrayListFile.size(); i++) {
			s += arrayListFile.get(i).toString() + "\n";
		}
		return s;
	}

}
