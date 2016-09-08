package Store;

import java.util.Date;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 29-Aug-2016 8:13:52 AM
 */
public class Order {

	private Date orderDate;
	private boolean printOrder;
	private String status;
	public OrderDetail[] m_OrderDetail;
	private Customer customer;

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public boolean isPrintOrder() {
		return printOrder;
	}

	public void setPrintOrder(boolean printOrder) {
		this.printOrder = printOrder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public OrderDetail[] getM_OrderDetail() {
		return m_OrderDetail;
	}

	public Order(Date orderDate, boolean printOrder, String status,
			OrderDetail[] m_OrderDetail, Customer customer) {
		super();
		this.orderDate = orderDate;
		this.printOrder = printOrder;
		this.status = status;
		this.m_OrderDetail = m_OrderDetail;
		this.customer = customer;
	}

	public void setM_OrderDetail(OrderDetail[] m_OrderDetail) {
		this.m_OrderDetail = m_OrderDetail;
	}

	public Order() {

	}

	public Order(Date orderDate, boolean printOrder, String status,
			OrderDetail[] m_OrderDetail) {
		super();
		this.orderDate = orderDate;
		this.printOrder = printOrder;
		this.status = status;
		this.m_OrderDetail = m_OrderDetail;
	}

	public void finalize() throws Throwable {

	}

	public double calSubTotal() {
		double total = 0;
		for (int i = 0; i < m_OrderDetail.length; i++) {
			total += m_OrderDetail[i].calLineTotal();
		}
		return total;
	}

	public double calTax() {
		double sum = 0;
		if (printOrder)
			sum = calSubTotal() * 0.1;
		return sum;

	}

	public double calTotalAmount() {
		double sum = 0;
		sum = calSubTotal() + calTax();
		return sum;
	}

	@Override
	public String toString() {

		String result = "\n\t****_____Information of customer____****";
		result += customer.toString();
		result += "\nOrder Date: " + orderDate + "Print Order: " + printOrder
				+ "\nStatus: " + status + " ";
		

		result += "\n\t----------List of Order-------------\n";
		result += "\tName\t price\t Quantity\tLine Total \n";
		for (int i = 0; i < m_OrderDetail.length; i++) {
			result += m_OrderDetail[i].toString();
			System.out.println();
		}
		result += "\n\t------------------------------------\n";
		result += "Sub total: " + calSubTotal();
		result += "\nTax of product: " + calTax();
		result += "\nTotal Amount: " + calTotalAmount();
		return result;

	}

}