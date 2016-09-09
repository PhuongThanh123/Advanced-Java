package Exercise127ManagementContactPhone;

import java.util.ArrayList;
import java.util.List;

public class ManagementPhone {
	private List<Phone> listPhone=new ArrayList<Phone>();
	private Phone phone;

	public List<Phone> getListPhone() {
		return listPhone;
	}

	public void setListPhone(List<Phone> listPhone) {
		this.listPhone = listPhone;
	}

	public ManagementPhone(List<Phone> listPhone) {
		super();
		this.listPhone = listPhone;
	}

	public ManagementPhone() {
		super();
	}
	/**
	 * @param name
	 * @param numberPhone
	 * description: add new contact into Contact Phone
	 */
	public void addContac(String name, String numberPhone){
		listPhone.add(phone);
	}
	public ArrayList<Phone> searchContact(String name){
		return null;
		
	}

	@Override
	public String toString() {
		String s="----------List Contact-----------\n";
		s+="Name\tNumberPhone\n";
		for(int i=0;i<listPhone.size();i++){
			s+=listPhone.get(i).toString()+"\t";
		}
		return s;
	}
	

}
