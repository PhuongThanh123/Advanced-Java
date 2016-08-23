package exercise114;
/**
 * Author: Le Phuong Thanh
 * Date: 23/08/2016
 * Version: 1.0
 * Create class Circle extends class Shape
 *
 */
public class Circle extends Shape{
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	public Circle() {
		super();
	}

	/**
	 * function calculate perimeter of Circle
	 * Output: return result 
	 */
	public double perimeter() {
		return 2*Math.PI*r;
	}
	/**
	 * function calculate area of Circle
	 * Output: return result 
	 */
	public double area() {
		return Math.PI*Math.pow(r, 2);
	}
	

}
