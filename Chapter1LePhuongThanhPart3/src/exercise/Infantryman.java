package exercise;

public class Infantryman extends Soldier {
	
	public Infantryman() {
		// TODO Auto-generated constructor stub
	}
	public Infantryman(String name,int power,String weapon){
		super(name, power, weapon);
	}
	@Override
	public int fight() {
		this.power -=2;
		return this.power;
	}

	@Override
	public String toString() {
		return super.toString()+" Power: "+ fight();
	}

	
	

}
