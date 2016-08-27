package Exercise114;

/**
 * Author: Le Phuong Thanh Date: 19/08/2016 
 * Version: 1.0 Class calculator to
 * find the area, circumference of a circle
 *
 */
public class Exercise14Circle {
	
	
	final double PI = 3.14;
	private double radius ;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Exercise14Circle() {
		super();
	}

	public Exercise14Circle(double radius) {
		super();
		this.radius = radius;
	}


	/**
	 * Function: calculate Area of circle 
	 * Output: return Area of circle
	 * 
	 * @return
	 */
	public double calcArea() {
		double area = PI * radius * radius;
		return area;
	}

	/**
	 * Function: calculate Circumference of circle 
	 * Output: return Circumference of circle
	 * 
	 * @return
	 */
	public double calcCircumference() {
		double cir = radius * 2 * PI;
		return cir;
	}
	
	


}
