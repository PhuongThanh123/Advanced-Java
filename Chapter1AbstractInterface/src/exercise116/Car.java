package exercise116;
/**
 * Author: Le Phuong Thanh
 * Date: 23/08/2016
 * Version: 1.0
 * Create class Car
 *
 */
public class Car extends Transport implements IMoving,IUsingFuel{
	private String gear;
	private String model;
/**
 * Function calculation Using Fuel
 * Output: return result
 */
	public double calUsingFuel() {
		double result=0;
		result=distance/usedFuel;
		return result;
	}
	/**
	 * Function calculation speed
	 * Output: return result
	 */	
	public double calSpeed() {
		double result=0;
		result=distance/time;
		return result;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
		

	
	public Car(String color, String manufactory, String numberID, String owner,
			double distance, double time, double usedFuel, String gear,
			String model) {
		super(color,manufactory,numberID,owner,distance,time,usedFuel);
		this.gear = gear;
		this.model = model;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String s;
		s=super.toString()+"\nGear: "+gear+"\nModel: "+model;
		return s;
	}
	
}
