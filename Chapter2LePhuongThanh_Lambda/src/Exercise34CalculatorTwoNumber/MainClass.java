package Exercise34CalculatorTwoNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @Author: Le Phuong Thanh 
 * @Date: 09/09/2016 
 * @Version: 1.0 
 * @Create Class Handling calculator two number
 *
 */
public class MainClass {

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println("Enter number 1: ");
			int number1 = Integer.parseInt(input.readLine());

			System.out.println("Enter number 2: ");
			int number2 = Integer.parseInt(input.readLine());

			Operator op1 = (Integer a, Integer b) -> a + b;
			int sum = op1.operator(number1, number2);
			System.out.println("Sum: " + sum);

			Operator op2 = (Integer a, Integer b) -> a - b;
			int sub = op2.operator(number1, number2);
			System.out.println("Sub: " + sub);

			if (number2 == 0)
				throw new NegativeArraySizeException("Number2 = 0!");
			Operator op3 = (Integer a, Integer b) -> a / b;
			int div = op3.operator(number1, number2);
			System.out.println("Div" + div);

			Operator op4 = (Integer a, Integer b) -> a * b;
			int multi = op4.operator(number1, number2);
			System.out.println("Multi: " + multi);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (NegativeArraySizeException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Done!");
		}

	}

}
