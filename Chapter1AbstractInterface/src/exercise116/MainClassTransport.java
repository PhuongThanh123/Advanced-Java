package exercise116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClassTransport {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		Car car=new Car();
		Ship ship=new Ship();
		
		ArrayList<Car> arrayListCar=new ArrayList<Car>();
		ArrayList<Ship> arrayListShip=new ArrayList<Ship>();
		
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
		String owner=input.readLine();
		
		System.out.println("Select transport \n1: Car \n2: Ship ");
		int number=Integer.parseInt(input.readLine());
		
		switch (number) {
		case 1:
			System.out.println("--------------Car----------------");
			System.out.println("Enter gear");
			String gear=input.readLine();
			
			System.out.println("Enter model:");
			String model=input.readLine();
			car=new Car(color, manufactory, numberID, owner, gear, model);
			break;
		case 2:
			System.out.println("----------------Ship--------------");
			System.out.println("Enter capacity");//suc chua
			int capacity=Integer.parseInt(input.readLine());
			
			System.out.println("Enter weigth ");// trong luong
			double weigth=Double.parseDouble(input.readLine());
			
			System.out.println("Enter Fuel For Starup");
			int fuelForStarup=Integer.parseInt(input.readLine());
			
			System.out.println("Enter Speed Reverse");
			int speedReverse=Integer.parseInt(input.readLine());
			
			System.out.println("Enter Speed Straight");
			int speedStraight=Integer.parseInt(input.readLine());
			
			System.out.println("Enter Type Of Fuel");
			String typeOfFuel=input.readLine();
			
			ship=new Ship(color, manufactory, numberID, owner, capacity, fuelForStarup, speedReverse, speedStraight, typeOfFuel, weigth);
			
		default:
			break;
		}
		
	}

}
