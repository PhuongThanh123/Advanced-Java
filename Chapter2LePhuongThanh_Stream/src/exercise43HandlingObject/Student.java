package exercise43HandlingObject;

public class Student {
	private String firstName;
	private int age;
	private double mark1;
	private double mark2;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMark1() {
		return mark1;
	}
	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}
	public double getMark2() {
		return mark2;
	}
	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	public Student(String firstName, int age, double mark1, double mark2) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	public Student() {
		super();
	}
	
	public double avg(){
		return (mark1+mark2)/2;
	}
	@Override
	public String toString() {
		
		return firstName+"\tAge= "+age+"\t\tMark1 = "+mark1+"\tMark2 = "+mark2+"\tAgv= "+avg();
	}
	
	
	

}
