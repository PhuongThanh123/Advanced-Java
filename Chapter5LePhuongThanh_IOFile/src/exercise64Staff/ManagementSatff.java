package exercise64Staff;

import java.util.ArrayList;
import java.util.List;



public class ManagementSatff {
	Employee employee=new Employee();
	List<Employee> listEmployees=new ArrayList<Employee>();
	public ManagementSatff(List<Employee> listEmployees) {
		super();
		this.listEmployees = listEmployees;
	}
	public ManagementSatff() {
		super();
	}
	
	public List<Employee> getListEmployees() {
		return listEmployees;
	}
	public void setListEmployees(List<Employee> listEmployees) {
		this.listEmployees = listEmployees;
	}
	public void addEmployee() {
		listEmployees.add(employee);
		
	}
	@Override
	public String toString() {
		String s="==========List Emloyee=============";
		s+="Name \t Coefficients \t Allowance \t Number Person \t Salary";
		for (int i = 0; i < listEmployees.size(); i++) {
			s+=listEmployees.get(i).toString();
		}
		return s;
	}
	
	
}
