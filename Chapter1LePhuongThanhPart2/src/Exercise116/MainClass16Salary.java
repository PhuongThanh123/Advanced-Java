package Exercise116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
/**
 * Author: Le Phuong Thanh 
 * Date: 27/08/2016 
 * Version: 1.0 
 * Create MainClass of salary
 *
 */
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
			
			DecimalFormat decimal=new DecimalFormat("#,###");
			double incom = esalary.calSalary();
			System.out.println("Incom: " + decimal.format(incom));
			
			double incomeTaxes=esalary.calcIncomeTaxes();
			System.out.println("Incone Taxes: "+decimal.format(incomeTaxes));
			
			double resultrsonalncomeTax=esalary.calcPersonalIncomeTax();
			System.out.println("Personal Income Tax: "+decimal.format(resultrsonalncomeTax));
			
			double resultRF=esalary.calcRealField();
			System.out.println("Real Field: "+decimal.format(resultRF));
		} catch (NumberFormatException | IOException e) {
			System.out.println("Infor: " + e.getMessage());
		}
	}

}
