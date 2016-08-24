package exercise19;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * class computer superclass
 *
 */
public class Computer {
	private String id;
	private double price;
	private String manufacturer;//hang san xuat
	private int quantity; //so luong

	public Computer() {
		super();
	}
	public Computer(String id, double price, String manufacturer, int quantity) {
		super();
		this.id = id;
		this.price = price;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * function calculate sum money
	 * return sum
	 * @return
	 */
	public double sumMoney(){
		return price*quantity;
	}
	@Override
	public String toString() {
		
		return "\nID: "+id+"\nPrice: "+price+"\nMunufacturer: "+manufacturer+"\nQuantity: "+quantity;
	}
	
	
}
