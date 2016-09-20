package JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * @author: Le Phuong Thanh
 * @version: 1.0
 * @Date: 19/09/2016
 * @Desciption: Class main handling CD
 */
public class MainClass {

	private static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
	private static CDController cdController = new CDController();
	private static CD cd = new CD();

	public static void main(String[] args) {
		try{
		selectMenu();
		}catch(IOException|ClassNotFoundException|SQLException e){
			System.out.println("Error: "+e.getMessage());
		}

	}

	/**
	 * this is method allow user enter select menu
	 * 
	 * @throws NumberFormatException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void selectMenu() throws NumberFormatException, IOException,
			ClassNotFoundException, SQLException {
		boolean flag = true;
		while (flag) {
			System.out.println("=====Welcom to Store======");
			System.out.println("Select Menu: \n\t1) View CD \n\t2) Add New CD "
					+ "\n\t3) Search Product \n\t4) Update CD "
					+ "\n\t5) Delete CD \n\t6) Exit ");
			int number = Integer.parseInt(input.readLine());
			switch (number) {
			case 1:
				System.out.println(cdController.toString());
				break;
			case 2:
				addNewCD();
				break;
			case 3:
				searchCD();
				break;
			case 4:
				updateCD();
				break;
			case 5:
				deleteCD();
				break;
			case 6:
				System.out.println("Done!");
				flag = false;
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

	/**
	 * this is method allow user enter name, singer price and numbersongs and
	 * add new CD
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void addNewCD() throws IOException, ClassNotFoundException,
			SQLException {
		boolean add=true;
		while(add){
		System.out.println("=====Add new CD=====");
		System.out.println("Enter name: ");
		String name = input.readLine();

		System.out.println("Enter singer: ");
		String singer = input.readLine();
		
		System.out.println("Enter numbersongs: ");
		int numbersongs = Integer.parseInt(input.readLine());

		System.out.println("Enter price: ");
		double price = Double.parseDouble(input.readLine());

		cd = new CD(name, singer, numbersongs, price);

		cdController.addNewCD(cd);

		cdController.getAllCD();
		System.out.println(cdController.toString());
		System.out.println("Do you want to continue add new? [Y/N]");
		if (selectYNContinue()) {
			continue;
		} else

			add = false;
	}
		

	}

	/**
	 * this is method allow user enter name CD to search
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void searchCD() throws IOException, ClassNotFoundException,
			SQLException {

		System.out.println("===========Serach CD=============");
		System.out.println("Enter name CD to search: ");
		String name = input.readLine();
		boolean flag = true;
		// check name duly
		if (cdController.toStringSearch(name) == null) {
			System.out.println(name + " is not find");

			while (flag) {
				if (selectYNSearch()) {
					System.out.println("Enter name CD to search: ");
					name = input.readLine();
					System.out.println(cdController.toStringSearch(name));
				} else
					flag = false;
			}

		} else {
			while (flag) {
				System.out.println(cdController.toStringSearch(name));
				if (selectYNSearch()) {
					System.out.println("Enter name CD to search: ");
					name = input.readLine();

				} else
					flag = false;
			}
		}
	}

	/**
	 * this is method allow user enter id, numbersongs and price to update
	 * 
	 * @throws NumberFormatException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void updateCD() throws NumberFormatException, IOException,
			ClassNotFoundException, SQLException {
		boolean update = true;
		while (update) {

			System.out.println("=====Update Product============");

			System.out.println("Enter No.: ");
			int id = Integer.parseInt(input.readLine());

			while (!cdController.isId(id)) {
				System.out.println("Enter No.: ");
				id = Integer.parseInt(input.readLine());
			}
			System.out.println("Enter numbersongs: ");
			int numbersongs = Integer.parseInt(input.readLine());

			System.out.println("Enter price: ");
			double price = Double.parseDouble(input.readLine());

			cd = new CD(id, numbersongs, price);

			cdController.getListUpdate(cd);
			System.out.println(cdController.toStringUpdate(cd));
			System.out.println("Do you want to continue Update? [Y/N]");
			if (selectYNContinue()) {
				continue;
			} else

				update = false;
		}
	}

	/**
	 * this is method allow user enter ID to delete.
	 * 
	 * @throws NumberFormatException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void deleteCD() throws NumberFormatException, IOException,
			ClassNotFoundException, SQLException {
		System.out.println("========= Delete CD=============");
		boolean flag = true;
		System.out.println("Enter id: ");
		int id = Integer.parseInt(input.readLine());

		while (!cdController.isId(id)) {
			System.out.println("Enter No.: ");
			id = Integer.parseInt(input.readLine());
		}

		while (flag) {
			if (selectYNDelete(id)) {

				cdController.deleteOneCD(id);
				flag = false;
				break;
			} else {
				selectMenu();
			}
		}

	}

	/**
	 * this is method check user want to continue
	 * 
	 * @return true of false
	 * @throws IOException
	 */
	public static boolean selectYN() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Do you want to continue? [Y/N]");
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

	/**
	 * this is method select delete
	 * 
	 * @param id
	 * @return true or false
	 * @throws IOException
	 */
	public static boolean selectYNDelete(int id) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Do you sure want to delete: " + id + "? [Y/N]");
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

	public static boolean selectYNSearch() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Do you want to continue search? [Y/N]");
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

	public static boolean selectYNContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		
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
