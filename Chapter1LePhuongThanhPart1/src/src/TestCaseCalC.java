package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseCalC {
	QuadraticEquation1 qt=new QuadraticEquation1();
	@Test
	public void testcalQEquation1() {
		double ex=0;
		double ac=qt.calQEquation(0,0);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalQEquation2() {
		double ex=-1;
		double ac=qt.calQEquation(1,2);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalQEquation3() {
		double ex=1;
		double ac=qt.calQEquation(1,2);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalQEquation4() {
		double ex=1;
		double ac=qt.calQEquation(1,2);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalQEquation5() {
		double ex=1;
		double ac=qt.calQEquation(1,2);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalQEquation6() {
		double ex=-3;
		double ac=qt.calQEquation(3,9);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalQEquation7() {
		double ex=-1;
		double ac=qt.calQEquation(0,3);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalQEquation8() {
		double ex=-2;
		double ac=qt.calQEquation(0,0);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalQEquation19() {
		double ex=-1;
		double ac=qt.calQEquation(2,2);
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalQEquation110() {
		double ex=-2;
		double ac=qt.calQEquation(1,2);
		assertEquals(ex, ac,0.01);
	}

}
