package exercise110;

/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Create class Student
 *
 */
public class Student extends Human {
	private String nameClass;
	private double markI;
	private double markII;
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public double getMarkI() {
		return markI;
	}
	
	public Student(String name, String birthday, String address, String phone,String nameClass, double markI, double markII) {
		super();
		this.nameClass = nameClass;
		this.markI = markI;
		this.markII = markII;
	}
	public void setMarkI(double markI) {
		this.markI = markI;
	}
	public double getMarkII() {
		return markII;
	}
	public void setMarkII(double markII) {
		this.markII = markII;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Name Class: "+nameClass+"Mark I: "+markI+" Mark II: "+markII;
	}
	
	
}
