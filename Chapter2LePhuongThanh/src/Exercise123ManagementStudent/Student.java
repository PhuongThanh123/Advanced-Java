package Exercise123ManagementStudent;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 08/09/2016 
 * @Version: 1.0 
 * @Create Class arrayList of CD
 *
 */
public class Student {
	private String id;
	private String name;
	private int age;
	private String placeOfBirth;
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
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	public Student(String id, String name, int age, String placeOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.placeOfBirth = placeOfBirth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		
		return this.id+"\t"+this.name + "\t"+this.age +"\t"+ this.placeOfBirth;
	}
	
}
