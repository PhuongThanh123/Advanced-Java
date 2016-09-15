package exercise71ManagmentPhone;

/**
 * @author hv
 *
 */
public class Contact {
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
	public Contact(String name, String numberPhone) {
		super();
		this.name = name;
		this.numberPhone = numberPhone;
	}
	public Contact() {
		super();
	}
	@Override
	public String toString() {
		
		return this.name+"\t"+this.numberPhone;
	}
	
	
}
