package exercise82Login;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class MainClass {
	private static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		UserController userController = new UserController();
		boolean flag=true;
		while(flag){
		System.out.println("=====Welcom to Login======");
		System.out.println("Select Menu: \n\t1) Login \n\t2) Register \n\t3) Exit");
		int number=Integer.parseInt(input.readLine());
		switch (number) {
		case 1:
			login(userController);
			break;
		case 2:
			addPerformed(userController);
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
	public static void login(UserController userController) throws IOException {
		
		System.out.println("Enter username: ");
		String username = input.readLine();

		System.out.println("Enter password: ");
		String password = input.readLine();

		User user=null;
		try {
			user = userController.loginUser(username, password);
			if (user == null) {
				System.out.println("Invalid UerName or Password");
			} else {
				System.out.println("Welcome to Our Store");
			}

		} catch (HeadlessException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public static void addPerformed(UserController userController) throws IOException {
		//get username, password, confirm user enter
		System.out.println("Enter username: ");
		String username = input.readLine();

		System.out.println("Enter password: ");
		String password = input.readLine();

		System.out.println("Enter comfirm: ");
		String comfirm=input.readLine();
		
		if(!password.equals(comfirm)){
			System.out.println("Password and Confirm Passord are not the same! ");
		}else
			try{
				//add to the database
				User user=new User(username, password);
				userController=new UserController();
				userController.addUser(user);
				System.out.println("New account is created. Now you can use it to login!");
			}catch (SQLException |ClassNotFoundException e) {
				System.out.println("Error: "+e.getMessage());
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
