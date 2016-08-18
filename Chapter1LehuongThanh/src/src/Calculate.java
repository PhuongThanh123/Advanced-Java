package src;

public class Calculate {

	public static void main(String args[]) {
		QuadraticEquation1 quadraticequation1 = new QuadraticEquation1(0, 0);

		if (quadraticequation1.calQEquation()==-2) {
			//System.out.println(quadraticequation1.calQEquation());
			System.out.println("Equations infinitely many solutions");
		} else if (quadraticequation1.calQEquation() == -1) {
			System.out.println("The equation has no solution");
		} else {
			System.out.println("Test equation is:"
					+ quadraticequation1.calADivB());
		}
	}

}
