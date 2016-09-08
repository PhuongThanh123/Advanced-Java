package Exercise124StorePet;

import java.util.ArrayList;
import java.util.List;

public class PetManger <T> {
	private List<T> pest;

	public List<T> getPest() {
		if(pest==null){
			pest=new ArrayList<T>();
		}
		return this.pest;
	}

	public void setPest(List<T> pest) {
		this.pest = pest;
	}
	

}
