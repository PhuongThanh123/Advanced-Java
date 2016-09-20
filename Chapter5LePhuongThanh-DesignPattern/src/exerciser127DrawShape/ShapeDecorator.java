package exerciser127DrawShape;


/**
 * @author  Le Phuong Thanh
 * @version 1.0
 * @created 11-Sep-2016 4:52:08 PM
 */
public class ShapeDecorator implements Shape {

	

private Shape shape;


	public ShapeDecorator(){

	}

	public void draw(){
		
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}