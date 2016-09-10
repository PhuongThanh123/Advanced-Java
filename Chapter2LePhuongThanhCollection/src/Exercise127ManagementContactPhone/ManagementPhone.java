package Exercise127ManagementContactPhone;

import java.util.ArrayList;
import java.util.List;

public class ManagementPhone {
	private List<Phone> listPhone = new ArrayList<Phone>();
	//private Phone phone = new Phone();

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
	 *            description: add new contact into Contact Phone
	 */
	public void addContac(Phone phone) {
		listPhone.add(phone);
	}

	public String searchContact(String name) {
		String s = "----------Result--------\n";
		if (lengthOfList() != 0) {
			for (int i = 0; i < listPhone.size(); i++) {
				if (listPhone.get(i).equals(name)) {
					s += listPhone.get(i).toString() + "\n";
				}
			}
			return s;

		}
		return null;

	}

	public String deleteContact(String name) {
		String s = "";
		if (searchContact(name) != null) {
			listPhone.remove(name);
			s += "Remove " + name + " successfully";
			System.out.println(toString());
		} else {
			s += "No " + name + " in Contact";
		}
		return s;

	}

	public int lengthOfList() {
		return listPhone.size();
	}

	@Override
	public String toString() {
		String s = "----------List Contact-----------\n";
		s += "Name\tNumberPhone\n";
		for (int i = 0; i < listPhone.size(); i++) {
			s += listPhone.get(i).toString() + "\n";
		}
		return s;
	}

}
