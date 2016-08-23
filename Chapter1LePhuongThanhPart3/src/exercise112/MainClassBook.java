package exercise112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClassBook {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		TextBook textBook = new TextBook();
		ReferenceBook referenceBook = new ReferenceBook();
		ManageBook manageBook = new ManageBook();

		ArrayList<TextBook> arrayListtestBook = new ArrayList<TextBook>();
		ArrayList<ReferenceBook> arrayListReferenceBooks = new ArrayList<ReferenceBook>();

		System.out.println("=========MANAGE BOOK==========");
		boolean flag = true;
		while (flag) {
			System.out.println("Enter id: ");
			String idBook = input.readLine();

			System.out.println("Enter name: ");
			String name = input.readLine();

			System.out.println("Enter date: ");
			String date = input.readLine();

			System.out.println("Enter price: ");
			double price = Double.parseDouble(input.readLine());

			System.out.println("Enter Quantity: ");
			int quantity = Integer.parseInt(input.readLine());

			System.out.println("Enter Publishing Company: ");
			String publishingCompany = input.readLine();

			System.out.println("======Select Book=======");
			System.out.println("Choose \n1-TextBook \n2-Reference Book");
			int number = Integer.parseInt(input.readLine());

			switch (number) {
			case 1:
				System.out.println("---------Text Book----------");
				System.out.println("Enter state of book: (true-new/false-old)");
				boolean state = Boolean.parseBoolean(input.readLine());

				textBook = new TextBook(idBook, name, date, price, quantity,
						publishingCompany, state);
				arrayListtestBook.add(textBook);
				
				for (int i = 0; i < arrayListtestBook.size(); i++) {
					System.out.println("Output: "
							+ arrayListtestBook.get(i).toString());
				}
				manageBook.setArrayListTesx(arrayListtestBook);
				
				if (state) {
					System.out.println("Sum price of TextBook New: "
							+ manageBook.sumTextBookNew());
				} else {
					System.out.println("Sum price of TextBook Old: "
							+ manageBook.sumTextBookOld());
				}

				break;
			case 2:
				System.out.println("---------Reference Book----------");
				System.out.println("Enter tax: ");
				double tax = Double.parseDouble(input.readLine());

				referenceBook = new ReferenceBook(idBook, name, date, price,
						quantity, publishingCompany, tax);
				arrayListReferenceBooks.add(referenceBook);
				
				for (int i = 0; i < arrayListReferenceBooks.size(); i++) {
					System.out.println("Output: "
							+ arrayListReferenceBooks.get(i).toString());
				}
				manageBook.setArrayListRefe(arrayListReferenceBooks);
				
				System.out.println("Avg price of Reference: "
						+ manageBook.avgReferenceBook());
			default:
				break;
			}
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
