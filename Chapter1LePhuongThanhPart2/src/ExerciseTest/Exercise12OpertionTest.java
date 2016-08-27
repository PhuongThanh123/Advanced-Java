package ExerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise112.Exercise12Opertion;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Unit Test for handling of Exercise12Opertion 
 *
 */
public class Exercise12OpertionTest {
Exercise12Opertion eop;

	/**
	 * function test add two number
	 */
	@Test
	public void testgetAdd1() {
		eop=new Exercise12Opertion(0, 0);
		double ex=0;
		double ac=eop.getAdd();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetAdd2() {
		eop=new Exercise12Opertion(123, 1);
		double ex=124;
		double ac=eop.getAdd();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetAdd3() {
		eop=new Exercise12Opertion(10, 0);
		double ex=10;
		double ac=eop.getAdd();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetAdd4() {
		eop=new Exercise12Opertion(0, 10);
		double ex=10;
		double ac=eop.getAdd();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetAdd5() {
		eop=new Exercise12Opertion(7, 7.1);
		double ex=14.1;
		double ac=eop.getAdd();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetAdd6() {
		eop=new Exercise12Opertion(0, 0);
		double ex=2;
		double ac=eop.getAdd();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetAdd7() {
		eop=new Exercise12Opertion(1, 0);
		double ex=2;
		double ac=eop.getAdd();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetAdd8() {
		eop=new Exercise12Opertion(20000, 0);
		double ex=2000;
		double ac=eop.getAdd();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetAdd9() {
		eop=new Exercise12Opertion(-1000, -1000);
		double ex=2000;
		double ac=eop.getAdd();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetAdd10() {
		eop=new Exercise12Opertion(78, 2);
		double ex=1000;
		double ac=eop.getAdd();
		assertNotEquals(ex, ac,0.01);
	}
	/**
	 * function test sub two number
	 */
	@Test
	public void testgetSub1() {
		eop=new Exercise12Opertion(78, 2);
		double ex=76;
		double ac=eop.getSub();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetSub2() {
		eop=new Exercise12Opertion(10000, 10);
		double ex=9990;
		double ac=eop.getSub();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetSub3() {
		eop=new Exercise12Opertion(100, 110);
		double ex=-10;
		double ac=eop.getSub();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetSub4() {
		eop=new Exercise12Opertion(-23, -2);
		double ex=-21;
		double ac=eop.getSub();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetSub5() {
		eop=new Exercise12Opertion(0, 0);
		double ex=0;
		double ac=eop.getSub();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetSub6() {
		eop=new Exercise12Opertion(78, 2);
		double ex=1000;
		double ac=eop.getSub();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetSub7() {
		eop=new Exercise12Opertion(100, 2);
		double ex=-98;
		double ac=eop.getSub();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetSub8() {
		eop=new Exercise12Opertion(-1000, -1000);
		double ex=-2000;
		double ac=eop.getSub();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetSub9() {
		eop=new Exercise12Opertion(50, 10000);
		double ex=-1000;
		double ac=eop.getSub();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetSub10() {
		eop=new Exercise12Opertion(0, 0);
		double ex=1;
		double ac=eop.getSub();
		assertNotEquals(ex, ac,0.01);
	}
	/**
	 * function test multi two number
	 */
	@Test
	public void testgetMulti1() {
		eop=new Exercise12Opertion(0, 0);
		double ex=0;
		double ac=eop.getMulti();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetMulti2() {
		eop=new Exercise12Opertion(0, 100000);
		double ex=0;
		double ac=eop.getMulti();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetMulti3() {
		eop=new Exercise12Opertion(59890844, 0);
		double ex=0;
		double ac=eop.getMulti();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetMulti4() {
		eop=new Exercise12Opertion(1234, 1234);
		double ex=1522756;
		double ac=eop.getMulti();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetMulti5() {
		eop=new Exercise12Opertion(-1, 0);
		double ex=0;
		double ac=eop.getMulti();
		assertEquals(ex, ac,0.01);
	}
	
	@Test
	public void testgetMulti6() {
		eop=new Exercise12Opertion(0, 0);
		double ex=10000;
		double ac=eop.getMulti();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetMulti7() {
		eop=new Exercise12Opertion(1234, 1234);
		double ex=1334;
		double ac=eop.getMulti();
		assertNotEquals(ex, ac,0.01);
	}@Test
	public void testgetMulti8() {
		eop=new Exercise12Opertion(-123, 0);
		double ex=123;
		double ac=eop.getMulti();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetMulti9() {
		eop=new Exercise12Opertion(-1, -1);
		double ex=-1;
		double ac=eop.getMulti();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetMulti10() {
		eop=new Exercise12Opertion(12, 0);
		double ex=12;
		double ac=eop.getMulti();
		assertNotEquals(ex, ac,0.01);
	}
	/**
	 * function test divide two number
	 */
	@Test
	public void testgetDiv1() {
		eop=new Exercise12Opertion(12, 12);
		double ex=1;
		double ac=eop.getDiv();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetDiv2() {
		eop=new Exercise12Opertion(-12, 12);
		double ex=-1;
		double ac=eop.getDiv();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetDiv3() {
		eop=new Exercise12Opertion(-1, -1);
		double ex=1;
		double ac=eop.getDiv();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetDiv4() {
		eop=new Exercise12Opertion(0, 12);
		double ex=0;
		double ac=eop.getDiv();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetDiv5() {
		eop=new Exercise12Opertion(10000, 10);
		double ex=1000;
		double ac=eop.getDiv();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testgetDiv6() {
		eop=new Exercise12Opertion(12, 12);
		double ex=12;
		double ac=eop.getDiv();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetDiv7() {
		eop=new Exercise12Opertion(1200, 12);
		double ex=-100;
		double ac=eop.getDiv();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetDiv8() {
		eop=new Exercise12Opertion(-1234, -1234);
		double ex=-1;
		double ac=eop.getDiv();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetDiv9() {
		eop=new Exercise12Opertion(0.1, 10);
		double ex=0.1;
		double ac=eop.getDiv();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testgetDiv10() {
		eop=new Exercise12Opertion(1, 1);
		double ex=2;
		double ac=eop.getDiv();
		assertNotEquals(ex, ac,0.01);
	}
}
