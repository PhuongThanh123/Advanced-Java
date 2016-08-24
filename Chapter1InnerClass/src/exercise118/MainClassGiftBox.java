package exercise118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Author: Le Phuong Thanh 
 * Date: 19/08/2016 
 * Version: 1.0 
 * Description: main class
 *
 */
public class MainClassGiftBox {
	public static void main(String[] agrs) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			//add information gift
			GiftBox giftBox = new GiftBox();
			GiftBox.Gift gift = giftBox.new Gift();
			System.out.println("Enter shape: ");
			String shape = input.readLine();

			System.out.println("Enter color: ");
			String color = input.readLine();

			System.out.println("Enter name: ");
			String name = input.readLine();

			System.out.println("Enter weight: ");
			double weigth = Double.parseDouble(input.readLine());
			if (weigth <= 0)
				throw new NegativeArraySizeException(
						"Not is value less than 0!");

			giftBox = new GiftBox(shape, color);
			gift = giftBox.new Gift(name, weigth);

			DecimalFormat decimalFormat = new DecimalFormat("#,###");
			System.out.println("Calculate of Gift fee: "
					+ decimalFormat.format(gift.calFee()) + " VND");
			
		} catch (IOException | NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (NegativeArraySizeException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Done!");
		}

	}

}
