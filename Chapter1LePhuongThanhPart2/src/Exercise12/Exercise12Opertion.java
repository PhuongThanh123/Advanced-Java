package Exercise12;

/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Class calculation add, sub, multi and divide of two number
 *
 */
public class Exercise12Opertion {
	

	private double firstNum;
	private double secondNum;

	public double getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(double firstNum) {
		this.firstNum = firstNum;
	}

	public double getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}

	/**
	 * Function: add two operand 
	 * Input: 
	 * Out: returns the sum of two values
	 */

	public double getAdd() {
		double sum;
		sum = firstNum + secondNum;
		return sum;
	}

	/**
	 * Function: subtraction two operand 
	 * Input: 
	 * Out: return minus of two values
	 */

	public double getSub() {
		double sub;
		sub = firstNum - secondNum;
		return sub;
	}

	/**
	 * Function: add Multi operand 
	 * Input: 
	 * Out: return a produce result of multi of two values
	 */

	public double getMulti() {
		double multi;
		multi = firstNum * secondNum;
		return multi;
	}

	/**
	 * Function: add divide operand 
	 * Input: 
	 * Out: return divisor of two values
 	 */

	public double getDiv() {
		if(secondNum==0) throw new ArithmeticException("Error: divide number 0!");
		double div;
		div = firstNum / secondNum;
		return div;
	}
	public Exercise12Opertion(double firstNum, double secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	public Exercise12Opertion() {
		super();
	}

}
