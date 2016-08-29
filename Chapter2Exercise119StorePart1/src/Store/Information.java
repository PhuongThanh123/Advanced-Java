package Store;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 29-Aug-2016 8:15:27 AM
 */
public class Information {

	protected String address;
	protected String email;
	protected String identityCardNumber;
	protected String name;
	protected String phoneNumber;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Information() {

	}

	public Information(String address, String email, String identityCardNumber,
			String name, String phoneNumber) {
		super();
		this.address = address;
		this.email = email;
		this.identityCardNumber = identityCardNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public void finalize() throws Throwable {

	}

	@Override
	public String toString() {
		String s = "Name: " + this.name + "\nIdentityCard Number"
				+ this.identityCardNumber + "\nAddress: " + this.address
				+ "\nEmail" + this.email + "\nPhone Number" + this.phoneNumber;
		return s;
	}

}