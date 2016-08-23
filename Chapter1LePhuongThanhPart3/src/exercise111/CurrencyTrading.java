package exercise111;

import java.util.Date;

public class CurrencyTrading extends Transaction {
	private EnumTypeCurrency typeCurrency;
	private EnumTypeTransactione typeTransactione;
	public EnumTypeCurrency getTypeCurrency() {
		return typeCurrency;
	}
	public void setTypeCurrency(EnumTypeCurrency typeCurrency) {
		this.typeCurrency = typeCurrency;
	}
	public EnumTypeTransactione getTypeTransactione() {
		return typeTransactione;
	}
	public void setTypeTransactione(EnumTypeTransactione typeTransactione) {
		this.typeTransactione = typeTransactione;
	}
	
	public CurrencyTrading(String idTransaction, Date dateTransaction, double price, double quantity,
			EnumTypeCurrency typeCurrency, EnumTypeTransactione typeTransactione) {
		super(idTransaction, dateTransaction, price, quantity);
		this.typeCurrency = typeCurrency;
		this.typeTransactione = typeTransactione;
	}
	public CurrencyTrading() {
		super();
	}
	
	public double transactionPurchar(){
		double sum=0;
		sum=getPrice()*getQuantity();
		return sum;
	}
	public double transactionSale(){
		double sum=0;
		sum=getPrice()*getQuantity()+(getPrice()*getQuantity())*0.001;
		return sum;
	}

}
