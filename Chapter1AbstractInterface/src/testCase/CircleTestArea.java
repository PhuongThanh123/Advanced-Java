package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise114.Circle;
/** Author: Le Phuong Thanh
* Date: 23/08/2016
* Version: 1.0
* Unit Test for handling of Circle Test Area
*/
public class CircleTestArea {
	Circle circle;
	@Test
	public void testArea1() {
		double ex=12.566370614359172;
		circle=new Circle(2);
		double ac=circle.area();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea2() {
		double ex=1256.6370614359173;
		circle=new Circle(20);
		double ac=circle.area();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea3() {
		double ex=0.031415926535897934;
		circle=new Circle(0.1);
		double ac=circle.area();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea4() {
		double ex=2827.4333882308138;
		circle=new Circle(30);
		double ac=circle.area();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea5() {
		double ex=530.929158456675;
		circle=new Circle(13);
		double ac=circle.area();
		assertEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea6() {
		double ex=1256.6370614359173;
		circle=new Circle(220);
		double ac=circle.area();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea7() {
		double ex=0.6370614359173;
		circle=new Circle(0.1);
		double ac=circle.area();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea8() {
		double ex=56.6370614359173;
		circle=new Circle(32);
		double ac=circle.area();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea9() {
		double ex=1256.6370614359173;
		circle=new Circle(240);
		double ac=circle.area();
		assertNotEquals(ex, ac, 0.01);
	}
	@Test
	public void testArea10() {
		double ex=1256.6370614359173;
		circle=new Circle(365);
		double ac=circle.area();
		assertNotEquals(ex, ac, 0.01);
	}
	
}
