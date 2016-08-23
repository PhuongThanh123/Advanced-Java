package exercise116;

public class Moving {
	protected double distance;
	protected double time;
	protected double usedFuel;
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
	public Moving(double distance, double time, double usedFuel) {
		super();
		this.distance = distance;
		this.time = time;
		this.usedFuel = usedFuel;
	}
	public Moving() {
		super();
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
