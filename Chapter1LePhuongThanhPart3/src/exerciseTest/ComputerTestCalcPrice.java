package exerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise19.Computer;

public class ComputerTestCalcPrice {
Computer computer;
	@Test
	public void testsumMoney1() {
		double ex=12300000*24;
		computer=new Computer("001", 12300000, "Sony", 24);
		double ac=computer.sumMoney();
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testsumMoney2() {
		double ex=1300000*5;
		computer=new Computer("002", 13000000, "Samsung", 5);
		double ac=computer.sumMoney();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testsumMoney3() {
		double ex=10000000;
		computer=new Computer("003", 5000000, "Asus", 2);
		double ac=computer.sumMoney();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testsumMoney4() {
		double ex=8000000*4;
		computer=new Computer("004", 8000000, "Dell", 4);
		double ac=computer.sumMoney();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testsumMoney5() {
		double ex=3000000*12;
		computer=new Computer("005", 3000000, "Lenovo", 12);
		double ac=computer.sumMoney();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testsumMoney6() {
		double ex=123*24;
		computer=new Computer("006", 123, "acer", 240);
		double ac=computer.sumMoney();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testsumMoney7() {
		double ex=13000000*5;
		computer=new Computer("007", 18000000, "Toshiba", 5);
		double ac=computer.sumMoney();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testsumMoney8() {
		double ex=123000000*4;
		computer=new Computer("008", 17000000, "Sony", 4);
		double ac=computer.sumMoney();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testsumMoney9() {
		double ex=3000000*24;
		computer=new Computer("001", 3500000, "Sony", 24);
		double ac=computer.sumMoney();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testsumMoney10() {
		double ex=12000000*99;
		computer=new Computer("010", 11000000, "Sony", 100);
		double ac=computer.sumMoney();
		assertNotEquals(ex, ac,0.01);
	}

}
