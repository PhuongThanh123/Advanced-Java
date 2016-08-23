package exercise116;

public  class Transport  {
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

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getUsedFuel() {
		return usedFuel;
	}

	public void setUsedFuel(double usedFuel) {
		this.usedFuel = usedFuel;
	}

	public Transport(String color, String manufactory, String numberID,
			String owner, double distance, double time, double usedFuel) {
		super();
		this.color = color;
		this.manufactory = manufactory;
		this.numberID = numberID;
		this.owner = owner;
		this.distance = distance;
		this.time = time;
		this.usedFuel = usedFuel;
	}
	
	public Transport() {
		super();
	}

	
	@Override
	public String toString() {
		String s;
		s="Number ID: "+numberID+"\nOwer: "+owner+"\nColor: "+color+"\nManufactory: "+manufactory;
		return s;
	}
	
	
	
}
