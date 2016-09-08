package Exercise123ManagementStudent;

import java.util.TreeMap;
/**
 * @Author: Le Phuong Thanh 
 * @Date: 08/09/2016 
 * @Version: 1.0 
 * @Create Class management handling student
 *
 */
public class ManagmentStudent {
	Student student=new Student();
	private TreeMap<String, Student> treeMapStudent=new TreeMap<String, Student>();
	public TreeMap<String, Student> getTreeMapStudent() {
		return treeMapStudent;
	}
	public void setTreeMapStudent(TreeMap<String, Student> treeMapStudent) {
		this.treeMapStudent = treeMapStudent;
	}
	public ManagmentStudent(TreeMap<String, Student> treeMapStudent) {
		super();
		this.treeMapStudent = treeMapStudent;
	}
	public ManagmentStudent() {
		super();
	}
	public Student searchStrudent(String id){
		
		for (String key : treeMapStudent.keySet()) {
			if(key.equals(id)){
				return treeMapStudent.get(key);
			}
		}
		return null;
	}
	public void addStudent(String id, Student student){
		treeMapStudent.put(id, student);
	}
	public void deleteStudent(String id){
		treeMapStudent.remove(id);
	}
	
	@Override
	public String toString() {
		String s="--------------List Student-----------------\n";
		s+="ID\tName\tAge\tPlace Of Brithday\n";
		for (String key : treeMapStudent.keySet()){
			s+=treeMapStudent.get(key).toString()+"\t";
		}
		return s;
		
	}
	public int lenghtOfStudent() {
		return treeMapStudent.size();
	}
	

}
