package Exercise12Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise12.Exercise15Rectangle;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Unit Test for handling of MainClass15Rectangle about TestArea 
 *
 */
public class Exercise15RectangleTestArea {
Exercise15Rectangle exr;
	@Test
	public void testcalAreaRectangle1() {
		double ex=2;
		exr=new Exercise15Rectangle(2, 1);
		double ac =exr.calAreaRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalAreaRectangle2() {
		double ex=200;
		exr=new Exercise15Rectangle(20, 10);
		double ac =exr.calAreaRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalAreaRectangle3() {
		double ex=2;
		exr=new Exercise15Rectangle(2, 1);
		double ac =exr.calAreaRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalAreaRectangle4() {
		double ex=15129;
		exr=new Exercise15Rectangle(123, 123);
		double ac =exr.calAreaRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalAreaRectangle5() {
		double ex=1;
		exr=new Exercise15Rectangle(1, 1);
		double ac =exr.calAreaRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalAreaRectangle6() {
		double ex=223;
		exr=new Exercise15Rectangle(234, 1);
		double ac =exr.calAreaRectangle();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalAreaRectangle7() {
		double ex=4352;
		exr=new Exercise15Rectangle(232, 3341);
		double ac =exr.calAreaRectangle();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalAreaRectangle8() {
		double ex=0;
		exr=new Exercise15Rectangle(343, 1);
		double ac =exr.calAreaRectangle();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalAreaRectangle9() {
		double ex=3493058;
		exr=new Exercise15Rectangle(2434, 343535);
		double ac =exr.calAreaRectangle();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalAreaRectangle10() {
		double ex=2;
		exr=new Exercise15Rectangle(1, 1);
		double ac =exr.calAreaRectangle();
		assertNotEquals(ex, ac,0.01);
	}

}
