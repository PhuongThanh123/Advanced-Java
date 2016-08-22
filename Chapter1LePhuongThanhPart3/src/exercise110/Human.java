package exercise110;

public class Human {
	private String name;
	private String birthday;
	private String address;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Human(String name, String birthday, String address, String phone) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
	}
	public Human() {
		super();
	}
	@Override
	public String toString() {
		return "Name: "+name+" Birthday: "+birthday+" Address: "+address+" Phone: "+phone;
	}
	

}
