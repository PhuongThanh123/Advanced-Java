package exercise111;

public class GoldTrading extends Transaction {
	private String typeGold;

	public String getTypeGold() {
		return typeGold;
	}

	public void setTypeGold(String typeGold) {
		this.typeGold = typeGold;
	}

	public GoldTrading(String idTransaction, String dateTransaction,
			double price, double quantity, String typeGold) {
		super(idTransaction, dateTransaction, price, quantity);
		this.typeGold = typeGold;
	}

	public GoldTrading(String idTransaction, String dateTransaction,
			double price, double quantity) {
		super(idTransaction, dateTransaction, price, quantity);
	}

	@Override
	public double sumMoney() {
		// TODO Auto-generated method stub
		return super.sumMoney();
	}

	
	
	
}
