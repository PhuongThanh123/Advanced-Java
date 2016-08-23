package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise114.Square;
/** Author: Le Phuong Thanh
* Date: 23/08/2016
* Version: 1.0
* Unit Test for handling of Square Test Perimeter
*/public class SquareTestPerimeter {
Square square;
	@Test
	public void testPerimeter1() {
		double ex=16;
		square=new Square(4);
		double ac=square.perimeter();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPerimeter2() {
		double ex=20;
		square=new Square(5);
		double ac=square.perimeter();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPerimeter3() {
		double ex=36;
		square=new Square(9);
		double ac=square.perimeter();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPerimeter4() {
		double ex=28;
		square=new Square(7);
		double ac=square.perimeter();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPerimeter5() {
		double ex=4;
		square=new Square(1);
		double ac=square.perimeter();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testPerimeter6() {
		double ex=15;
		square=new Square(4);
		double ac=square.perimeter();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testPerimeter7() {
		double ex=225;
		square=new Square(12);
		double ac=square.perimeter();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testPerimeter8() {
		double ex=9;
		square=new Square(2);
		double ac=square.perimeter();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testPerimeter9() {
		double ex=4343;
		square=new Square(53);
		double ac=square.perimeter();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testPerimeter10() {
		double ex=21;
		square=new Square(6);
		double ac=square.perimeter();
		assertNotEquals(ex, ac,0.01);
	}
	

}
