package Exercise123ManagementStudent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Le Phuong Thanh
 * @Date: 08/09/2016
 * @Version: 1.0
 * @Create Class main handling Sutdent
 *
 */
public class MainClassStudent {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		ManagmentStudent managmentStudent = new ManagmentStudent();
		Student student = new Student();

		System.out.println("==============Managment Student===========");
		addStudent(managmentStudent, student, input);
		selectMenu(managmentStudent, student, input);

	}

	public static void selectMenu(ManagmentStudent managmentStudent,
			Student student, BufferedReader input)
			throws NumberFormatException, IOException {
		System.out.println("Select Menu:  \n1) Search Student \n2) Delete Student \n3) Add Student");
		boolean flag = true;
		while (flag) {
			int number = Integer.parseInt(input.readLine());
			switch (number) {
			case 1:
				searchStudent(managmentStudent, student, input);
				break;
			case 2:
				deleteStudent(managmentStudent, student, input);
				break;
			case 3:
				addStudent(managmentStudent, student, input);
				break;
			default:
				System.out.println("Wrong select!");
				if (selectYN()) {
					continue;
				} else {
					flag = false;
				}
				break;

			}
		}
	}

	public static void addStudent(ManagmentStudent managmentStudent,
			Student student, BufferedReader input) throws IOException {

		System.out.println("Add new student:");
		System.out.println("Enter ID: ");
		String id = input.readLine();

		System.out.println("Enter name: ");
		String name = input.readLine();

		System.out.println("Enter age: ");
		int age = Integer.parseInt(input.readLine());

		System.out.println("Enter place of birthday: ");
		String placeOfBrithday = input.readLine();

		student = new Student(id, name, age, placeOfBrithday);
		managmentStudent.addStudent(id, student);
		System.out.println(managmentStudent.toString());
		
		selectMenu(managmentStudent, student, input);

	}

	public static void searchStudent(ManagmentStudent managmentStudent,
			Student student, BufferedReader input) throws IOException {
		System.out.println("Search Student");

		System.out.println("Enter id to search: ");
		String id = input.readLine();

		if (managmentStudent.searchStrudent(id) != null) {
			System.out.println("Result: \n"
					+ managmentStudent.searchStrudent(id));
		} else
			System.out.println("List is emtry!");
		
		selectMenu(managmentStudent, student, input);
	}

	public static void deleteStudent(ManagmentStudent managmentStudent,
			Student student, BufferedReader input) throws IOException {
		System.out.println("Delete Student");

		System.out.println("Enter id to delete: ");
		String id = input.readLine();
		if (managmentStudent.lenghtOfStudent() != 0) {
			managmentStudent.deleteStudent(id);
			System.out.println("Delete: " + id + " is successfully!");
		} else {
			System.out.println("List Student is emtry!");
		}
		
		selectMenu(managmentStudent, student, input);
	}

	public static boolean selectYN() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Do you want to continue?[Y/N]");
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
