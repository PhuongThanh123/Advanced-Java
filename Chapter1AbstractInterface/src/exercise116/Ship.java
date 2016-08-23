package exercise116;

public class Ship extends Transport implements IMoving, IUsingFuel{
	private int capacity;
	private double fuelForStarup;
	private int speedReverse;
	private int speedStraight;
	private String typeOfFuel;
	private double weigth;
	@Override
	public double calUsingFuel() {
		double resutl=0;
		resutl=this.distance/(usedFuel-fuelForStarup);
		return resutl;
	}
	@Override
	public double calSpeed() {
		double result=0;
		result=this.distance/this.time+speedStraight-speedReverse;
		return result;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getFuelForStarup() {
		return fuelForStarup;
	}
	public void setFuelForStarup(double fuelForStarup) {
		this.fuelForStarup = fuelForStarup;
	}
	public int getSpeedReverse() {
		return speedReverse;
	}
	public void setSpeedReverse(int speedReverse) {
		this.speedReverse = speedReverse;
	}
	public int getSpeedStraight() {
		return speedStraight;
	}
	public void setSpeedStraight(int speedStraight) {
		this.speedStraight = speedStraight;
	}
	public String getTypeOfFuel() {
		return typeOfFuel;
	}
	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	public Ship(String color, String manufactory, String numberID,
			String owner, int capacity, double fuelForStarup, int speedReverse,
			int speedStraight, String typeOfFuel, double weigth) {
		super();
		this.capacity = capacity;
		this.fuelForStarup = fuelForStarup;
		this.speedReverse = speedReverse;
		this.speedStraight = speedStraight;
		this.typeOfFuel = typeOfFuel;
		this.weigth = weigth;
	}
	public Ship() {
		super();
	}
	@Override
	public String toString() {
		String s;
		s=super.toString()+"\nSpeed: "+this.calSpeed()+"\nUsing Fuel: "+calUsingFuel(); 
		return s;
	}
	
}
