package handlingStream;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author: Le Phuong Thanh
 * @version: 1.0
 * @Date: 19/09/2016
 * @Desciptione: Class Test Count Salary > 30000000
 */
public class TestCountSalary30000000 {
	static List<Emloyee> listEmloyee = new ArrayList<Emloyee>();
	@Test
	public void test1CountSalary30000000() {
		long ex =11;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 2000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 3000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 5000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 2000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 5000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertEquals(ex, ac);
	}
	@Test
	public void test2CountSalary30000000() {
		long ex =10;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 1000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 3000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 2000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 5000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 2000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 5000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertEquals(ex, ac);
	}
	@Test
	public void test3CountSalary30000000() {
		long ex =7;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 1000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 3000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 2000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 2000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 3000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 2000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 1000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertEquals(ex, ac);
	}
	@Test
	public void test4CountSalary30000000() {
		long ex =8;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 1000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 4000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 2000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 2000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 3000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 2000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 1000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertEquals(ex, ac);
	}
	@Test
	public void test5CountSalary30000000() {
		long ex =10;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 7000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 4000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 2000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 2000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 3000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 8000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 1000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertEquals(ex, ac);
	}
	@Test
	public void test6CountSalary30000000() {
		long ex =15;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 7000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 4000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 2000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 2000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 3000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 8000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 1000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertNotEquals(ex, ac);
	}
	@Test
	public void test7CountSalary30000000() {
		long ex =10;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 3000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 4000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 2000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 2000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 3000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 8000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 1000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertNotEquals(ex, ac);
	}
	@Test
	public void test8CountSalary30000000() {
		long ex =0;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 7000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 4000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 2000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 2000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 3000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 8000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 1000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertNotEquals(ex, ac);
	}
	@Test
	public void test9CountSalary30000000() {
		long ex =3;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 7000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 4000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 2000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 2000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 3000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 8000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 1000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertNotEquals(ex, ac);
	}
	@Test
	public void test10CountSalary30000000() {
		long ex =9;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 7000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 4000000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 2000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 2000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 3000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 8000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 1000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 7000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		long ac=MainClass.countSalary3000000(listEmloyee);
		assertNotEquals(ex, ac);
	}
}
