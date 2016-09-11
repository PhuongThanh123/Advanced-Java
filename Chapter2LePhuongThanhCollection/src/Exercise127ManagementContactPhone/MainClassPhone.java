package Exercise127ManagementContactPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 11/09/2016 
 * @Version: 1.0 
 * @Create main class
 *
 */
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
				System.out.println(managementPhone.printAll());
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
				updateContact(input, managementPhone, phone);
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

		//System.out.println(managementPhone.toString());
		selectMenu(input, managementPhone, phone);
	}

	public static void searchContact(BufferedReader input,
			ManagementPhone managementPhone, Phone phone) throws IOException {
		System.out.println("=======Search Contact========");

		// System.out.println("List--------+"+managementPhone.toString());
		System.out.println("Enter name Contact: ");
		String name = input.readLine();

		if (managementPhone.searchContact(name) != null) {
			System.out.println("---------List-------\n");
			System.out.println(managementPhone.printSearch());
			System.out.println("--------------");
		} else {
			
			System.out.println("No result!");
			//System.out.println(managementPhone.searchContact(name));

		}
		selectMenu(input, managementPhone, phone);
	}

	public static void deleteContact(BufferedReader input,
			ManagementPhone managementPhone, Phone phone) throws IOException {
		System.out.println("==========Delec Contact=========");

		System.out.println("Enter name Contact to detele: ");
		String name = input.readLine();
		//phone = new Phone(name, "");
		
		managementPhone.deleteContact(name);
		System.out.println(managementPhone.printAll());
		selectMenu(input, managementPhone, phone);
	}
	
	public static void updateContact(BufferedReader input,
			ManagementPhone managementPhone, Phone phone) throws IOException{
		System.out.println("----------Update-----------");
		
		System.out.println("Enter name to update: ");
		String name=input.readLine();
		
		if(!managementPhone.isUpdateAll(name))
		{
			System.out.println("Search is not result!");
			System.out.println(managementPhone.printAll());
		}else
		{
			System.out.println(managementPhone.printSearch());
			if(managementPhone.lengthOfListSearch()==1){
				
				System.out.println("Enter new number: ");
				String newNumberPhone=input.readLine();
				
				managementPhone.updateNumberPhone(newNumberPhone);
			}else
			{
				System.out.println(managementPhone.printSearch());
				
				System.out.println("Enter old number: ");
				String oldNumberPhone=input.readLine();
				
				if(managementPhone.searchOldNumber(oldNumberPhone)!=null){

					//System.out.println(managementPhone.printNumberPhone(oldNumberPhone));
					managementPhone.printNumberPhone(oldNumberPhone);
					System.out.println("Enter new number: ");
					String newNumberPhone=input.readLine();
					
					managementPhone.updateNumberPhone(newNumberPhone);
					
				
				}else
				{
				
					System.out.println(oldNumberPhone+ " is not found!");
					//nhap lai
				}
				
			}
		}
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
