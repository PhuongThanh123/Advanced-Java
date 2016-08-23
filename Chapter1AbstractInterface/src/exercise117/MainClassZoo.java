package exercise117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassZoo {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		Brid brid = new Brid();
		Tiger tiger = new Tiger();
		Fish fish = new Fish();
		Boa boa = new Boa();

		System.out.println("======WELCOM TO ZOO======");

		boolean flag = true;
		while (flag) {
			System.out.println("Enter name: ");
			String name = input.readLine();

			System.out.println("Enter food: ");
			String food = input.readLine();

			System.out.println("Select Animal: \n1: Bird \n2: Tiger \n3: Fish \n4: Boa ");
			int number = Integer.parseInt(input.readLine());

			switch (number) {
			case 1:
				System.out.println("Information of Bird");
				brid.setName(name);
				brid.setFood(food);
				System.out.println("Infor: \n" + brid.toString());
				brid.fly();
				brid.nest();
				System.out.println("-----------------------------");
				break;
			case 2:
				System.out.println("Information of Tiger");
				tiger.setName(name);
				tiger.setFood(food);
				System.out.println("Infor: \n" + tiger.toString());
				tiger.burrow();
				tiger.run();
				tiger.swim();
				System.out.println("-----------------------------");
				break;
			case 3:
				System.out.println("Information of Fish");
				fish.setName(name);
				fish.setFood(food);
				System.out.println("Infor: \n" + fish.toString());
				fish.swim();
				fish.water();
				System.out.println("-----------------------------");
				break;
			case 4:
				System.out.println("Information of Boa");
				boa.setName(name);
				boa.setFood(food);
				System.out.println("Infor: \n" + boa.toString());
				boa.burrow();
				boa.moult();
				boa.swim();
				System.out.println("-----------------------------");
			default:
				System.out.println("Wrong select!");
				break;
			}
			if (selectYN()) {
				continue;
			} else
				break;
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
