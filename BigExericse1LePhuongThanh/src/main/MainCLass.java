package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainCLass {

	public static void main(String[] args) throws NumberFormatException,
			IOException, ParseException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		ManagementClass managementClass = new ManagementClass();
		ManagmentSubject managmentSubject = new ManagmentSubject();
		ManagementTrainee managementTrainee = new ManagementTrainee();
		ManagementScoreFinal managementScoreFinal = new ManagementScoreFinal();
		MangementScorelesson mangementScorelesson = new MangementScorelesson();

		managementClass.setAllClass();

		System.out.println("==============MANAGEMENT TRAINEE=============");
		boolean flag2 = true;
		while (flag2) {
			System.out
					.println("Select Menu: \n\t1) View List Class \n\t2) View List Subject \n\t3) View List Trainee \n\t4) View List Score Final \n\t5) View List - Update Score Lesson");
			int number = Integer.parseInt(input.readLine());
			switch (number) {
			case 1:
				// view list
				System.out
						.println("-----------------------------------------------------------------");

				System.out.println(managementClass.toStringClass());
				System.out
						.println("-----------------------------------------------------------------");

				System.out
						.println("Select Class: \n1) Choose Class \n2) View List Subject \n3) Add Subject \n4) Delete Subject");

				int number1 = Integer.parseInt(input.readLine());
				switch (number1) {
				case 1:

					System.out
							.println("Select Class follow numerical order: Enter number!");

					int index = Integer.parseInt(input.readLine());
					System.out.println(managementClass.getClassSelect(index));
					break;
				case 2:
					break;

				}

			case 2:
				// Choose Class
				managmentSubject.setAllSubject();
				System.out
						.println("----------------------View List Subject--------------------");
				System.out.println(managmentSubject.toStringSubject());

				break;
			case 3:
				// Add Score Lesson
				managementTrainee.setAllTrainee();
				System.out
						.println("----------------------View List Trainee--------------------");
				System.out.println(managementTrainee.toStringTrainee());
				break;
			case 4:
				// View List Score Final
				managementScoreFinal.setAllScoreFinal();
				System.out
						.println("----------------------View List Score Final--------------------");
				System.out.println(managementScoreFinal.toStringScoreFinal());
				break;

			case 5:
				// View List Score Lesson
				mangementScorelesson.setAllScorelesson();
				System.out
						.println("----------------------View List Score Lesson--------------------");
				System.out.println(mangementScorelesson.toStringScorelesson());

				boolean flag = true;
				while (flag) {
					System.out
							.println("Choose: 1) Add new Lesson \n\t2) Remove Lesson");
					number = Integer.parseInt(input.readLine());
					switch (number) {
					case 1:
						System.out
								.println("-----------------ADD new Lessson----------");
						System.out.println("Enter Date: ");
						String date = input.readLine();

						SimpleDateFormat dateFormat = new SimpleDateFormat(
								"dd/MM/yyyy");
						Date datelesson = dateFormat.parse(date);

						System.out.println("Enter lesson: ");
						int lesson = Integer.parseInt(input.readLine());

						System.out.println("Enter Score Attendance: ");
						double scoreAttendance = Double.parseDouble(input
								.readLine());

						System.out.println("Enter Score Active");
						double scoreActive = Double.parseDouble(input
								.readLine());

						System.out.println("Enter Score Agssiment");
						double scoreAgssiment = Double.parseDouble(input
								.readLine());

						Scorelesson se = new Scorelesson(datelesson, lesson,
								scoreActive, scoreAgssiment, scoreAttendance);
						mangementScorelesson.addScore(se);
						System.out.println(mangementScorelesson
								.toStringScorelesson());
						break;
					case 2:
						System.out
								.println("-----------------Delete Lessson----------");
						System.out.println("Enter lesson: ");
						lesson = Integer.parseInt(input.readLine());
						mangementScorelesson.deleteScore(lesson);
						System.out.println(mangementScorelesson
								.toStringScorelesson());
						break;

					default:
						System.out.println("Chooise againt!");
						number = Integer.parseInt(input.readLine());
						break;
					}
					System.out
							.println("Do you want to continue Update List Score Lesson ?[Y/N]");
					if (selectYN()) {
						continue;
					} else {
						break;
					}

				}
				break;
			default:
				System.out.println("Chooise againt Menu!");
				break;
			}
			System.out.println("Do you want to continue Select menu ?[Y/N]");
			if (selectYN()) {
				continue;
			} else {
				break;
			}
		}
	}

	public static boolean selectYN() throws IOException {
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
