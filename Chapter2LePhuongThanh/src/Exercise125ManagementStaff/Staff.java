package Exercise125ManagementStaff;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 08/09/2016 
 * @Version: 1.0 
 * @Create Class staff
 *
 */

public class Staff implements Comparable<Staff> {
	private String id;
	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Staff() {
		super();
	}

	public Staff(String id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return this.id + "\t" + this.name + "\t" + this.age + "\t"
				+ this.salary;
	}

	@Override
	public int compareTo(Staff o) {
		if (this.salary < o.salary)
			return 0;
		return -1;
	}

}
