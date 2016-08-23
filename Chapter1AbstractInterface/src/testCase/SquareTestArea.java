package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise114.Square;
/** Author: Le Phuong Thanh
* Date: 23/08/2016
* Version: 1.0
* Unit Test for handling of Square Test Area
*/
public class SquareTestArea {

	Square square;
	@Test
	public void testArea1() {
		double ex=16;
		square=new Square(4);
		double ac=square.area();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testArea2() {
		double ex=25;
		square=new Square(5);
		double ac=square.area();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testArea3() {
		double ex=49;
		square=new Square(7);
		double ac=square.area();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testArea4() {
		double ex=10000;
		square=new Square(100);
		double ac=square.area();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testArea5() {
		double ex=81;
		square=new Square(9);
		double ac=square.area();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testArea6() {
		double ex=13246;
		square=new Square(41);
		double ac=square.area();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testArea7() {
		double ex=61;
		square=new Square(8);
		double ac=square.area();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testArea8() {
		double ex=898797;
		square=new Square(67);
		double ac=square.area();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testArea9() {
		double ex=2;
		square=new Square(1);
		double ac=square.area();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testArea10() {
		double ex=48;
		square=new Square(7);
		double ac=square.area();
		assertNotEquals(ex, ac,0.01);
	}

}
