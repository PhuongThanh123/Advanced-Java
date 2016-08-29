package Store;

import java.util.Date;



/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 29-Aug-2016 8:15:08 AM
 */
public class Card extends Information {

	protected String cardID;
	protected Date dateCreated;
	public Order m_Order;

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Order getM_Order() {
		return m_Order;
	}

	public void setM_Order(Order m_Order) {
		this.m_Order = m_Order;
	}

	public Card(){

	}

	public Card(String cardID,  Order m_Order) {
		super();
		this.cardID = cardID;
		
		this.m_Order = m_Order;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public String toString() {
		String s="ID Card: "+this.cardID;
		return s;
	}
	
}