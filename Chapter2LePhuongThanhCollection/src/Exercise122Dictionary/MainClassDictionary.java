package Exercise122Dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.TreeSet;

/**
 * @author Le Phuong Thanh
 * @date: 07/09/2016
 * @version: 1.0
 * @Create: Class main handling student
 */
public class MainClassDictionary {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		ManagementDictionary managementDictionary = new ManagementDictionary();
		TreeSet<Dictionary> dictionaries = new TreeSet<Dictionary>();
		Dictionary dictionary;

		System.out.println("\t============Management Dictonary============");
		System.out.println("---Add new dictionary---");
		boolean flag1 = true;
		while (flag1) {
			System.out.println("Enter word: ");
			String word = input.readLine();

			System.out.println("Enter meaning: ");
			String meaning = input.readLine();

			dictionary = new Dictionary(word, meaning);
			dictionaries.add(dictionary);
			managementDictionary.setTreeSetDictionaries(dictionaries);
			System.out.println(managementDictionary.toString());

			if (selectYN())
				continue;
			else
				break;
		}

		boolean flag = true;
		while (flag) {
			System.out
					.println("Select Menu:  \n1)View List \n2) Search word \n3)Delete word");
			System.out.println("Enter choose:");
			int number = Integer.parseInt(input.readLine());

			switch (number) {
			case 1:
				// view list
				System.out.println(managementDictionary.toString());
				break;
			case 2:
				System.out.println("Enter search word: ");
				String index = input.readLine();
				if(dictionaries!=null){
					System.out.println("Result!\n");
					System.out.println(managementDictionary.searchWord(index));
				}else
					System.out.println("Emtry");
				//System.out.println(managementDictionary.toString());
				break;
			case 3:
				System.out.println("Enter delete word: ");
				String index1 = input.readLine();
				dictionary = new Dictionary(index1, "");
				if (dictionaries != null) {
					managementDictionary.removeWord(dictionary);
					System.out.println("Removed successlly!");
					System.out.println(managementDictionary.toString());
				} else {
					System.out.println("Emtry");
				}
				break;
			default:
				System.out.println("Wrong choose!");
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
