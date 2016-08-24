package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise116.Ship;

/**
 * Author: Le Phuong Thanh 
 * Date: 23/08/2016 Version: 1.0 
 * Description: Unit Test
 * for handling of Ship Test Calculate Using Fuel
 */
public class ShipTestCalUsingFuel {
	Ship ship;

	@Test
	public void testcalUsingFuel1() {
		double ex = 2.85;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 100, 2, 345,
				480, 310, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}
		
	@Test
	public void testcalUsingFuel2() {
		double ex = 1.48;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 200, 2, 445,
				480, 310, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFuel3() {
		double ex = 28.57;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 1000, 2, 345,
				480, 310, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFuel4() {
		double ex = 9.97;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 349, 2, 345,
				1000, 310, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFuel5() {
		double ex = 2.85;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 700, 2, 345,
				300, 100, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFuel6() {
		double ex = 2.85;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 12320, 2, 345,
				480, 310, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFuel7() {
		double ex = 4.56;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 50, 2, 345, 4,
				1, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFuel8() {
		double ex = 9.32;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 100, 2, 345,
				480, 310, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFuel9() {
		double ex = 4.75;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 100, 2, 345,
				480, 310, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFuel10() {
		double ex = 2.85;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 34340, 2, 345,
				7680, 310, 243, 34, "E95", 8);
		double ac = ship.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

}
