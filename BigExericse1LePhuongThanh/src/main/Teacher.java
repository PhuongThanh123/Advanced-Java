package main;


/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 06-Sep-2016 11:13:14 AM
 */
public class Teacher extends Person {

	private String abilityTeach;

	public Teacher(){

	}

	public String getAbilityTeach() {
		return abilityTeach;
	}

	public void setAbilityTeach(String abilityTeach) {
		this.abilityTeach = abilityTeach;
	}

	public Teacher(String abilityTeach) {
		super();
		this.abilityTeach = abilityTeach;
	}
	

	public Teacher(String email, String name, String phone, String abilityTeach) {
		super(email, name, phone);
		this.abilityTeach = abilityTeach;
	}

	@Override
	public String toString() {
		String s="\nAbility Teach: "+abilityTeach;
		return super.toString()+s;
	}

	

}