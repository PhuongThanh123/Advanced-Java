package Store;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 29-Aug-2016 8:13:51 AM
 */
public class Customer extends Information {

	private String customerID;
	public Order m_Order;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public Order getM_Order() {
		return m_Order;
	}

	public void setM_Order(Order m_Order) {
		this.m_Order = m_Order;
	}

	public Customer() {

	}

	public Customer(String address, String email, String identityCardNumber,
			String name, String phoneNumber, String customerID, Order m_Order) {
		super(address, email, identityCardNumber, name, phoneNumber);
		this.customerID = customerID;
		this.m_Order = m_Order;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public String toString() {
		return super.toString() + "Customer ID" + this.customerID;
	}

}