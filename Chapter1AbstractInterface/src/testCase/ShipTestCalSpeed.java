package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise116.Ship;

public class ShipTestCalSpeed {
	Ship ship;

	@Test
	public void testcalSpeed1() {
		double ex = 27;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 10, 2, 8, 380,
				230, 12, 34, "E95", 5);
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testcalSpeed2() {
		double ex = 14.333;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh",10, 3, 5, 380, 
				230, 1, 12, "E95", 3);
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testcalSpeed3() {
		double ex = 19.5;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh",17, 2, 5,380, 
				230, 12, 23, "E95", 4);
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testcalSpeed4() {
		double ex = 30.2;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh",6, 5, 5, 380, 
				230, 16, 45,"E95", 32);
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testcalSpeed5() {
		double ex = 0;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh",0, 0, 5,380, 
				230, 0, 0, "E95", 0);
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testcalSpeed6() {
		double ex = 8;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 10, 2, 8, 380,
				230, 12, 34, "E95", 5);
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testcalSpeed7() {
		double ex = 3427;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 10, 2, 8, 380,
				230, 12, 34, "E95", 5);
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testcalSpeed8() {
		double ex = 257;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 150, 2, 8, 9,
				230, 15, 34, "E95", 5);
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testcalSpeed9() {
		double ex = 27;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 10, 2, 8, 380,
				230, 142, 34, "E95", 5);
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testcalSpeed10() {
		double ex = 7;
		ship = new Ship("Red", "BMW", "001Si7", "PhuongThanh", 107, 2, 8, 0,
				230, 99, 34, "E95", 78);
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.01);
	}
	

}
