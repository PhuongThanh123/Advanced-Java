package handlingStream;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import org.junit.Test;

/**
 * @author: Le Phuong Thanh
 * @version: 1.0
 * @Date: 19/09/2016
 * @Desciptione: Class Test Avgage Salary Employee
 */
public class TestAvgSalaryEmployee {
	
	static List<Emloyee> listEmloyee = new ArrayList<Emloyee>();
	DoubleSummaryStatistics statisticsEmloyee ;
	
	@Test
	public void testAvgSalaryEmployee1() {
		double ex =5171428.57;
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
		
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testAvgSalaryEmployee2() {
		double ex =5600000.0;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 8000000));
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
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testAvgSalaryEmployee3() {
		double ex =5171428.57;
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
		
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testAvgSalaryEmployee4() {
		double ex =6300000.0;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 9000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 3800000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 5000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 8000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 5000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 9000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testAvgSalaryEmployee5() {
		double ex =6921428.57;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 900000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 23000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 3800000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 5000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 7800000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 5000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 9000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testAvgSalaryEmployee6() {
		double ex =4900000;
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
		
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testAvgSalaryEmployee7() {
		double ex =5600000.0;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 8000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 2000000));
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
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testAvgSalaryEmployee8() {
		double ex =50000000;
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
		
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testAvgSalaryEmployee9() {
		double ex =6400000.0;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 9000000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 6000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 3800000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 5000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 8000000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 5000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 9000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testAvgSalaryEmployee10() {
		double ex =6921428.57;
		listEmloyee = new ArrayList<Emloyee>();
		listEmloyee.add(new Emloyee("Truong Ngoc Tinh Anh", 24, 900000));
		listEmloyee.add(new Emloyee("Truong Thi Thanh Thao", 23, 23000000));
		listEmloyee.add(new Emloyee("Bui Thi Thuy Quynh", 26, 7000000));
		listEmloyee.add(new Emloyee("Le Minh Tuan Hoa", 21, 300000));
		listEmloyee.add(new Emloyee("Phan Thi Kim Hien", 24, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Thi Lan Phuong", 28, 5000000));
		listEmloyee.add(new Emloyee("Le Anh Minh Nguyen", 29, 4000000));
		listEmloyee.add(new Emloyee("Nguyen Le Van Nhi", 20, 7800000));
		listEmloyee.add(new Emloyee("Tran Anh Ngoc Tu", 22, 5000000));
		listEmloyee.add(new Emloyee("Nguyen Ngoc Quoc Huy", 23, 6000000));
		listEmloyee.add(new Emloyee("Nguyen Tien Anh Minh", 21, 9000000));
		listEmloyee.add(new Emloyee("Nguyen Le Cong Danh", 24, 8000000));
		listEmloyee.add(new Emloyee("Nguyen Van Minh Minh", 24, 10000000));
		listEmloyee.add(new Emloyee("Le Thieng Bao Anh", 28, 3400000));
		
		statisticsEmloyee = listEmloyee.stream()
				.mapToDouble((e) -> e.getSalary()).summaryStatistics();
		
		double ac=MainClass.getSalaryAvg(listEmloyee, statisticsEmloyee);
		assertNotEquals(ex, ac,0.01);
	}

	
	
	



}
