package main;


/**
 * @author hv
 * @version 1.0
 * @created 01-Sep-2016 12:03:12 PM
 */
public class RectangleFactory extends ShapeFactory {

	@Override
	public IShape getShape() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}



}