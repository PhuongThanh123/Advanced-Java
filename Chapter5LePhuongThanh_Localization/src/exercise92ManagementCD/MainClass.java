package exercise92ManagementCD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

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
		String language = "en";
		String country = "US";
		Locale currentLocal = new Locale(language);

		System.out.println("Select Menu: 1) VietNamese 2) USA ");
		//int number = Integer.parseInt(input.readLine());
		
		
		ResourceBundle message=ResourceBundle.getBundle("exercise92ManagementCD/resource_vi_VN");
		
		ArrayCD arrayCD = new ArrayCD();
		CD cd = new CD();
		addNewCD(input, arrayCD, cd, message);

		

	}
	public  static void addNewCD(BufferedReader input,ArrayCD arrayCD,CD cd,ResourceBundle message) throws IOException{
		System.out.println("=========MANAGE CD==========");
		boolean flag = true;
		while (flag) {

			System.out.println(message.getString("idCD"));
			String idCD = input.readLine();

			System.out.println(message.getString("nameCD"));
			String nameCD = input.readLine();

			System.out.println(message.getString("singer"));
			String singer = input.readLine();

			System.out.println(message.getString("numberSong"));
			Integer numberSong = Integer.parseInt(input.readLine());

			System.out.println(message.getString("price"));
			Double price = Double.parseDouble(input.readLine());

			cd = new CD(idCD, nameCD, singer, numberSong, price);
			arrayCD.addCD(cd);
			System.out.println(arrayCD.toString());

			// System.out.println("Do you want add CD new");
			if (selectYN(message)) {
				continue;
			} else
				break;
		}
	}

	public static boolean selectYN(ResourceBundle message) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println(message.getString("continue"));
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
