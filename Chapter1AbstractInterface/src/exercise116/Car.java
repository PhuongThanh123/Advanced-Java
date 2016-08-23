package exercise116;

public class Car extends Transport implements IMoving,IUsingFuel{
	private String gear;
	private String model;

	public double calUsingFuel() {
		double result=0;
		result=distance/usedFuel;
		return result;
	}
	
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
