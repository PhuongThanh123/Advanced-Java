package exercise114;
/**
 * Author: Le Phuong Thanh
 * Date: 23/08/2016
 * Version: 1.0
 * Create class Square extends class Shape
 *
 */
public class Square extends Shape {
	private double 	length;

	public double getLength() {
		return length;
	}

	public void setLength(double hight) {
		this.length = hight;
	}

	public Square(double hight) {
		super();
		this.length = hight;
	}

	public Square() {
		super();
	}
	/**
	 * function calculate perimeter of Square
	 * Output: return result 
	 */
	public double perimeter() {
		return length*4;
	}
	/**
	 * function calculate area of Square
	 * Output: return result 
	 */
	public double area() {
		return Math.pow(length, 2);
	}

	

}
