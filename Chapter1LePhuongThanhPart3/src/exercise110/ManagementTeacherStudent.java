package exercise110;

import java.util.ArrayList;

/**
 * Author: Le Phuong Thanh 
 * Date: 19/08/2016 
 * Version: 1.0
 * Description: create class Management
 * Teacher and Student
 *
 */
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
	 * Function calculation average mark I and mark II Output: return value
	 * average
	 * 
	 * @return
	 */
	public double avgMarkStudent() {

		double average = 0;
		for (int i = 0; i < arrayListStu.size(); i++) {
			average = arrayListStu.get(i).getMarkI()
					+ arrayListStu.get(i).getMarkII();
		}
		return average / 2;
	}

	@Override
	public String toString() {
		String s = null;
		if (arrayListTes.size() != 0) {
			s = "---------------List Teacher------------\n";
			for (int i = 0; i < arrayListTes.size(); i++) {
				s += arrayListTes.get(i).toString();
			}
			s += "\n-------------------------------\n";
		}
		if (arrayListStu.size() != 0) {
			s = "---------------List Student---------------\n";

			for (int i = 0; i < arrayListStu.size(); i++) {
				s += arrayListStu.get(i).toString();
			}
			s += "\n-------------------------------\n";
			s+="Agv mark: "+avgMarkStudent();
		}
		
		return s;
	}

}
