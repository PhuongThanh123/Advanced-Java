package exercise116;

public abstract class Transport  {
	protected String color;
	protected String manufactory;
	protected String numberID;
	protected String owner;
	protected double distance;
	protected double time;
	protected double usedFuel;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManufactory() {
		return manufactory;
	}
	public void setManufactory(String manufactory) {
		this.manufactory = manufactory;
	}
	public String getNumberID() {
		return numberID;
	}
	public void setNumberID(String numberID) {
		this.numberID = numberID;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		String s;
		s="Number ID: "+numberID+"\nOwer: "+owner+"\nColor: "+color+"\nManufactory: "+manufactory;
		return s;
	}
	
	
}
