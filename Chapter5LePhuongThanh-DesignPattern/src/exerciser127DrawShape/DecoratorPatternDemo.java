package exerciser127DrawShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 11-Sep-2016 4:52:08 PM
 */
public class DecoratorPatternDemo {

	public static void main(String agrs[]) throws NumberFormatException, IOException{
		
		
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		ShapeDecorator shapeDecorator;
		Shape shape;
		System.out.println("Select Shape: \n\t1) Cricle \n\tRectangle");
		int number = Integer.parseInt(input.readLine());
		
		System.out.println("Select Decorator 1) Yes 2) No");
		int num = Integer.parseInt(input.readLine());
		
		switch (number) {
		case 1:
			shape =new Circle();
			shapeDecorator =new ShapeDecorator();
			shapeDecorator.setShape(shape);
			shapeDecorator.draw();
			break;
		case 2:
			shape =new Rectangle();
			shapeDecorator=new ShapeDecorator();
			shapeDecorator.setShape(shape);
			shapeDecorator.draw();
		default:
			break;
		}
		switch (num) {
		case 1:
			shape=new Circle();
			shapeDecorator=new NormalDecorate();
			shapeDecorator.setShape(shape);
			shapeDecorator.draw();
			break;
		case 2:
			shape=new Rectangle();
			shapeDecorator=new DrawRedColor();
			shapeDecorator.setShape(shape);
			shapeDecorator.draw();
		default:
			break;
		}
	}

}