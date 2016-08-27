package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Author: Le Phuong Thanh Date: 19/08/2016 
 * Version: 1.0 
 * Main Class
 *
 */
public class MainClass14Circle {

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			Calculate13DistancePoint cdp = new Calculate13DistancePoint();
			Exercise13Point epA = new Exercise13Point();
			Exercise13Point epB = new Exercise13Point();

			Exercise14Circle exc = new Exercise14Circle();
			System.out.println("Enter O(x,y)");
			System.out.println("Enter x: ");
			epA.setX(Integer.parseInt(input.readLine()));

			System.out.println("Enter y: ");
			epA.setY(Integer.parseInt(input.readLine()));

			System.out.println("Enter R(x,y)");
			System.out.println("Enter x: ");
			epB.setX(Integer.parseInt(input.readLine()));

			System.out.println("Enter y: ");
			epB.setY(Integer.parseInt(input.readLine()));

			System.out.println("O(" + epA.getX() + "," + epA.getY() + "); R(" + epB.getX() + "," + epB.getY() + ")");
			cdp.setPointA(epA);
			cdp.setPointB(epB);

			double radius = cdp.calDistance();

			if (radius == 0) {
				System.out.println("This is a point");
			} else {
				exc.setRadius(radius);
				double area = exc.calcArea();
				double cir = exc.calcCircumference();

				System.out.println("Result Area of Circle: " + String.format("%.2f", area));
				System.out.println("Result Circumference" + String.format("%,2f", cir));
			}

		} catch (IOException | NumberFormatException e) {
			System.out.println("Infor: " + e.getMessage());
		}

	}

}
