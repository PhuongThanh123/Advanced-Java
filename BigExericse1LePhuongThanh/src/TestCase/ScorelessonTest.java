package TestCase;

import static org.junit.Assert.*;
import main.Scorelesson;

import org.junit.Test;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @Date 9/7/2016
 * @Desciption: Class test calculation score lesson of trainee
 *
 */
public class ScorelessonTest {
	Scorelesson sc;
	@Test
	public void testcalTotalScoreLesson1() {
		double ex=5;
		sc=new Scorelesson(5, 5, 5);
		double ac=sc.calTotalScoreLesson();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalTotalScoreLesson2() {
		double ex=8.5;
		sc=new Scorelesson(10, 10, 5);
		double ac=sc.calTotalScoreLesson();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalTotalScoreLesson3() {
		double ex=9.5;
		sc=new Scorelesson(5, 10, 10);
		double ac=sc.calTotalScoreLesson();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalTotalScoreLesson4() {
		double ex=5;
		sc=new Scorelesson(5, 5, 5);
		double ac=sc.calTotalScoreLesson();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalTotalScoreLesson5() {
		double ex=4.75;
		sc=new Scorelesson(2.5, 5, 5);
		double ac=sc.calTotalScoreLesson();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalTotalScoreLesson6() {
		double ex=5;
		sc=new Scorelesson(7.5, 0, 5);
		double ac=sc.calTotalScoreLesson();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalTotalScoreLesson7() {
		double ex=9;
		sc=new Scorelesson(5, 5, 5);
		double ac=sc.calTotalScoreLesson();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalTotalScoreLesson8() {
		double ex=5;
		sc=new Scorelesson(5, 5, 5);
		double ac=sc.calTotalScoreLesson();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testcalTotalScoreLesson9() {
		double ex=5;
		sc=new Scorelesson(0, 0, 0);
		double ac=sc.calTotalScoreLesson();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testcalTotalScoreLesson10() {
		double ex=5;
		sc=new Scorelesson(5, 8.5, 5);
		double ac=sc.calTotalScoreLesson();
		assertNotEquals(ex, ac,0.01);
	}

}
