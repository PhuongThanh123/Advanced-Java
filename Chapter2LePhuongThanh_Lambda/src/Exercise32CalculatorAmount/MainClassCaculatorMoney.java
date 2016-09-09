package Exercise32CalculatorAmount;

import java.util.Arrays;
import java.util.List;

public class MainClassCaculatorMoney {

	public static void main(String[] args) {
		List<Integer> amount = Arrays.asList(new Integer[] { 2, 3, 5, 7 });
		int price = 5200;
		amount.forEach(element -> {
			System.out.println("Total: " + price * element + " VND");
		});

	}

}
