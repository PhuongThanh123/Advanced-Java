package exercise110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClass110ManageInformation {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			Teacher teacher = new Teacher();
			Student student = new Student();
			ManagementTeacherStudent managementTeacherStudent = new ManagementTeacherStudent();

			ArrayList<Teacher> arrayListTeacher = new ArrayList<Teacher>();
			ArrayList<Student> arrayListStudent = new ArrayList<Student>();

			boolean flag = true;
			while (flag) {

				System.out.println("===========MANAGE INFORMATION===========");
				System.out.println("Enter Name: ");
				String name = input.readLine();

				System.out.println("Enter Birthday: ");
				String birthday = input.readLine();

				System.out.println("Enter Address: ");
				String address = input.readLine();

				System.out.println("Enter Phone: ");
				String phone = input.readLine();
				System.out.println("Seclect Teacher or Student: \n1: Teacher \n2: Student");
				int number = Integer.parseInt(input.readLine());
				switch (number) {
				case 1:
					System.out.println("-------ADD infor of Teacher--------");
					System.out.println("Enter Class Leader: ");
					String classLeader = input.readLine();

					System.out.println("Enter Coefficients Salary: ");
					double coefficientsSalary = Double.parseDouble(input
							.readLine());

					System.out.println("Enter Allowance: ");
					double allowance = Integer.parseInt(input.readLine());

					teacher = new Teacher(name, birthday, address, phone,
							classLeader, coefficientsSalary, allowance);
					arrayListTeacher.add(teacher);

					for (int i = 0; i < arrayListTeacher.size(); i++) {
						System.out.println("Output: "
								+ arrayListTeacher.get(i).toString());
					}
					//managementTeacherStudent.setArrayListTes(arrayListTeacher);
					//System.out.println("Agv: " + student.avgMarkStudent());
					// add code
					break;
				case 2:
					System.out.println("-------ADD infor of Student--------");
					System.out.println("Enter Name Class: ");
					String nameClass = input.readLine();

					System.out.println("Entern MarkI: ");
					double markI = Integer.parseInt(input.readLine());

					System.out.println("Entern MarkII: ");
					double markII = Integer.parseInt(input.readLine());

					student = new Student(name, birthday, address, phone,
							nameClass, markI, markII);
					arrayListStudent.add(student);

					for (int i = 0; i < arrayListStudent.size(); i++) {
						System.out.println("Output: "
								+ arrayListStudent.get(i).toString());
					}

					managementTeacherStudent.setArrayListStu(arrayListStudent);
					System.out.println("Agv: " +managementTeacherStudent.avgMarkStudent());
					break;
				default:
					System.out.println("Wrong select!");

				}
				if (selectYN()) {
					continue;
				} else
					break;

			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("Error" + e.getMessage());
		} catch (NegativeArraySizeException e1) {
			System.out.println("Error: " + e1.getMessage());
		}

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
