package Exercise;

/**
 * Author: Le Phuong Thanh 
 * Date: 19/08/2016 
 * Version: 1.0 Class calculator to
 * find the area, circumference of a Rectangle
 *
 */
public class Exercise15Rectangle {
	
	private double length;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public Exercise15Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Exercise15Rectangle() {
		super();
	}
	/**
	 * Function: calculate Area of Rectangle 
	 * Output: return Area of Rectangle
	 * 
	 * @return
	 */
	public double calAreaRectangle(){
		double area=length*width;
		return area;
	}
	/**
	 * Function: calculate Circumference of Rectangle 
	 * Output: return Circumference of Rectangle
	 * 
	 * @return
	 */
	public double calCircumferenceRectangle(){
		double cir=(length+width)*2;
		return cir;
	}

}
