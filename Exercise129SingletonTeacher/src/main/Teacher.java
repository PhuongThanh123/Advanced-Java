package main;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 01-Sep-2016 10:44:52 AM
 */
public class Teacher {

	private static Teacher teacher = new Teacher();

	private Teacher() {

	}

	public static Teacher getInstance() {
		return teacher;
	}

	public String shareDocument() {
		return "Tài liệu tham khảo:\n-Chương 1\n-Chương 2\n-Chương 3\n-Chương 4\n...";
	}

}