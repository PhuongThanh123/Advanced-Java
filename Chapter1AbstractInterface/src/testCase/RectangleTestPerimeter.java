package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise114.Rectangle;

public class RectangleTestPerimeter {
Rectangle rectangle;
	@Test
	public void testPerimeter1() {
		double ex=10;
		rectangle=new Rectangle(2, 3);
		double ac=rectangle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter2() {
		double ex=46;
		rectangle=new Rectangle(20, 3);
		double ac=rectangle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter3() {
		double ex=114;
		rectangle=new Rectangle(12, 45);
		double ac=rectangle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter4() {
		double ex=692;
		rectangle=new Rectangle(1, 345);
		double ac=rectangle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter5() {
		double ex=60040;
		rectangle=new Rectangle(20, 30000);
		double ac=rectangle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter6() {
		double ex=100;
		rectangle=new Rectangle(2, 3);
		double ac=rectangle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter7() {
		double ex=1335;
		rectangle=new Rectangle(1230, 23);
		double ac=rectangle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter8() {
		double ex=10;
		rectangle=new Rectangle(12, 3);
		double ac=rectangle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter9() {
		double ex=103;
		rectangle=new Rectangle(9, 3);
		double ac=rectangle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter10() {
		double ex=17;
		rectangle=new Rectangle(5, 3);
		double ac=rectangle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}

}
