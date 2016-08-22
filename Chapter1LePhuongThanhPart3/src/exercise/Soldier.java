package exercise;

public class Soldier {
	
	private String name;
	protected int power;
	private String weapon;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public Soldier() {
		super();
	}
	public Soldier(String name, int power, String weapon) {
		super();
		this.name = name;
		this.power = power;
		this.weapon = weapon;
	}
	public int fight(){
		int result=power-1;
		return result;
	}
	@Override
	public String toString() {
		
		return "Name: "+this.name +"\nWeapon: "+this.weapon;
	}

}
