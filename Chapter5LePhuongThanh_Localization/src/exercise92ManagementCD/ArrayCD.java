package exercise92ManagementCD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 07/09/2016 
 * @Version: 1.0 
 * @Create Class arrayList of CD
 *
 */
public class ArrayCD {
	private ArrayList<CD> arrayCD=new ArrayList<CD>();
	ResourceBundle message=ResourceBundle.getBundle("exercise92ManagementCD/resource_vi_VN");
	
	public ArrayCD() {
		super();
	}

	public ArrayCD(ArrayList<CD> arrayCD) {
		super();
		this.arrayCD = arrayCD;
	}

	public ArrayList<CD> getArrayCD() {
		return arrayCD;
	}

	public void setArrayCD(ArrayList<CD> arrayCD) {
		this.arrayCD = arrayCD;
	}
	public double calTotalPrice(){
		double total=0;
		for(int i=0;i<arrayCD.size();i++){
			total+=arrayCD.get(i).getPrice();
		}
		return total;
	}
	public void addCD(CD cd){
		arrayCD.add(cd);
	}

	@Override
	public String toString() {
		String s = "";
		if (arrayCD.size() != 0) {
			Collections.sort(arrayCD);
			System.out.println(message.getString("toString"));
			for (int i = 0; i < arrayCD.size(); i++) {
				s += arrayCD.get(i).toString()+"\n";
			}
			s+="\nTotal price: "+calTotalPrice();
		}
		return s;
	}

	

	
	

}
