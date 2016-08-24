package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise116.Car;

/**
 * Author: Le Phuong Thanh 
 * Date: 23/08/2016 Version: 1.0 
 * Description: Unit Test
 * for handling of Car Test Calculate Using speed
 */
public class CarTestUsingFuel {
	Car car;

	@Test
	public void testcalUsingFuel() {
		double ex = 1;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 1, 1, 1, "Core",
				"2016");
		double ac = car.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFue2() {
		double ex = 0.143;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 1, 0, 7, "Core",
				"2016");
		double ac = car.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFue3() {
		double ex = 2;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 6, 2, 3, "Core",
				"2016");
		double ac = car.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFue4() {
		double ex = 2.556;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 23, 3, 9, "Core",
				"2016");
		double ac = car.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFue5() {
		double ex = 2;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 10, 3, 5, "Core",
				"2016");
		double ac = car.calUsingFuel();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFue6() {
		double ex = 145;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 1, 1, 1, "Core",
				"2016");
		double ac = car.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFue7() {
		double ex = 14;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 0, 1, 1, "Core",
				"2016");
		double ac = car.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFue8() {
		double ex = 3;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 1, 0, 0, "Core",
				"2016");
		double ac = car.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFue9() {
		double ex = 9;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 1, 1, 1, "Core",
				"2016");
		double ac = car.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testcalUsingFue10() {
		double ex = 0;
		car = new Car("Red", "BMW", "0001SA", "Phuong Thanh", 13, 13, 12,
				"Core", "2016");
		double ac = car.calUsingFuel();
		assertNotEquals(ex, ac, 0.01);
	}

}
