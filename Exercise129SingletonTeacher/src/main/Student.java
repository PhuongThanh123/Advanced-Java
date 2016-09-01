package main;


/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 01-Sep-2016 10:44:53 AM
 */
public class Student {

	public static void main(String[] agrs) {

		Teacher teacher = Teacher.getInstance();
		System.out.println(teacher.shareDocument());

	}

}