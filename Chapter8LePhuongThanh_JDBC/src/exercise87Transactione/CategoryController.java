package exercise87Transactione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class CategoryController {
	Database db=new Database();
	private List<Category> listCategory=new ArrayList<Category>();
	Category category=new Category();

	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<Category> listCategory) {
		this.listCategory = listCategory;
	}

	
	public CategoryController() {
		super();
	}

	public CategoryController(List<Category> listCategory) {
		super();
		this.listCategory = listCategory;
	}

	/**
	 * @return list Category
	 */
	public List<Category> getAllCategory() {
		listCategory=new ArrayList<Category>();
		
		try (Connection conn=db.connect()){
			String sql="SELECT * FROM Category";
			Statement statement=conn.createStatement();
			
			
			ResultSet resultSet=statement.executeQuery(sql);
			
			while(resultSet.next()){
		
				category=new Category();
				category.setId(resultSet.getInt("id"));
				category.setName(resultSet.getString("name"));
				category.setDescription(resultSet.getString("description"));
				category.setImage(resultSet.getString("image"));
				listCategory.add(category);
				
			}
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
		return listCategory;
		
		
	}
	
	/**
	 * @param index
	 * @return 1 record of Category
	 */
	public List<Category> getCategory(int index){
		for(int i=0;i<listCategory.size();i++){
			listCategory.get(index).toString();
		}
		return listCategory;
	}

	@Override
	public String toString() {
		getAllCategory();
		String s="===============List Category===========\n";
		s+="ID \t Name \t descipton \t Image \n";
		for(int i=0;i<listCategory.size();i++){
			s+=listCategory.get(i).toString();
		}
		return s;
	}
	

}
