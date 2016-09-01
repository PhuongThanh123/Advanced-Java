package main;


/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 01-Sep-2016 12:03:11 PM
 */
public class CircleFactory extends ShapeFactory {

	@Override
	public IShape getShape() {
		return new Circle();
	}

	

}