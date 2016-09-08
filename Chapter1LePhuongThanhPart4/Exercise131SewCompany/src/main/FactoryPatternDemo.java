package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 01-Sep-2016 2:56:22 PM
 */
public class FactoryPatternDemo {

	public static void main(String[] agrs) {
		AoDai aoDai;
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			System.out
					.println("Select: 1) Traditinal Ao Dai 2) Moden Ao Dai 3) Cheongsam");
			int number = Integer.parseInt(input.readLine());
			switch (number) {
			case 1:
				TraditionalAoDaiFactory traditionalAoDaiFactory = new TraditionalAoDaiFactory();
				aoDai = traditionalAoDaiFactory.getAoDai();
				aoDai.sew();
				break;
			case 2:
				ModenAoDaiFactory modenAoDaiFactory = new ModenAoDaiFactory();
				aoDai = modenAoDaiFactory.getAoDai();
				aoDai.sew();
				break;
			case 3:
				CheongsamFactory cheongsamFactory = new CheongsamFactory();
				aoDai = cheongsamFactory.getAoDai();
				aoDai.sew();
				break;

			default:
				System.out.println("Wrong select");
				break;
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}