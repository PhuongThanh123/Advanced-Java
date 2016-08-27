package ExerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise.Calculate13DistancePoint;
import Exercise.Exercise13Point;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Unit Test for handling of Calculate13DistancePointTest 
 *
 */
public class Calculate13DistancePointTest {
	Calculate13DistancePoint cdp;
	Exercise13Point pointA;
	Exercise13Point pointB;
	@Test
	public void testcalDistance1() {
		pointA=new Exercise13Point(1, 1);
		pointB=new Exercise13Point(1, 1);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=0;
		double ac=cdp.calDistance();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalDistance2() {
		pointA=new Exercise13Point(0, 0);
		pointB=new Exercise13Point(1, 1);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=1.4142135623730951;
		double ac=cdp.calDistance();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalDistance3() {
		pointA=new Exercise13Point(0, 0);
		pointB=new Exercise13Point(0, 1);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=1;
		double ac=cdp.calDistance();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalDistance4() {
		pointA=new Exercise13Point(0, 0);
		pointB=new Exercise13Point(-1, 1);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=1.4142135623730951;
		double ac=cdp.calDistance();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalDistance5() {
		pointA=new Exercise13Point(1, 0);
		pointB=new Exercise13Point(1, 1);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=1;
		double ac=cdp.calDistance();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalDistance6() {
		pointA=new Exercise13Point(1, 0);
		pointB=new Exercise13Point(1, 1);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=1.5634;
		double ac=cdp.calDistance();
		assertNotEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalDistance7() {
		pointA=new Exercise13Point(45, 0);
		pointB=new Exercise13Point(1, 1);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=13;
		double ac=cdp.calDistance();
		assertNotEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalDistance8() {
		pointA=new Exercise13Point(1, 2);
		pointB=new Exercise13Point(35, 1);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=-31;
		double ac=cdp.calDistance();
		assertNotEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalDistance9() {
		pointA=new Exercise13Point(0, 0);
		pointB=new Exercise13Point(11, 11);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=-1;
		double ac=cdp.calDistance();
		assertNotEquals(ex, ac,0.01);
	}
	
	@Test
	public void testcalDistance10() {
		pointA=new Exercise13Point(-32, 34);
		pointB=new Exercise13Point(11, 11);
		cdp=new Calculate13DistancePoint(pointA,pointB);
		double ex=0;
		double ac=cdp.calDistance();
		assertNotEquals(ex, ac,0.01);
	}
	
	

}
