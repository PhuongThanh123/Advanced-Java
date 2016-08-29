package Store;



/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 29-Aug-2016 8:15:07 AM
 */
public class ATMCard extends Card implements IAuthMethod {

	private double balance;

	public ATMCard(String cardID, Order m_Order,double balance) {
		super(cardID,  m_Order);
		this.balance = balance;
	}

	

	public ATMCard() {
		super();
	}



	public void finalize() throws Throwable {
		super.finalize();
	}

	public String getAuthMethod(){
		String s="*******Authenticated********";
		return s;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}



	@Override
	public String toString() {
		
		return super.toString()+ "\nBalance: "+this.balance;
	}

}