package Exercise33CalculatorShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 09/09/2016 
 * @Version: 1.0 
 * @Create Class main handling calculator are of shape
 *
 */
public class Mainclass {
	public static void main(String agrs[]) throws NumberFormatException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter radius: ");

		double radius = Double.parseDouble(input.readLine());
		Area circle = (double PI, double radius2) -> PI
				* Math.pow(radius2, radius2);

		System.out.println("S = PI * (r*r) = "
				+ circle.calArea(Math.PI, radius));

		System.out.println("Enter length: ");
		double length = Double.parseDouble(input.readLine());

		System.out.println("Enter width: ");
		double width = Double.parseDouble(input.readLine());

		Area rectangle = (double length1, double width1) -> length1 * width1;

		System.out.println("S = length * width = "
				+ rectangle.calArea(length, width));
	}

}
