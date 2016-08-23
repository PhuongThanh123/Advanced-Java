package exercise117;

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
