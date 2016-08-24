package exercise110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * Author: Le Phuong Thanh 
 * Date: 19/08/2016 
 * Version: 1.0 
 * Description: main class
 *
 */
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
				System.out
						.println("Seclect Teacher or Student: \n1: Teacher \n2: Student");
				int number = Integer.parseInt(input.readLine());
				switch (number) {
				case 1:
					//Add information of Teacher
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
					printfArrayList(managementTeacherStudent, arrayListTeacher, arrayListStudent);
					
					break;
				case 2:
					//Add information of student
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
					printfArrayList(managementTeacherStudent, arrayListTeacher, arrayListStudent);

										
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
	/**
	 * Method print list Teacher and student
	 * Output: return list teacher and student
	 * @param managementTeacherStudent
	 * @param arrayListTeacher
	 * @param arrayListStudent
	 */
	public static void printfArrayList(ManagementTeacherStudent managementTeacherStudent,ArrayList<Teacher> arrayListTeacher,ArrayList<Student> arrayListStudent){
		
		managementTeacherStudent.setArrayListStu(arrayListStudent);
		managementTeacherStudent.setArrayListTes(arrayListTeacher);
		System.out.println(managementTeacherStudent.toString());
	}
	/**
	 * Method check input Yes or No, if true is return true else return false
	 * output return value is true or false
	 * @return
	 * @throws IOException
	 */

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
