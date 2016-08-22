package exercise110;

import java.util.ArrayList;

public class ManagementTeacherStudent {
	private ArrayList<Teacher> arrayListTes;
	private ArrayList<Student> arrayListStu;
	
	
	
	public ArrayList<Teacher> getArrayListTes() {
		return arrayListTes;
	}
	public void setArrayListTes(ArrayList<Teacher> arrayListTes) {
		this.arrayListTes = arrayListTes;
	}
	public ArrayList<Student> getArrayListStu() {
		return arrayListStu;
	}
	public void setArrayListStu(ArrayList<Student> arrayListStu) {
		this.arrayListStu = arrayListStu;
	}
	public ManagementTeacherStudent(ArrayList<Teacher> arrayListTes,
			ArrayList<Student> arrayListStu) {
		super();
		this.arrayListTes = arrayListTes;
		this.arrayListStu = arrayListStu;
	}
	public ManagementTeacherStudent() {
		super();
	}
	/**
	 * Function calculation average mark I and mark II
	 * Output: return value average
	 * @return
	 */
	public double avgMarkStudent(){
		
		double average=0;
		for(int i=0;i<arrayListStu.size();i++){
			average=arrayListStu.get(i).getMarkI()+arrayListStu.get(i).getMarkII();
		}
		return average/2;
	}

}
