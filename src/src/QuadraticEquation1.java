package src;

public class QuadraticEquation1 {

	private double a;
	private double b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double d) {
		this.b = (float) d;
	}
	public QuadraticEquation1(double a, double b){
		this.a=a;
		this.b=b;
	}
	

	public QuadraticEquation1() {
		// TODO Auto-generated constructor stub
	}

	public  double calQEquation(double a, double b) {
		double result = 0;
		if (a == 0) {
			if (b == 0) {
				result = -2;
			} else
				result = -1;
		} else {
			result = (double)(-b / a);
		}
		return result;
	}

	public double calADivB() {
		double s=0;
		if(a>0){
			if(b>0){
				s=-b / a;
			}
		}
		return s;
	}

	public double calQEquation() {
		double result = 0;
		if (a == 0) {
			if (b == 0) {
				result = 0;
			} else
				result = -1;
		} else {
			result = (double)(-b / a);
		}
		return result;
	}

	
}
