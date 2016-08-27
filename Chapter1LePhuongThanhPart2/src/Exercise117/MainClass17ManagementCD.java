package Exercise117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClass17ManagementCD {

	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		Exercise17ArrayCD arrayCD=new Exercise17ArrayCD();
		Exercise17CD exercise17cd=new Exercise17CD();
		ArrayList<Exercise17CD> arrayCDs=new ArrayList<Exercise17CD>();
		System.out.println("=========MANAGE CD==========");
		boolean flag = true;
		while (flag) {
		
		System.out.println("Enter ID CD: ");
		String idCD=input.readLine();
		
		
		System.out.println("Enter Name CD: ");
		String nameCD=input.readLine();
		
		
		System.out.println("Enter Singer: ");
		String singer=input.readLine();
		
		
		System.out.println("Enter Number Song: ");
		Integer numberSong=Integer.parseInt(input.readLine());
		
		
		System.out.println("Enter Price: ");
		Double price =Double.parseDouble(input.readLine());
		
		exercise17cd =new Exercise17CD(idCD, nameCD, singer, numberSong, price);
		arrayCDs.add(exercise17cd);
		arrayCD.setArrayCD(arrayCDs);
		System.out.println(arrayCD.toString());
		
		//System.out.println("Do you want add CD new");
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
