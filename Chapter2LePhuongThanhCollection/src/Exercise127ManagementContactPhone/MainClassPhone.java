package Exercise127ManagementContactPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassPhone {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		ManagementPhone managementPhone = new ManagementPhone();
		Phone phone = new Phone();
		addNewContact(input, managementPhone, phone);

	}

	public static void selectMenu(BufferedReader input,
			ManagementPhone managementPhone, Phone phone)
			throws NumberFormatException, IOException {
		boolean flag = true;
		while (flag) {
			System.out
					.println("Select menu: \n1) View List Contact \n2) Add new contact \n3) Search Name Contact \n4) Delete Contact \n5) Update Contact \n6) Exit");

			int number = Integer.parseInt(input.readLine());
			switch (number) {
			case 1:
				System.out.println(managementPhone.toString());
				break;
			case 2:
				addNewContact(input, managementPhone, phone);
				break;
			case 3:
				searchContact(input, managementPhone, phone);
				break;
			case 4:
				deleteContact(input, managementPhone, phone);
				break;
			case 5:
				break;
			case 6:
				System.out.println("Done!");
			default:
				System.out.println("Wrong select!");
				
				break;
				
			}
			if (selectYN()) {
				continue;
			} else {
				flag = false;
			}
		}

	}

	public static void addNewContact(BufferedReader input,
			ManagementPhone managementPhone, Phone phone) throws IOException {
		System.out.println("=======ADD new contact======");

		System.out.println("Enter name: ");
		String name = input.readLine();

		System.out.println("Enter Number Phone: ");
		String numberPhone = input.readLine();

		phone = new Phone(name, numberPhone);
		managementPhone.addContac(phone);

		System.out.println(managementPhone.toString());
		selectMenu(input, managementPhone, phone);
	}

	public static void searchContact(BufferedReader input,
			ManagementPhone managementPhone, Phone phone) throws IOException {
		System.out.println("=======Search Contact========");

		System.out.println("Enter name Contact: ");
		String name = input.readLine();
		
		phone=new Phone(name, "");
		if(managementPhone.searchContact(name) == null){
			System.out.println("No result!");
		}else{
			System.out.println(managementPhone.searchContact(name));
		}
		selectMenu(input, managementPhone, phone);
	}
	public static void deleteContact(BufferedReader input,
			ManagementPhone managementPhone, Phone phone) throws IOException{
		System.out.println("==========Delec Contact=========");
		
		System.out.println("Enter name Contact to detele: ");
		String name = input.readLine();
		System.out.println(managementPhone.deleteContact(name));
		phone=new Phone(name, "");
		selectMenu(input, managementPhone, phone);
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
