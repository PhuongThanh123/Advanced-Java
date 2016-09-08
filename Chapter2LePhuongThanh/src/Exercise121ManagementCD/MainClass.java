package Exercise121ManagementCD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 07/09/2016 
 * @Version: 1.0 
 * @Create Class main handling
 *
 */
public class MainClass {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		ArrayCD arrayCD = new ArrayCD();
		CD exercise17cd = new CD();
		ArrayList<CD> arrayCDs = new ArrayList<CD>();

		System.out.println("=========MANAGE CD==========");
		boolean flag = true;
		while (flag) {

			System.out.println("Enter ID CD: ");
			String idCD = input.readLine();

			System.out.println("Enter Name CD: ");
			String nameCD = input.readLine();

			System.out.println("Enter Singer: ");
			String singer = input.readLine();

			System.out.println("Enter Number Song: ");
			Integer numberSong = Integer.parseInt(input.readLine());

			System.out.println("Enter Price: ");
			Double price = Double.parseDouble(input.readLine());

			exercise17cd = new CD(idCD, nameCD, singer, numberSong, price);
			arrayCDs.add(exercise17cd);
			arrayCD.setArrayCD(arrayCDs);
			System.out.println(arrayCD.toString());

			// System.out.println("Do you want add CD new");
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
