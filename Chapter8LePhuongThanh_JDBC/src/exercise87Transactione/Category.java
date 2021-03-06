package exercise87Transactione;

public class Category {
	private int id;
	private String name;
	private String description;
	private String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Category(int id, String name, String description, String image) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
	}
	public Category() {
		super();
	}
	@Override
	public String toString() {
		return this.id+"\t"+this.name+"\t"+this.description+"\t"+this.image+"\n";
	}
	
	
	
	
}
