package exercise18;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Class Trooper
 *
 */
public class Trooper extends Soldier{

	public Trooper() {
		// TODO Auto-generated constructor stub
	}
	public Trooper(String name,int power,String weapon){
		super(name, power, weapon);
	}
	/**
	 * Function down power -3;
	 * output: return power after down
	 */
	@Override
	public int fight() {
		
		this.power -=3;
		return this.power;
	}

	@Override
	public String toString() {
		return super.toString()+" Power: "+fight();	}
	

}
