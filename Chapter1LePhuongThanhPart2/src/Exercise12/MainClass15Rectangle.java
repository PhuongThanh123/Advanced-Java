package Exercise12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass15Rectangle {

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			Calculate13DistancePoint cdp = new Calculate13DistancePoint();
			Calculate13DistancePoint cdp1 = new Calculate13DistancePoint();
			Exercise13Point epA = new Exercise13Point();
			Exercise13Point epB = new Exercise13Point();
			Exercise13Point epD = new Exercise13Point();
			Exercise15Rectangle exc = new Exercise15Rectangle();

			System.out.println("Enter A(x,y)");
			System.out.println("Enter x: ");
			int xa = Integer.parseInt(input.readLine());
			epA.setX(xa);
			epB.setX(xa);
			System.out.println("Enter y: ");
			int ya = Integer.parseInt(input.readLine());
			epA.setY(ya);
			epD.setY(ya);

			System.out.println("Enter C(x,y)");
			System.out.println("Enter x: ");
			int xc = Integer.parseInt(input.readLine());
			epD.setX(xc);

			System.out.println("Enter y: ");
			int yc = Integer.parseInt(input.readLine());
			epB.setY(yc);

			System.out.println("A(" + epA.getX() + "," + epA.getY() + "); C(" + epB.getX() + "," + epB.getY() + ")");
			cdp.setPointA(epA);
			cdp.setPointB(epB);
			cdp1.setPointA(epA);
			cdp1.setPointB(epD);

			double width = cdp.calDistance();
			double length = cdp1.calDistance();

			if (width == 0 && length == 0) {
				System.out.println("This is a point");
			} else {
				exc.setLength(length);
				exc.setWidth(width);
				double area = exc.calAreaRectangle();
				double cir = exc.calCircumferenceRectangle();

				System.out.println("Result Area of Rectangle: " + String.format("%.2f", area));
				System.out.println("Result Circumference of Rectangle: " + String.format("%,2f", cir));
			}

		} catch (IOException | NumberFormatException e) {
			System.out.println("Infor: " + e.getMessage());
		}

	}

}
