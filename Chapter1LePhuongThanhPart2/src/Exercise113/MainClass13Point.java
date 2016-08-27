package Exercise113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Author: Le Phuong Thanh Date: 19/08/2016 
 * Version: 1.0 
 * Main Class of Point
 *
 */
public class MainClass13Point {

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			Calculate13DistancePoint cdp = new Calculate13DistancePoint();
			Exercise13Point epA = new Exercise13Point();
			Exercise13Point epB = new Exercise13Point();

			System.out.println("Enter A(x,y)");
			System.out.println("Enter x: ");
			epA.setX(Integer.parseInt(input.readLine()));

			System.out.println("Enter y: ");
			epA.setY(Integer.parseInt(input.readLine()));

			System.out.println("Enter B(x,y)");
			System.out.println("Enter x: ");
			epB.setX(Integer.parseInt(input.readLine()));

			System.out.println("Enter y: ");
			epB.setY(Integer.parseInt(input.readLine()));

			System.out.println("A(" + epA.getX() + "," + epA.getY() + "); B(" + epB.getX() + "," + epB.getY() + ")");
			cdp.setPointA(epA);
			cdp.setPointB(epB);

			System.out.println("Result of distance between two points A & B is: " + cdp.calDistance());
		} catch (IOException | NumberFormatException e) {
			System.out.println("Infor: " + e.getMessage());
		}

	}

}
