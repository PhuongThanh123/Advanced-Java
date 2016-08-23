package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise114.Circle;
/** Author: Le Phuong Thanh
* Date: 23/08/2016
* Version: 1.0
* Unit Test for handling of Circle Test Perimeter
*/
public class CircleTestPerimeter {
Circle circle;
	@Test
	public void testPerimeter() {
		double ex=12.566370614359172;
		circle=new Circle(2);
		double ac=circle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter1() {
		double ex=31.41592653589793;
		circle=new Circle(5);
		double ac=circle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter2() {
		double ex=62.83185307179586;
		circle=new Circle(10);
		double ac=circle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter3() {
		double ex=1256.6370614359173;
		circle=new Circle(200);
		double ac=circle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter4() {
		double ex=0.6283185307179586;
		circle=new Circle(0.1);
		double ac=circle.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter5() {
		double ex=12.43432432;
		circle=new Circle(234);
		double ac=circle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter6() {
		double ex=12.566370614359172;
		circle=new Circle(0.2);
		double ac=circle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter7() {
		double ex=145.14359172;
		circle=new Circle(30);
		double ac=circle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter8() {
		double ex=10.566370614359172;
		circle=new Circle(0.9);
		double ac=circle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testPerimeter9() {
		double ex=304823.566370614359172;
		circle=new Circle(89);
		double ac=circle.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}

}
