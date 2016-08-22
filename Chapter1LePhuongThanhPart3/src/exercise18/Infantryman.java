package exercise18;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Class Infantryman
 *
 */
public class Infantryman extends Soldier {
	
	public Infantryman() {
		
	}
	public Infantryman(String name,int power,String weapon){
		super(name, power, weapon);
	}
	/**
	 * Function down power -2;
	 * output: return power after down
	 */
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
