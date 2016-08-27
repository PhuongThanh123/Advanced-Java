package ExerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise114.Exercise14Circle;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Unit Test for handling of Exercise14Circle about TestArea 
 *
 */
public class Exercise14CircleTestArea {
	
	Exercise14Circle exc;
	@Test
	public void testcalcArea1() {
		double ex=314;
		exc=new Exercise14Circle(10);
		double ac=exc.calcArea();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcArea2() {
		double ex=3.14;
		exc=new Exercise14Circle(1);
		double ac=exc.calcArea();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcArea3() {
		double ex=28.26;
		exc=new Exercise14Circle(3);
		double ac=exc.calcArea();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcArea4() {
		double ex=31400;
		exc=new Exercise14Circle(100);
		double ac=exc.calcArea();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcArea5() {
		double ex=19.625;
		exc=new Exercise14Circle(2.5);
		double ac=exc.calcArea();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcArea6() {
		double ex=314;
		exc=new Exercise14Circle(1);
		double ac=exc.calcArea();
		assertNotEquals(ex, ac,0.01);
	}@Test
	public void testcalcArea7() {
		double ex=4;
		exc=new Exercise14Circle(100);
		double ac=exc.calcArea();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcArea8() {
		double ex=3;
		exc=new Exercise14Circle(1221);
		double ac=exc.calcArea();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcArea9() {
		double ex=31434;
		exc=new Exercise14Circle(154540);
		double ac=exc.calcArea();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcArea10() {
		double ex=9;
		exc=new Exercise14Circle(9);
		double ac=exc.calcArea();
		assertNotEquals(ex, ac,0.01);
	}

}
