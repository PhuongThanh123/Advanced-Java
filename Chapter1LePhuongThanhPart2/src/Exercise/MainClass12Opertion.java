package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Author: Le Phuong Thanh 
 * Date: 19/08/2016 
 * Version: 1.0 
 * Main Class
 *
 */
public class MainClass12Opertion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		Exercise12Opertion ex = new Exercise12Opertion();
		System.out.println("Enter first Number: ");
		ex.setFirstNum(Double.parseDouble(input.readLine()));
		System.out.println("Enter second Number: ");
		ex.setSecondNum(Double.parseDouble(input.readLine()));
		System.out.println("Out fisrt number: " + ex.getFirstNum());
		System.out.println("Input second number: " + ex.getSecondNum());
		System.out.println("Result of Add: " + ex.getAdd());
		System.out.println("Result of Sub: " + ex.getSub());
		System.out.println("Result of Sub: " + ex.getMulti());
		try{
		System.out.println("Result of Sub: " + ex.getDiv());
		}catch(ArithmeticException ex1){
			System.out.println("Info: "+ex1.getMessage());
			
		}

	}

}
