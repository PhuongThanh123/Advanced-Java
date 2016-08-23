package exercise111;

import java.util.Date;

public class GoldTrading extends Transaction {
	private String typeGold;

	public String getTypeGold() {
		return typeGold;
	}

	public void setTypeGold(String typeGold) {
		this.typeGold = typeGold;
	}

	
	public GoldTrading(String idTransaction, Date dateTransaction, double price, double quantity, String typeGold) {
		super(idTransaction, dateTransaction, price, quantity);
		this.typeGold = typeGold;
	}

	public GoldTrading(String idTransaction, Date dateTransaction, double price, double quantity) {
		super(idTransaction, dateTransaction, price, quantity);
	}

	@Override
	public double sumMoney() {
		// TODO Auto-generated method stub
		return super.sumMoney();
	}

	
	
	
}
