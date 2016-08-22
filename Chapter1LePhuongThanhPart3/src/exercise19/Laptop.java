package exercise19;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Create class laptop
 *
 */
public class Laptop extends Computer {
	private double weight;
	private double timePin;
	private String sizescreen;

	public Laptop(String id, double price, String manufacturer, int quantity, double weight, double timePin,
			String sizescreen) {
		super(id, price, manufacturer, quantity);
		this.weight = weight;
		this.timePin = timePin;
		this.sizescreen = sizescreen;
	}

	public Laptop() {
		super();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getTimePin() {
		return timePin;
	}

	public void setTimePin(double timePin) {
		this.timePin = timePin;
	}

	public String getSizescreen() {
		return sizescreen;
	}

	public void setSizescreen(String sizescreen) {
		this.sizescreen = sizescreen;
	}

	@Override
	public String toString() {
		return super.toString() + "Weight: " + weight + "Time Pin: " + timePin + " Size Screen: " + sizescreen;
	}

}
