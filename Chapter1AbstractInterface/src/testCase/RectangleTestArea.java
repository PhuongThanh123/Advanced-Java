package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise114.Rectangle;
/** Author: Le Phuong Thanh
* Date: 23/08/2016
* Version: 1.0
* Unit Test for handling of Rectangle Test Area
*/
public class RectangleTestArea {

	Rectangle rectangle;
	@Test
	public void testArea1() {
		double ex=6;
		rectangle=new Rectangle(2, 3);
		double ac=rectangle.area();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea2() {
		double ex=600;
		rectangle=new Rectangle(20, 30);
		double ac=rectangle.area();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea3() {
		double ex=30;
		rectangle=new Rectangle(10, 3);
		double ac=rectangle.area();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea4() {
		double ex=1;
		rectangle=new Rectangle(1, 1);
		double ac=rectangle.area();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea5() {
		double ex=27;
		rectangle=new Rectangle(9, 3);
		double ac=rectangle.area();
		assertEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea6() {
		double ex=6;
		rectangle=new Rectangle(1, 3);
		double ac=rectangle.area();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea7() {
		double ex=5454;
		rectangle=new Rectangle(9087, 3);
		double ac=rectangle.area();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea8() {
		double ex=2;
		rectangle=new Rectangle(2, 3);
		double ac=rectangle.area();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea9() {
		double ex=63423;
		rectangle=new Rectangle(32, 334);
		double ac=rectangle.area();
		assertNotEquals(ex, ac, 0.01);
	}

	@Test
	public void testArea10() {
		double ex=4326;
		rectangle=new Rectangle(23, 33);
		double ac=rectangle.area();
		assertNotEquals(ex, ac, 0.01);
	}
}
