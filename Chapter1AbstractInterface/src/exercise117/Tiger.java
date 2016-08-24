package exercise117;
/**
 * Author: Le Phuong Thanh
 * Date: 23/08/2016
 * Version: 1.0
 * Create class Tiger
 *
 */
public class Tiger extends Animal implements Iswimiming, IRunning,INonMoult, IBurrow  {

	public void burrow() {
		System.out.println("Tiger is living in burrow");
		
	}

	public void run() {
		System.out.println("Tiger is run");
		
	}

	public void swim() {
		System.out.println("Tiger is swim");		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
