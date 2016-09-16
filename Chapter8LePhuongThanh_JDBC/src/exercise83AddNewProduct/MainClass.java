package exercise83AddNewProduct;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClass {
	private static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		CategoryConroller categoryConroller=new CategoryConroller();
		boolean flag=true;
		while(flag){
		System.out.println("=====Welcom to Store======");
		System.out.println("Select Menu: \n\t1) View Category \n\t2) Register \n\t3) Exit");
		int number=Integer.parseInt(input.readLine());
		switch (number) {
		case 1:
			categoryConroller.getAllCategory();
			System.out.println(categoryConroller.toString());
			break;
		case 2:
			
			break;
		case 3:
			System.out.println("Done!");
			flag=false;
			break;
		default:
			System.out.println("Select wrong !");
			if (selectYN())
				continue;
			else
				flag = false;
			break;
		}
		}
		
	}
	
	
	public static boolean selectYN() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Do you want to continue");
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
