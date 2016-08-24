package exercise117;
/**
 * Author: Le Phuong Thanh
 * Date: 24/08/2016
 * Version: 1.0
 * Create class Boa
 *
 */
public class Boa extends Animal implements Iswimiming, IMoult,IBurrow{

	public void burrow() {
		System.out.println("Boa is living in burrow");
		
	}

	public void moult() {
		System.out.println("Boa is moult");
		
	}

	public void swim() {
		System.out.println("Boa is swim");
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
