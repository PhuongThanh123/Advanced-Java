package Store;



/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 29-Aug-2016 8:14:51 AM
 */
public class Product {

	private String name;
	private double price;

	public Product(){

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void finalize() throws Throwable {

	}

	@Override
	public String toString() {
		String s="\t"+name+"\t"+price;
		return s;
	}
	

}