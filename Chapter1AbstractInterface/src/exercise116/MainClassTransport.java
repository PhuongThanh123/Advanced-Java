package exercise116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * Author: Le Phuong Thanh
 * Date: 23/08/2016
 * Version: 1.0
 * Create class Mainclass
 *
 */
public class MainClassTransport {

	public static void main(String[] args)  {
		try{
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		Car car = new Car();
		Ship ship = new Ship();
		MangeShipCar mangeShipCar = new MangeShipCar();

		ArrayList<Car> arrayListCar = new ArrayList<Car>();
		ArrayList<Ship> arrayListShip = new ArrayList<Ship>();
		System.out.println("======TRANSPORT=======");
		boolean flag = true;
		while (flag) {
			
			System.out.println("Enter distance: ");
			double distance = Double.parseDouble(input.readLine());

			System.out.println("Enter time: ");
			double time = Double.parseDouble(input.readLine());

			System.out.println("Enter Used Fuel: ");
			double usedFuel = Double.parseDouble(input.readLine());

			System.out.println("Enter color: ");
			String color = input.readLine();

			System.out.println("Enter Manufactory: ");
			String manufactory = input.readLine();

			System.out.println("Enter Number ID: ");
			String numberID = input.readLine();

			System.out.println("Enter Ower: ");
			String owner = input.readLine();

			System.out.println("Select transport \n1: Car \n2: Ship ");
			int number = Integer.parseInt(input.readLine());

			switch (number) {
			case 1:
				System.out.println("--------------Car----------------");
				System.out.println("Enter gear");
				String gear = input.readLine();

				System.out.println("Enter model:");
				String model = input.readLine();
				car = new Car(color, manufactory, numberID, owner, distance,
						time, usedFuel, gear, model);
				arrayListCar.add(car);
				for (int i = 0; i < arrayListCar.size(); i++) {
					System.out.println("\nOutput: "
							+ arrayListCar.get(i).toString());
				}
				
				mangeShipCar.setArrayListCa(arrayListCar);
				System.out.println("Speed of Car: " + String.format("%f",car.calSpeed()));
				System.out.println("Used of fuel: " + String.format("%f",car.calUsingFuel()));
				break;
			case 2:
				System.out.println("----------------Ship--------------");
				System.out.println("Enter capacity");
				int capacity = Integer.parseInt(input.readLine());

				System.out.println("Enter weigth ");
				double weigth = Double.parseDouble(input.readLine());

				System.out.println("Enter Fuel For Starup");
				int fuelForStarup = Integer.parseInt(input.readLine());

				System.out.println("Enter Speed Reverse");
				int speedReverse = Integer.parseInt(input.readLine());

				System.out.println("Enter Speed Straight");
				int speedStraight = Integer.parseInt(input.readLine());

				System.out.println("Enter Type Of Fuel");
				String typeOfFuel = input.readLine();

				ship=new Ship(color, manufactory, numberID, owner, distance, time, usedFuel, capacity, fuelForStarup, speedReverse, speedStraight, typeOfFuel, weigth);
				arrayListShip.add(ship);

				for (int i = 0; i < arrayListShip.size(); i++) {
					System.out.println("\nOutput: "
							+ arrayListShip.get(i).toString());
				}
				mangeShipCar.setArrayListShi(arrayListShip);
				System.out.println("Speed of Ship: " + String.format("f%",ship.calSpeed()));
				System.out.println("Used fuel of Ship: " + String.format("f%",ship.calUsingFuel()));
			default:
				System.out.println("Wrong select!");
				break;
			}
			if (selectYN()) {
				continue;
			} else
				break;
		}
		}catch(NullPointerException|IOException e){
			System.out.println("Error: "+e.getMessage());
			
		}

	}
	public static boolean selectYN() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
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
