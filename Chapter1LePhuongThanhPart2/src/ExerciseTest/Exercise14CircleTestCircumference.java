package ExerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise.Exercise14Circle;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Unit Test for handling of Exercise14CircleTest about Circumference 
 *
 */
public class Exercise14CircleTestCircumference {
Exercise14Circle exc;

	@Test
	public void testcalcCircumference1() {
		double ex=75.36;
		exc=new Exercise14Circle(12);
		double ac=exc.calcCircumference();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcCircumference2() {
		double ex=125.6;
		exc=new Exercise14Circle(20);
		double ac=exc.calcCircumference();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcCircumference3() {
		double ex=219.8;
		exc=new Exercise14Circle(35);
		double ac=exc.calcCircumference();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcCircumference4() {
		double ex=157;
		exc=new Exercise14Circle(25);
		double ac=exc.calcCircumference();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcCircumference5() {
		double ex=314;
		exc=new Exercise14Circle(50);
		double ac=exc.calcCircumference();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcCircumference6() {
		double ex=314;
		exc=new Exercise14Circle(12);
		double ac=exc.calcCircumference();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcCircumference7() {
		double ex=5454;
		exc=new Exercise14Circle(1435);
		double ac=exc.calcCircumference();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcCircumference8() {
		double ex=736;
		exc=new Exercise14Circle(1);
		double ac=exc.calcCircumference();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcCircumference9() {
		double ex=4545;
		exc=new Exercise14Circle(12);
		double ac=exc.calcCircumference();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalcCircumference10() {
		double ex=75.36;
		exc=new Exercise14Circle(142);
		double ac=exc.calcCircumference();
		assertNotEquals(ex, ac,0.01);
	}

}
