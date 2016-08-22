package exercise18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * main class
 *
 */
public class MainClass18TheFight {

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

			Infantryman infantryman = new Infantryman();
			Trooper trooper = new Trooper();

			System.out.println("Enter name Infantryman: ");
			String name = input.readLine();
			infantryman.setName(name);

			System.out.println("Enter power of Infantryman: ");
			int power = Integer.parseInt(input.readLine());
			infantryman.setPower(power);
			if (power <= 0)
				throw new NegativeArraySizeException("Power not less than 0");

			System.out.println("Enter weapon of Infantryman: ");
			String weapon = input.readLine();
			infantryman.setWeapon(weapon);

			System.out.println("Enter name Trooper: ");
			String name1 = input.readLine();
			trooper.setName(name1);

			System.out.println("Enter power of Trooper: ");
			int power1 = Integer.parseInt(input.readLine());
			trooper.setPower(power1);
			if (power <= 0)
				throw new NegativeArraySizeException("Power not less than 0");

			System.out.println("Enter weapon of Trooper: ");
			String weapon1 = input.readLine();
			trooper.setWeapon(weapon1);
			while (checkAttack(infantryman, trooper) == 0) {
				System.out.println("Select 1: Infantryman attack \nSelect 2: Trooper attack");
				int choose = Integer.parseInt(input.readLine());
				selecAttack(infantryman, trooper, choose);
			}

			if (checkAttack(infantryman, trooper) == 1) {
				System.out.println("---------Trooper is win-------------");
			} else {
				System.out.println("----------Infantryman is win------------");
			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (NegativeArraySizeException e1) {
			System.out.println("Error: " + e1.getMessage());
		} finally {
			System.out.println("Done!");
		}

	}

	public static int checkAttack(Infantryman infantryman, Trooper trooper) {
		int k = 0;
		if (infantryman.power <= 0)
			k = 1;
		if (trooper.power <= 0)
			k = 2;

		return k;

	}

	public static void selecAttack(Infantryman infantryman, Trooper trooper, int choose)
			throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("choice: " + choose);
		switch (choose) {
		case 1:
			System.out.println("Infantryman attack ");
			System.out.println("Trooper power down 3");
			System.out.println(trooper.toString());
			break;
		case 2:
			System.out.println("Trooper attack ");
			System.out.println("Infantryman power down 2");
			System.out.println(infantryman.toString());
			break;
		default:
			System.out.println("Error input!");
			System.out.println("Select 1: Trooper attack \nSelect 2: Trooper attack");
			choose = Integer.parseInt(input.readLine());
		}

	}

}
