package exercise63Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;



public class MainClassStudent {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		ManagementStudent managementStudent = new ManagementStudent();
		Student student = new Student();
		
		
		selectMenu(student, input, managementStudent);
	}

	public static void selectMenu(Student student, BufferedReader input,
			ManagementStudent managementStudent) throws FileNotFoundException,
			IOException {
		boolean flag = true;
		while (flag) {
			System.out
					.println("Select Menu: \n1) View List \n2) Add New \n3) View Report \n4) Exit");
			int number = Integer.parseInt(input.readLine());
			switch (number) {
			case 1:
				System.out.println(managementStudent.toString());
				break;
			case 2:
				addNemStudent(student, input, managementStudent);
				//managementStudent.arrayListFile.add(student);
				//managementStudent.writerFile(student);
				
				break;
			case 3:
				selectGade(student, input, managementStudent);
				break;
			default:
				if (selectYN())
					continue;
				else
					flag = false;
				break;
			}
		}

	}

	public static void selectGade(Student student, BufferedReader input,
			ManagementStudent managementStudent) throws NumberFormatException,
			IOException {
		boolean flag = true;
		while (flag) {
			System.out
					.println("Select Gade: \n1) Grade 10 \n2) Grade 11 \n3) Grade 12");
			int grade = Integer.parseInt(input.readLine());
			switch (grade) {
			case 1:
				managementStudent.listAvgGrade10();
				break;
			case 2:
				managementStudent.listAvgGrade11();
				break;
			case 3:
				managementStudent.listAvgGrade12();
				break;
			default:
				if (selectYN())
					continue;
				else
					flag = false;
				break;
			}
		}

	}

	public static void addNemStudent(Student student, BufferedReader input,
			ManagementStudent managementStudent) throws NumberFormatException,
			IOException {
		System.out.println("======Add new Student======");
		System.out.println("Enter name: ");
		String name = input.readLine();

		System.out.println("Enter grade: ");
		int grade = Integer.parseInt(input.readLine());

		System.out.println("Enter mark 1: ");
		double mark1 = Double.parseDouble(input.readLine());

		System.out.println("Enter mark 2: ");
		double mark2 = Double.parseDouble(input.readLine());

		student = new Student(name, grade, mark1, mark2);
		managementStudent.addNewStudent();
		managementStudent.writerFile(student);
		System.out.println(managementStudent.toString());

	}

	

	public static boolean selectYN() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Do you want to continue");
		String st = input.readLine();
		boolean flag = false;
		while (!flag) {
			switch (st) {
			case "N":
			case "NO":
			case "no":
			case "n":
				return false;

			case "Y":
			case "YES":
			case "yes":
			case "y":
				return true;
			default:
				System.out.println("Choose again!");
				st = input.readLine();
				break;
			}

		}

		return false;
	}
	

}
