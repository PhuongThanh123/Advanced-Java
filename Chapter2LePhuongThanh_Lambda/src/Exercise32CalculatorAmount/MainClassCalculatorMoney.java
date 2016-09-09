package Exercise32CalculatorAmount;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 09/09/2016 
 * @Version: 1.0 
 * @Create Class Handling calculator
 *
 */
public class MainClassCalculatorMoney {

	public static void main(String[] args) {
		List<Integer> amount = Arrays.asList(new Integer[] { 2, 3, 5, 7 });
		int price = 5200;
		amount.forEach(element -> {
			System.out.println("Total: " + price * element + " VND");
		});

	}

}
