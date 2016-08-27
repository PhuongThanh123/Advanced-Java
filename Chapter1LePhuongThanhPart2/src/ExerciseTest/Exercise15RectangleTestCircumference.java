package ExerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise.Exercise15Rectangle;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Unit Test for handling of Exercise15Rectangle Test Circumference
 */
public class Exercise15RectangleTestCircumference {

	Exercise15Rectangle exr;
	@Test
	public void calCircumferenceRectangle1() {
		double ex=6;
		exr=new Exercise15Rectangle(2, 1);
		double ac =exr.calCircumferenceRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void calCircumferenceRectangle2() {
		double ex=80;
		exr=new Exercise15Rectangle(20, 20);
		double ac =exr.calCircumferenceRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void calCircumferenceRectangle3() {
		double ex=4;
		exr=new Exercise15Rectangle(1, 1);
		double ac =exr.calCircumferenceRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void calCircumferenceRectangle4() {
		double ex=22;
		exr=new Exercise15Rectangle(10, 1);
		double ac =exr.calCircumferenceRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void calCircumferenceRectangle5() {
		double ex=428;
		exr=new Exercise15Rectangle(213, 1);
		double ac =exr.calCircumferenceRectangle();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void calCircumferenceRectangle6() {
		double ex=34356;
		exr=new Exercise15Rectangle(234, 134);
		double ac =exr.calCircumferenceRectangle();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void calCircumferenceRectangle7() {
		double ex=6;
		exr=new Exercise15Rectangle(2343, 34);
		double ac =exr.calCircumferenceRectangle();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void calCircumferenceRectangle8() {
		double ex=9;
		exr=new Exercise15Rectangle(2, 1);
		double ac =exr.calCircumferenceRectangle();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void calCircumferenceRectangle9() {
		double ex=100;
		exr=new Exercise15Rectangle(2, 98);
		double ac =exr.calCircumferenceRectangle();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void calCircumferenceRectangle10() {
		double ex=3435;
		exr=new Exercise15Rectangle(3434, 1);
		double ac =exr.calCircumferenceRectangle();
		assertNotEquals(ex, ac,0.01);
	}

}
