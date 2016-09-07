package main;


/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 06-Sep-2016 11:13:11 AM
 */
public abstract class Person {

	protected String email;
	protected String name;
	protected String phone;

	public Person(){

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Person(String email, String name, String phone) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		String s="Name: "+name +"\nPhone: "+phone+"\nEmail: "+email;
		return s;
	}

	

}