package exercise91MultiLanguage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @since 13/9/2016
 * @Desciption: Main class translate language
 *
 */
public class MainClass {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		String language = "en";
		String country = "US";
		Locale currentLocal = new Locale(language, country);

		System.out.println("Select Menu: 1) VietNamese 2) USA ");
		int number = Integer.parseInt(input.readLine());

		switch (number) {
		case 1:
			TranslateLanguage(
					ResourceBundle
							.getBundle("exercise91MultiLanguage/resoutce_vi_VN"),
					currentLocal);
			break;
		case 2:
			TranslateLanguage(
					ResourceBundle
							.getBundle("exercise91MultiLanguage/ve1resource_en_US"),
					currentLocal);
			break;
		default:
			System.out.println("Select worng!");
			break;
		}

	}

	public static void TranslateLanguage(ResourceBundle message,
			Locale currentLocal) {
		List<String> list = new ArrayList<>();
		Enumeration<String> keys = message.getKeys();

		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		list.stream().forEach(System.out::println);
	}
}
