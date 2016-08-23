package exercise112;

public class ReferenceBook extends Book{

	private double tax;

	public ReferenceBook(String idBook, String name, String date, double price,
			int quantity, String publishingCompany, double tax) {
		super(idBook, name, date, price, quantity, publishingCompany);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public ReferenceBook() {
		super();
	}

	@Override
	public double sumMoney() {
		
		return super.sumMoney()+super.sumMoney()*tax;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "\nTax: "+tax+"\nSum Money: "+sumMoney();
	}
	

}
