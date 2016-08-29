package Store;

import java.util.Date;



/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 29-Aug-2016 8:14:52 AM
 */
public class CreditCard extends Card implements IAuthMethod {

	private Date expirationDate;
	private double maxDebt;
	private String type;

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getMaxDebt() {
		return maxDebt;
	}

	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CreditCard(){

	}

	public CreditCard(String cardID,  Order m_Order,Date expirationDate, double maxDebt, String type) {
		super(cardID,  m_Order);
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String getAuthMethod(){
		String s;
		s="******Authenticated********";
		return s;
	}

	@Override
	public String toString() {
		return super.toString()+"\nExpiration Date: "+this.expirationDate+"\nMax Debt: "+this.maxDebt+"\nType of card: "+this.type;
	}

}