package exercise61Diary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		Diary diary1 = new Diary();

		while (true) {
			System.out
					.println("Select Menu:  \n1) ReadFile \n2) WriterFile \n3) ViewFile");
			int number = Integer.parseInt(input.readLine());
			switch (number) {
			case 1:
				diary1.readFile();
				break;
			case 2:
				diary1 = new Diary("", "15/09/2016", "Tuan sau thi");
				diary1.writerFile(diary1);
				break;
			case 3:
				diary1.readFile();
				break;
			default:
				System.out.println("Select wrong!");
				if (selectYN()) {
					continue;
				} else
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
