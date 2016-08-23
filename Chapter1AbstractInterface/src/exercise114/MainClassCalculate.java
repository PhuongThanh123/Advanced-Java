package exercise114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassCalculate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		Circle circle=new Circle();
		Rectangle rectangle=new Rectangle();
	    Square square=new Square();
		
		System.out.println("==========CALCULATE==========");
		System.out.println("Select: \n1: Cirle \n2:Rectangle \n3:Square");
		
		int number=Integer.parseInt(input.readLine());
		switch(number){
		case 1: 
			System.out.println("=======Calculate CIRCLE=======");
			System.out.println("Enter radius: ");
			double radius=Double.parseDouble(input.readLine());
			circle.setR(radius);
			System.out.println("Perimeter: "+String.format("%.2f",circle.perimeter()));
			System.out.println("Area: "+String.format("%.2f",circle.area()));
			break;
		case 2:
			System.out.println("=======Calculate RECTANGLE=======");
			System.out.println("Enter length: ");
			double length=Double.parseDouble(input.readLine());
			rectangle.setHight(length);
			
			System.out.println("Enter with");
			double width=Double.parseDouble(input.readLine());
			rectangle.setWidth(width);
			
			System.out.println("Perimeter: "+String.format("%.2f",rectangle.perimeter()));
			System.out.println("Area: "+String.format("%.2f",rectangle.area()));
			break;
		case 3:
			System.out.println("=======Calculate SQUATE=======");
			System.out.println("Enter length: ");
			double lengths=Double.parseDouble(input.readLine());
			square.setLength(lengths);
			
			System.out.println("Perimeter: "+String.format("%.2f",square.perimeter()));
			System.out.println("Area: "+String.format("%.2f",square.area()));
			break;
			default:
			System.out.println("Wrong select!");
			break;
		}
	}

}
