package exercise111;

import java.util.Date;

/**
 * Author: Le Phuong Thanh 
 * Date: 19/08/2016 
 * Version: 1.0 
 * create class Transaction
 *
 */
public class Transaction {
	private String idTransaction;
	private Date dateTransaction;
	private double price;
	private double quantity;//soluong
	
	public String getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(String idTransaction) {
		this.idTransaction = idTransaction;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Transaction(String idTransaction, Date dateTransaction, double price, double quantity) {
		super();
		this.idTransaction = idTransaction;
		this.dateTransaction = dateTransaction;
		this.price = price;
		this.quantity = quantity;
	}

	public Transaction() {
		super();
	}

	/**
	 * Function calculation sum money
	 * return sum money
	 * @return
	 */
	public double sumMoney(){
		double sum=0;
		sum=quantity*price;
		return sum;
	}

}
