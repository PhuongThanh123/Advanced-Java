package exercise85SearchProduct;

public class Product {
	private int id;
	private String name;
	private double price;
	private int amount;
	private int idcategory;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Product(String name, double price, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return this.id+"\t"+ this.name+"\t\t\t"+this.price+"\t\t"+this.amount+"\t\t"+this.idcategory+"\n";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdcategory() {
		return idcategory;
	}
	public void setIdcategory(int idcategory) {
		this.idcategory = idcategory;
	}
	public Product(int id, String name, double price, int amount, int idcategory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.idcategory = idcategory;
	}
	public Product(String name, double price, int amount, int idcategory) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.idcategory = idcategory;
	}
	
	
}
