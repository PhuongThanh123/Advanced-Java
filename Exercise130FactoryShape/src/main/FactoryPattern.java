package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




/**
 * @author Le Phuong thanh
 * @version 1.0
 * @created 01-Sep-2016 11:01:06 AM
 */
public class FactoryPattern {

	public static void main(String [] agrs) {
		try{
		//input type:""
		//get an object and call its draw method
		
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You Enter: CIRCLE or SQUASES or RECTANGLE");
		String type=input.readLine();
		IShape iShape;
		switch (type) {
		case "CIRCLE":
		case "circle":
			CircleFactory circleFactory=new CircleFactory();
			iShape=circleFactory.getShape();
			iShape.draw();
			break;
		case "SQUARE":
		case "Square":
			SquareFactory squareFactory=new SquareFactory();
			iShape=squareFactory.getShape();
			iShape.draw();
			break;
		case "RECTANGLE":
		case "Rectangle":
			RectangleFactory rectangleFactory=new RectangleFactory();
			iShape=rectangleFactory.getShape();
			iShape.draw();

		default:
			System.out.println("Wrongchoose");
			break;
		}
		}catch(IOException e){
			System.out.println("Error: "+e.getMessage());
		}

	}

}