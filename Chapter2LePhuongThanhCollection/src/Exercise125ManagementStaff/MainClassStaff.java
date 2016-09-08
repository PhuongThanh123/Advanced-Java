package Exercise125ManagementStaff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 08/09/2016 
 * @Version: 1.0 
 * @Create Class main class staff
 *
 */
public class MainClassStaff {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		ManagementStaff managementStaff = new ManagementStaff();
		Staff staff = new Staff();
		addStaff(managementStaff, staff, input);
		selectMenu(managementStaff, staff, input);

	}
	public static void selectMenu(ManagementStaff managementStaff, Staff staff,
			BufferedReader input) throws NumberFormatException, IOException{
		boolean flag=true;
		while(flag){
		System.out.println("Select Menu: \n\t1) Add new Staff \n\t2) Search Staff \n\t3) Delete Staff");
		int number=Integer.parseInt(input.readLine());
		
		switch (number) {
		case 1:
			addStaff(managementStaff, staff, input);
			
			break;
		case 2:
			searchStaff(managementStaff, staff, input);
			break;
		case 3:
			 deleteStaff(managementStaff, staff, input);
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

	public static void addStaff(ManagementStaff managementStaff, Staff staff,
			BufferedReader input) throws IOException {
		System.out.println("Add new Staff");

		System.out.println("Enter ID: ");
		String id = input.readLine();
		while(managementStaff.checkId(id)==false){
			System.out.println("Duplicate ID: choose");
			id = input.readLine();
		}

		System.out.println("Enter name: ");
		String name = input.readLine();

		System.out.println("Enter age: ");
		int age = Integer.parseInt(input.readLine());

		System.out.println("Enter salary: ");
		double salary = Double.parseDouble(input.readLine());

		staff = new Staff(id, name, age, salary);
		managementStaff.addStaff(id, staff);
		System.out.println(managementStaff.toString());
	}

	public static void searchStaff(ManagementStaff managementStaff,
			Staff staff, BufferedReader input) throws IOException {
		System.out.println("Search studen");

		System.out.println("Enter id to search: ");
		String id = input.readLine();
		System.out.println("Result after search: ");
		System.out.println(managementStaff.searchStaff(id));
		
	}

	public static void deleteStaff(ManagementStaff managementStaff,
			Staff staff, BufferedReader input) throws IOException {
		System.out.println("Delete Student");

		System.out.println("Enter id to delete: ");
		String id = input.readLine();
		if (managementStaff.lengthOfListStaff() != 0) {
			
			managementStaff.deleteStaff(id);
			
			System.out.println("Delete is successfully!");
			System.out.println(managementStaff.toString());
		} else
			System.out.println("List is Emtry");

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
