package Exercise125ManagementStaff;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 08/09/2016 
 * @Version: 1.0 
 * @Create Class management Staff
 *
 */

public class ManagementStaff {
	private HashMap<String, Staff> hashMapStaff = new HashMap<String, Staff>();
	HashMap< String, Staff> hashMapSortStaff=new HashMap<String, Staff>();
	Staff staff = new Staff();

	public ManagementStaff() {
		super();
	}

	public ManagementStaff(HashMap<String, Staff> hashMapStaff) {
		super();
		this.hashMapStaff = hashMapStaff;
	}

	public HashMap<String, Staff> getHashMapStaff() {
		return hashMapStaff;
	}

	public void setHashMapStaff(HashMap<String, Staff> hashMapStaff) {
		this.hashMapStaff = hashMapStaff;
	}
	public void addStaff(String id, Staff staff){
		hashMapStaff.put(id, staff);
	}

	/**
	 * @param id
	 * @return Staff if search id of staff exit 
	 */
	public Staff searchStaff(String id) {

		if (hashMapStaff.containsKey(id)) {
			return hashMapStaff.get(id);
		}
		return null;
	}

	/**
	 * @param id
	 * remove staff
	 */
	public void deleteStaff(String id) {
		hashMapStaff.remove(id);
	}
	
	/**
	 * @return length of List Staff
	 */
	public int lengthOfListStaff(){
		return hashMapStaff.size();
	}
	private static HashMap<String, Staff> sortByValue(Map<String, Staff> map) { 
		// Convert Map to LinkedList
		List<Map.Entry<String, Staff>> list = new LinkedList<Map.Entry<String, Staff>>(map.entrySet());
		
		// Sort list by value of Map
		Collections.sort(list, new Comparator<Map.Entry<String, Staff>>() {
			public int compare(Map.Entry<String, Staff> o1, Map.Entry<String, Staff> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// Copy the sorted list in HashMap
		HashMap<String, Staff> sortedHashMap = new LinkedHashMap<String, Staff>();
		for (Map.Entry<String, Staff> entry : list) {
			sortedHashMap.put(entry.getKey(), entry.getValue());
		} 
		return sortedHashMap;
	}
	
	/**
	 * @param id
	 * @return value true of false. compare Id duplicate
	 */
	public boolean checkId(String id){
		if(hashMapStaff.containsKey(id)==true){
			return false;
		}
		return true;
		
	}
	
	
	@Override
	public String toString() {
		HashMap< String, Staff> hashMapSortStaff=new HashMap<String, Staff>();
		hashMapSortStaff=sortByValue(hashMapStaff);
		hashMapSortStaff=sortByValue(hashMapStaff);
		String s = "-----------List Staff----------------\n";
		s+="ID\tName\tAge\tSalary\n";
		
		for (String key : hashMapSortStaff.keySet()) {
			s += hashMapSortStaff.get(key).toString() + "\n";
		}
		return s;
	}

}
