package exercise64Staff;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;

/**
 * Author: Le Phuong Thanh Date: 27/08/2016 Version: 1.0 Create MainClass of
 * salary
 *
 */
public class MainClass {

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			Employee employee = new Employee();
			ManagementSatff managementSatff = new ManagementSatff();

			DecimalFormat decimal = new DecimalFormat("#,###");
			double incom = employee.calSalary();
			System.out.println("Incom: " + decimal.format(incom));

			double incomeTaxes = employee.calcIncomeTaxes();
			System.out.println("Incone Taxes: " + decimal.format(incomeTaxes));

			double resultrsonalncomeTax = employee.calcPersonalIncomeTax();
			System.out.println("Personal Income Tax: "
					+ decimal.format(resultrsonalncomeTax));

			double resultRF = employee.calcRealField();
			System.out.println("Real Field: " + decimal.format(resultRF));
		} catch (NumberFormatException e) {
			System.out.println("Infor: " + e.getMessage());
		}
	}

	public void selectMenu(BufferedReader input, Employee employee,
			ManagementSatff managementSatff) throws NumberFormatException,
			IOException {
		boolean flag = true;
		while (flag) {
			System.out
					.println("Select menu: 1) View list - ReadFile 2) Add new- Write File 3) Exit");
			int number = Integer.parseInt(input.readLine());

			switch (number) {
			case 1:

				break;
			case 2:
				addNewEmployee(input, employee, managementSatff);
				break;
			case 3:
				System.out.println("Done!");
			default:

				if (selectYN())
					continue;
				else
					flag = false;
				break;
			}
		}

	}

	public static void addNewEmployee(BufferedReader input, Employee employee,
			ManagementSatff managementSatff) throws IOException {

		System.out.println("Enter your name: ");
		String name = input.readLine();

		System.out.println("Enter your coefficients: ");
		double coefficients = Double.parseDouble(input.readLine());

		System.out.println("Enter your number person: ");
		int numberPerson = Integer.parseInt(input.readLine());

		System.out.println("Enter your allowance: ");
		double allowance = Double.parseDouble(input.readLine());

		employee = new Employee(name, coefficients, allowance, numberPerson);
		managementSatff.addEmployee();
		System.out.println(managementSatff.toString());

	}

	public static void openWriteStaffFile() {
		// Staff staff1=new Staff();
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream(
					"src/exercise64Staff/employee.txt")) {
				@Override
				protected void writeStreamHeader() throws IOException {
					reset();
				}
			};
			// out.writeObject();
			out.close();
			// info print is success
			System.out.println("Add is success");
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	public void readFile() throws FileNotFoundException, IOException,
			ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(
						"src/exercise64Staff/employee.txt")))) {
			while (true) {
				// Staff staff=(Staff) in.readObject();
				System.out.println(toString());
			}
		}

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
