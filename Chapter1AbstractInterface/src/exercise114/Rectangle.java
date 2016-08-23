package exercise114;
/**
 * Author: Le Phuong Thanh
 * Date: 23/08/2016
 * Version: 1.0
 * Create class Rectangle extends class Shape
 *
 */
public class Rectangle extends Shape{
	private double hight;
	private double width;
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * function calculate perimeter of rectangle
	 * Output: return result 
	 */
	public double perimeter() {
		
		return (hight+width)*2;
	}
	/**
	 * function calculate area of rectangle
	 * Output: return result 
	 */
	public double area() {
		// TODO Auto-generated method stub
		return hight*width;
	}
	public Rectangle(double hight, double width) {
		super();
		this.hight = hight;
		this.width = width;
	}
	public Rectangle() {
		super();
	}
	

}
