package Exercise127ManagementContactPhone;

import java.util.ArrayList;
import java.util.List;

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

		// listSearch.get(0).setNumberPhone(newNumberPhone);
		listSearch.get(0).setNumberPhone(newNumberPhone);
	}

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

	public int lengthOfList() {
		return listPhone.size();
	}

	public String printSearch() {
		return toString(listSearch);
	}

	public String printAll() {
		return toString(listPhone);
	}

	public void printNumberPhone(String oldNumber) {
		System.out.println("-------------hello---------");
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
