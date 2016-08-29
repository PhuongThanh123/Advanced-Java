package Store;



/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 29-Aug-2016 8:15:25 AM
 */
public class OrderDetail {

	private int quantity;
	public Product m_Product;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	public OrderDetail(int quantity, Product m_Product) {
		this.quantity = quantity;
		this.m_Product = m_Product;
	}

	public Product getM_Product() {
		return m_Product;
	}

	public void setM_Product(Product m_Product) {
		this.m_Product = m_Product;
	}

	public OrderDetail(){

	}

	

	public void finalize() throws Throwable {

	}

	public double calLineTotal(){
		double total=0;
		
			total=quantity*m_Product.getPrice();
		
		
		return total;
	}
	
	@Override
	public String toString() {
	String s=m_Product.toString()+"\t"+quantity+"\t"+calLineTotal()+" VND"+"\n";
	return s;
	}
	

}