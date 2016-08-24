package exercise117;
/**
 * Author: Le Phuong Thanh
 * Date: 24/08/2016
 * Version: 1.0
 * Create class Brid
 *
 */
public class Brid extends Animal implements IFlying,INest,INonMoult {
	
	
	
	public void nest() {
		System.out.println("Brid nest");
		
	}

	public void fly() {
		System.out.println("Brid can fly");
		
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	

}
