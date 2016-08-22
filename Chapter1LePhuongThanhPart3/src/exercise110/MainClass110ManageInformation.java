package exercise110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass110ManageInformation {

	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		Teacher teacher=new Teacher();
		Student student=new Student();
		
		System.out.println("===========MANAGE INFORMATION===========");
		System.out.println("Enter Name: ");
		String name=input.readLine();
		
		System.out.println("Enter Birthday: ");
		String birthday=input.readLine();
		
		System.out.println("Enter Address: ");
		String address=input.readLine();
		
		System.out.println("Enter Phone: ");
		String phone=input.readLine();
		
		
		
		boolean flag=true;
		while(flag){
			
		}

	}
	public static void selectPerson() throws NumberFormatException, IOException{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Seclect Teacher or Student: \n1: Teacher \n2: Student");
		int number=Integer.parseInt(input.readLine());
		switch(number){
		case 1:
			System.out.println("-------ADD infor of Teacher--------");
			System.out.println("Enter Class Leader: ");
			String classLeader=input.readLine();
			
			System.out.println("Enter Coefficients Salary: ");
			double coefficientsSalary=Double.parseDouble(input.readLine());
			
			System.out.println("Enter Allowance: ");
			double allowance=Integer.parseInt(input.readLine());
			//add code
			break;
		case 2:
			System.out.println("-------ADD infor of Student--------");
			System.out.println("Enter Name Class: ");
			String nameClass=input.readLine();
			
			System.out.println("Entern MarkI: ");
			double markI=Integer.parseInt(input.readLine());
			
			System.out.println("Entern MarkII: ");
			double markII=Integer.parseInt(input.readLine());
		}
	}
	

}
