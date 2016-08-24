package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise116.Car;
/** Author: Le Phuong Thanh
* Date: 23/08/2016
* Version: 1.0
* Unit Test for handling of Car Test Calculate Speed
*/
public class CarTestCalSpeed {
Car car;
	@Test
	public void testcalSpeed1() {
		double ex=1;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 1, 1, 0, "Core", "2016");
		double ac=car.calSpeed();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalSpeed2() {
		double ex=0;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 0, 0, 0, "Core", "2016");
		double ac=car.calSpeed();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalSpeed3() {
		double ex=3;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 6, 2, 0, "Core", "2016");
		double ac=car.calSpeed();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalSpeed4() {
		double ex=2.667;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 8, 3, 0, "Core", "2016");
		double ac=car.calSpeed();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalSpeed5() {
		double ex=3.33;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 10, 3, 0, "Core", "2016");
		double ac=car.calSpeed();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalSpeed6() {
		double ex=1;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 1,21, 0, "Core", "2016");
		double ac=car.calSpeed();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalSpeed7() {
		double ex=7.2;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 107, 1, 8, "Core", "2016");
		double ac=car.calSpeed();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalSpeed8() {
		double ex=1;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 1, 0, 1, "Core", "2016");
		double ac=car.calSpeed();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalSpeed9() {
		double ex=7;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 2, 1, 0, "Core", "2016");
		double ac=car.calSpeed();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalSpeed10() {
		double ex=0;
		car=new Car("Red", "BMW", "0001SA", "Phuong Thanh", 1, 1, 0, "Core", "2016");
		double ac=car.calSpeed();
		assertNotEquals(ex, ac,0.01);
	}

}
