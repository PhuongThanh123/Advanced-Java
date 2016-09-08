package TestCase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Exercise121ManagementCD.ArrayCD;
import Exercise121ManagementCD.CD;

/**
 * @Author: Le Phuong Thanh
 * @Date: 07/09/2016
 * @Version: 1.0
 * @Unit Test for handling of CD Test Calculation Total Price
 */
public class ArrayCDTest {
	private ArrayList<CD> arrayCD=new ArrayList<CD>();
	private ArrayCD arrayCD1=new ArrayCD();
	@Test
	public void testCalTotalPrice1() {
		double ex=12;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testCalTotalPrice2() {
		double ex=1016;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 10));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 1000));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertEquals(ex, ac,0.01);
	}

	@Test
	public void testCalTotalPrice3() {
		double ex=9;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertEquals(ex, ac,0.01);
	}

	@Test
	public void testCalTotalPrice4() {
		double ex=6;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertEquals(ex, ac,0.01);
	}

	@Test
	public void testCalTotalPrice5() {
		double ex=18;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertEquals(ex, ac,0.01);
	}

	@Test
	public void testCalTotalPrice6() {
		double ex=12;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertNotEquals(ex, ac,0.01);
	}

	@Test
	public void testCalTotalPrice7() {
		double ex=12;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 10000));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertNotEquals(ex, ac,0.01);
	}

	@Test
	public void testCalTotalPrice8() {
		double ex=12;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 0));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertNotEquals(ex, ac,0.01);
	}

	@Test
	public void testCalTotalPrice9() {
		double ex=1;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 6));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertNotEquals(ex, ac,0.01);
	}

	@Test
	public void testCalTotalPrice10() {
		double ex=13432;
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3436));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 33));
		arrayCD.add(new CD("123", "Ha Noi", "Phuong Thanh", 10, 3));
		arrayCD1.setArrayCD(arrayCD);
		double ac=arrayCD1.calTotalPrice();
		assertNotEquals(ex, ac,0.01);
	}


}
