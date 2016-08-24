package exercise117;
/**
 * Author: Le Phuong Thanh
 * Date: 24/08/2016
 * Version: 1.0
 * Create class Fish
 *
 */
public class Fish extends Animal implements Iswimiming, INonMoult, IWater{

	public void water() {
		System.out.println("Fish is living in water");
		
	}

	
	public void swim() {
		System.out.println("Fish is swim");
		
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
