package exercise116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassTransport {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		Car car=new Car();
		Ship ship=new Ship();
		
		System.out.println("======TRANSPORT=======");
		System.out.println("Enter distance: ");
		double distance =Double.parseDouble(input.readLine());
		
		System.out.println("Enter time: ");
		double time=Double.parseDouble(input.readLine());
		
		System.out.println("Enter Used Fuel: ");
		double usedFuel=Double.parseDouble(input.readLine());
		
		System.out.println("Enter color: ");
		String color=input.readLine();
		
		System.out.println("Enter Manufactory: ");
		String manufactory=input.readLine();
		
		System.out.println("Enter Number ID: ");
		String numberID=input.readLine();
		
		System.out.println("Enter Ower: ");
		String ower=input.readLine();
		
		System.out.println("Select transport \n1: Car \n2: Ship ");
		int number=Integer.parseInt(input.readLine());
		
	}

}
