package exercise;

public class Trooper extends Soldier{

	public Trooper() {
		// TODO Auto-generated constructor stub
	}
	public Trooper(String name,int power,String weapon){
		super(name, power, weapon);
	}
	@Override
	public int fight() {
		
		this.power -=3;
		return this.power;
	}

	@Override
	public String toString() {
		return super.toString()+" Power: "+fight();	}
	

}
