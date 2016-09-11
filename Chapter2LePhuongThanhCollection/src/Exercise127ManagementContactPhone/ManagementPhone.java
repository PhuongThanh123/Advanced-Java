package Exercise127ManagementContactPhone;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 11/09/2016 
 * @Version: 1.0 
 * @Create Class management handling Phone
 *
 */
public class ManagementPhone {
	private List<Phone> listPhone = new ArrayList<Phone>();
	private List<Phone> listSearch = new ArrayList<Phone>();
	private Phone phone = new Phone();

	// private Phone phone = new Phone();

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
	 * @description: add new contact into Contact Phone
	 */
	public void addContac(Phone phone) {
		listPhone.add(phone);
	}

	/**
	 * @param name
	 * @return If length of list > 0 return list, else return null
	 */
	public List<Phone> searchContact(String name) {
		listSearch.clear();
		if (lengthOfList() != 0) {
			for (int i = 0; i < listPhone.size(); i++) {
				if (listPhone.get(i).getName().contains(name)) {
					listSearch.add(listPhone.get(i));
				}
			}
			return listSearch;
		}
		return null;
	}

	public Phone searchOldNumber(String oldNumber) {
		// listSearch.clear();
		if (lengthOfList() != 0) {
			for (int i = 0; i < listSearch.size(); i++) {
				if (listSearch.get(i).getNumberPhone().contains(oldNumber)) {
					phone=new Phone(listSearch.get(i).getName(),oldNumber );
					return phone;
				}
			}

		}
		return null;
	}

	/**
	 * @param name
	 * @Desciptione: Method delete a contact in list
	 */
	public void deleteContact(String name) {
		if (lengthOfList() != 0) {
			for (int i = listPhone.size() - 1; i >= 0; i--) {
				if (listPhone.get(i).getName().contains(name)) {
					listPhone.remove(listPhone.get(i));
				}
			}
			System.out.println("Successfully!");
			printAll();

		} else
			System.out.println("Emtry!");
	}

	public void updateNumberPhone(String newNumberPhone) {

		listSearch.get(0).setNumberPhone(newNumberPhone);
	}

	/**
	 * @return length of list after search
	 */
	public int lengthOfListSearch() {
		return listSearch.size();
	}

	public boolean isUpdateAll(String name) {
		searchContact(name);
		int num = listSearch.size();
		if (num == 0)
			return false;
		return true;

	}

	/**
	 * @return length of ListPhone
	 * @Desciption: 
	 */
	public int lengthOfList() {
		return listPhone.size();
	}

	/**
	 * @return result list contact after search
	 */
	public String printSearch() {
		return toString(listSearch);
	}

	/**
	 * @return list contact normal
	 */
	public String printAll() {
		return toString(listPhone);
	}

	/**
	 * @param oldNumber
	 * @Desciption: print list contact after search 
	 */
	public void printNumberPhone(String oldNumber) {
		System.out.println(searchOldNumber(oldNumber).toString());
	}

	public String toString(List<Phone> listPhone) {
		String s = "----------List Contact-----------\n";
		s += "Name\tNumberPhone\n";
		for (int i = 0; i < listPhone.size(); i++) {
			s += listPhone.get(i).toString() + "\n";
		}
		return s;
	}

}
