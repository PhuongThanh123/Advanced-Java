package exercise71ManagmentPhone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class MainClass {

	public static void main(String[] args) throws NumberFormatException,
			IOException, SAXException, NullPointerException, ParserConfigurationException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		String filePath="src/exercise71ManagmentPhone/abc.xml";
		Contact contact = new Contact();
		//ManagementContact managementContact = new ManagementContact();
		ManagementContact managementContact=new ManagementContact(filePath);
	
		try {
			selectMenu(input, contact, managementContact, filePath);
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void selectMenu(BufferedReader input, Contact contact,
			ManagementContact managementContact,String filePath) throws NumberFormatException,
			IOException, SAXException, ParserConfigurationException {
		boolean flag = true;
		while (flag) {
			System.out
					.println("Select Menu: \n1) Add new \n2) Search \n3)Update \n4)Delete 5) View File \n6)Exit");
			int number = Integer.parseInt(input.readLine());

			switch (number) {
			case 1:
				addNew(input, contact, managementContact, filePath);
				break;
			case 4:
				delete(input, contact, managementContact, filePath);
				break;
			case 5:
				System.out.println(managementContact.toString());
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
	public static void delete(BufferedReader input, Contact contact,
			ManagementContact managementContact,String filePath) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
		
		System.out.println("Enter name delete: ");
		String name=input.readLine();
		System.out.println(managementContact.deleteContact(name, filePath));
		
	}

	public static void addNew(BufferedReader input, Contact contact,
			ManagementContact managementContact,String filePath) throws IOException,
			SAXException {
		
		System.out.println("=======Add new COntact=========");

		System.out.println("Enter name: ");
		String name = input.readLine();

		System.out.println("Enter number phone: ");
		String numberPhone = input.readLine();

		contact = new Contact(name, numberPhone);
		managementContact.textTransfomer(contact, filePath);
		
		managementContact.addNew(contact);

		System.out.println(managementContact.toString());

	}
	public static void viewFile(BufferedReader input, Contact contact,
			ManagementContact managementContact,String filePath) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
		System.out.println("====View File====");
		
		//managementContact.viewFile(filePath);
		//System.out.println();
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
