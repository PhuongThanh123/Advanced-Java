package exercise19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Author: Le Phuong Thanh 
 * Date: 19/08/2016 
 * Version: 1.0 
 *Descriptione: create  class
 */
public class MainClass19ManagementListComputer {

	public static void main(String[] args) {
		try {

			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));

			Destop destop = new Destop();
			Laptop laptop = new Laptop();
			ManagementDestopLatop destopLatop = new ManagementDestopLatop();

			ArrayList<Destop> arrayListDes = new ArrayList<Destop>();
			ArrayList<Laptop> arrayListLa = new ArrayList<Laptop>();

			boolean flag = true;
			while (flag) {
				System.out
						.println("----------Entere Information Computer-----------");

				System.out.println("Enter Id: ");
				String id = input.readLine();

				System.out.println("Enter price: ");
				double price = Double.parseDouble(input.readLine());

				System.out.println("Enter manufacturer: ");
				String manufacturer = input.readLine();

				System.out.println("Enter quantity: ");
				int quantity = Integer.parseInt(input.readLine());

				if (price < 0 | quantity < 0)
					throw new NegativeArraySizeException("Not is less than 0");
				System.out.println("Choose type: \n 1: Destop \n 2: Laptop");
				int choose = Integer.parseInt(input.readLine());
				switch (choose) {
				case 1:
					System.out.println("----ADD infor Destop");
					System.out.println("Enter CPU");
					String cpu = input.readLine();

					System.out.println("Enter RAM");
					String ram = input.readLine();

					destop = new Destop(id, price, manufacturer, quantity, cpu,
							ram);

					arrayListDes.add(destop);
					for (int i = 0; i < arrayListDes.size(); i++) {
						System.out.println("\nOutput: "
								+ arrayListDes.get(i).toString());
					}
					
										printfArrayDestop(destopLatop, arrayListDes,arrayListLa);
					break;
				case 2:
					System.out.println("----ADD infor Laptop");
					System.out.println("Enter weight: ");
					double weight = Double.parseDouble(input.readLine());

					System.out.println("Enter timePin: ");
					double timePin = Double.parseDouble(input.readLine());
					if (weight < 0 | timePin < 0)
						throw new NegativeArraySizeException(
								"Not is less than 0");

					System.out.println("Enter Size Screen: ");
					String sizescreen = input.readLine();

					laptop = new Laptop(id, price, manufacturer, quantity,
							weight, timePin, sizescreen);
					arrayListLa.add(laptop);
					for (int i = 0; i < arrayListLa.size(); i++) {
						System.out.println("Output: "
								+ arrayListLa.get(i).toString());
					}

					destopLatop.setLaptops(arrayListLa);
					

					break;
				default:
					break;
				}

				if (selectYN()) {
					continue;
				} else
					break;

			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("Error" + e.getMessage());
		} catch (NegativeArraySizeException e1) {
			System.out.println("Error: " + e1.getMessage());
		}

	}
	public static void printfArrayDestop(ManagementDestopLatop destopLatop,ArrayList<Destop> arrayListDes,ArrayList<Laptop> arrayListLa ){
		destopLatop.setDestop(arrayListDes);
		destopLatop.setLaptops(arrayListLa);
		System.out.println(destopLatop.toString());
		System.out.println("All price of Destop: "
				+ destopLatop.sumPriceDestop());
		System.out.println("All price of Laptop: "
				+ destopLatop.sumPriceLaptop());
		System.out.println();
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
