package Exercise127ManagementContactPhone;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 09/09/2016 
 * @Version: 1.0 
 * @Create Class Phone
 *
 */
public class Phone {
	private String name;
	private String numberPhone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	public Phone(String name, String numberPhone) {
		super();
		this.name = name;
		this.numberPhone = numberPhone;
	}
	public Phone() {
		super();
	}
	@Override
	public String toString() {
		return name+"\t"+numberPhone;
	}
	

}
