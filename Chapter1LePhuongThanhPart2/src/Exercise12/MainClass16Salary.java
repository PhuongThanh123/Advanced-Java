package Exercise12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MainClass16Salary {

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			Exercise16Person eperson = new Exercise16Person();
			Exercise16Salary esalary = new Exercise16Salary();

			System.out.println("Enter your name: ");
			String name = input.readLine();
			eperson.setName(name);

			System.out.println("Enter your coefficients: ");
			double coefficients = Double.parseDouble(input.readLine());
			esalary.setCoefficients(coefficients);;

			System.out.println("Enter your number person: ");
			int numberPerson = Integer.parseInt(input.readLine());
			esalary.setNumberPerson(numberPerson);

			System.out.println("Enter your allowance: ");
			double allowance = Double.parseDouble(input.readLine());
			esalary.setAllowance(allowance); 
			
			double incom = esalary.calSalary();
			System.out.println("Incom: " + String.format("%.0f", incom));
			
			double incomeTaxes=esalary.calcIncomeTaxes();
			System.out.println("Incone Taxes: "+String.format("%.0f", incomeTaxes));
			double resultrsonalncomeTax=esalary.calcPersonalIncomeTax();
					DecimalFormat decimal=new DecimalFormat("#,###");
			System.out.println("Personal Income Tax: "+decimal.format(resultrsonalncomeTax));
			
			
		} catch (NumberFormatException | IOException e) {
			System.out.println("Infor: " + e.getMessage());
		}
	}

}
