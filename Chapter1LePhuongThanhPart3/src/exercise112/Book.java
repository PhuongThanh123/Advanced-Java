package exercise112;

public class Book {
	private String idBook;
	private String name;
	private String date;
	private double price;
	private int quantity;
	private String publishingCompany;
	public String getIdBook() {
		return idBook;
	}
	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Book(String idBook, String name, String date, double price,
			int quantity, String publishingCompany) {
		super();
		this.idBook = idBook;
		this.name = name;
		this.date = date;
		this.price = price;
		this.quantity = quantity;
		this.publishingCompany = publishingCompany;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public Book() {
		super();
	}
	public double sumMoney(){
		double result=0;
		result=price*quantity;
		return result;
	}
	@Override
	public String toString() {
		String s;
		s="Id: "+idBook+"\n Name: "+name+"\nDate: "+date+"\nPrice: "+price+"\nQuantity: "+quantity+"\nPublishing Company "+publishingCompany;
		return s;
	}
	
}
