package main;


/**
 * @author hv
 * @version 1.0
 * @created 01-Sep-2016 12:03:05 PM
 */
public class SquareFactory extends ShapeFactory {

	@Override
	public IShape getShape() {
		// TODO Auto-generated method stub
		return new Square();
	}
	

}