package exercise63Student;

import java.text.DecimalFormat;

public class Student {
	private String name;
	private int grade;
	private double mark1;
	private double mark2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getMark1() {
		return mark1;
	}
	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}
	public double getMark2() {
		return mark2;
	}
	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	public Student(String name, int grade, double mark1, double mark2) {
		super();
		this.name = name;
		this.grade = grade;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	public Student() {
		super();
	}
	DecimalFormat decimalFormat=new DecimalFormat("#.00");
	public double avgAllYear(){
		return Double.parseDouble(decimalFormat.format((mark1+mark2*2)/3));
	}
	
	public int gradedStudent(){
		if(avgAllYear()>=0){
			return 1;
		}else if(avgAllYear()<8 && avgAllYear()>=7){
			return 2;
		}else if(avgAllYear()<7 && avgAllYear()>=6){
			return 3;
		}
		return 4;
	}
	
	@Override
	public String toString() {
		return name+"\t"+grade+"\t"+mark1+"\t"+mark2+"\t"+avgAllYear();
	}
	

}
