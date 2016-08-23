package exercise112;

public class TextBook extends Book{
	private boolean state;

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public TextBook(String idBook, String name, String date, double price,
			int quantity, String publishingCompany, boolean state) {
		super(idBook, name, date, price, quantity, publishingCompany);
		this.state = state;
	}

	public TextBook() {
		super();
	}

	
	public double sumMoneyTBNew() {
		return super.sumMoney();
	}
	public double sumMoneyTBOld() {
		return super.sumMoney()*0.5;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nState: "+state;
	}
	

}
