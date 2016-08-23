package exercise117;

public class Animal {
	private String name;
	private String food;
	public Animal(String name, String food) {
		super();
		this.setName(name);
		this.setFood(food);
	}
	public Animal() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	@Override
	public String toString() {
		String s="Name: "+name+"\nFood: "+food;
		return s;
			}

}
