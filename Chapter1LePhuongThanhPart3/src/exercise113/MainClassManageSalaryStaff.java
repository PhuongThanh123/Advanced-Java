package exercise113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClassManageSalaryStaff {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		BusinessStaff businessStaff = new BusinessStaff();
		ProductionStaff productionStaff = new ProductionStaff();
		MangeStaff mangeStaff=new MangeStaff();

		ArrayList<BusinessStaff> arrayListBusinessStaff = new ArrayList<BusinessStaff>();
		ArrayList<ProductionStaff> arrayListProductionStaff = new ArrayList<ProductionStaff>();

		System.out.println("=======MANAGE SALARY OF STAFF");
		System.out.println("Enter name: ");
		String name = input.readLine();

		System.out.println("Enter Coefficients Salary");
		double coefficientsSalary = Double.parseDouble(input.readLine());

		System.out.println("Enter Number Person: ");
		int numberPerson = Integer.parseInt(input.readLine());

		System.out.println("Enter Allowance: ");
		double allowance = Double.parseDouble(input.readLine());

		System.out.println("------Select Type Staff-------");

		boolean flag = true;
		while (flag) {

			System.out
					.println("Choose: \n1: Businuess Staff \n2: Production Staff");
			int number = Integer.parseInt(input.readLine());

			switch (number) {
			case 1:
				System.out.println("-----------Businuess Staff------------");
				System.out.println("Enter Business Wages: ");
				double businessWages = Double.parseDouble(input.readLine());

				System.out.println("Enter Rate Of BusinessWages: ");
				double rateOfBusinessWages = Double.parseDouble(input
						.readLine());
				businessStaff = new BusinessStaff(name, coefficientsSalary,
						numberPerson, allowance, businessWages,
						rateOfBusinessWages);
				arrayListBusinessStaff.add(businessStaff);
				for (int i = 0; i < arrayListBusinessStaff.size(); i++) {
					System.out.println("Output: \n"
							+ arrayListBusinessStaff.get(i).toString());
				}
				
				mangeStaff.setArrayListBusinessStaff(arrayListBusinessStaff);
				System.out.println("Salary avg of Businuess Staff: "+mangeStaff.avgBusiness());
				
				break;
			case 2:
				System.out.println("-----------Production Staff------------");
				System.out.println("Enter Number Product: ");
				int numberProduct = Integer.parseInt(input.readLine());

				productionStaff = new ProductionStaff(name, coefficientsSalary,
						numberPerson, allowance, numberProduct);
				arrayListProductionStaff.add(productionStaff);
				for (int i = 0; i < arrayListProductionStaff.size(); i++) {
					System.out.println("Output: \n"
							+ arrayListProductionStaff.get(i).toString());
				}
				
				mangeStaff.setArrayListProductionStaff(arrayListProductionStaff);
				System.out.println("Salary avg of Production Staff: "+mangeStaff.avgPro());
				
				break;
			default:
				System.out.println("Wrong Seclect");
				break;
			}
			if (selectYN()) {
				continue;
			} else
				break;
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
