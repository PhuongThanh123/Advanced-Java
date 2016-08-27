package ExerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Exercise116.Exercise16Salary;

public class Exercise16SalaryTestSalary {
Exercise16Salary es;
	@Test
	public void testcalSalary1() {
		es=new Exercise16Salary(2.67, 12000000, 1);
		double ex=15364200;
		double ac=es.calSalary();
		assertEquals(ex,ac,0.01);
	}
	@Test
	public void testcalSalary2() {
		es=new Exercise16Salary(5, 15000000, 2);
		double ex=21300000;
		double ac=es.calSalary();
		assertEquals(ex,ac,0.01);
	}
	@Test
	public void testcalSalary3() {
		es=new Exercise16Salary(7, 20000000, 2);
		double ex=28820000;
		double ac=es.calSalary();
		assertEquals(ex,ac,0.01);
	}
	@Test
	public void testcalSalary4() {
		es=new Exercise16Salary(8, 30000000, 1);
		double ex=40080000;
		double ac=es.calSalary();
		assertEquals(ex,ac,0.01);
	}
	@Test
	public void testcalSalary5() {
		es=new Exercise16Salary(7, 50000000, 2);
		double ex=58820000;
		double ac=es.calSalary();
		assertEquals(ex,ac,0.01);
	}
	@Test
	public void testcalSalary6() {
		es=new Exercise16Salary(2.7, 120540000, 1);
		double ex=13353500;
		double ac=es.calSalary();
		assertNotEquals(ex,ac,0.01);
	}
	@Test
	public void testcalSalary7() {
		es=new Exercise16Salary(0.7, 10000000, 3);
		double ex=155435400;
		double ac=es.calSalary();
		assertNotEquals(ex,ac,0.01);
	}
	@Test
	public void testcalSalary8() {
		es=new Exercise16Salary(2.67, 12600000, 5);
		double ex=15364200;
		double ac=es.calSalary();
		assertNotEquals(ex,ac,0.01);
	}
	@Test
	public void testcalSalary9() {
		es=new Exercise16Salary(2.8, 22000000, 1);
		double ex=16364200;
		double ac=es.calSalary();
		assertNotEquals(ex,ac,0.01);
	}
	@Test
	public void testcalSalary10() {
		es=new Exercise16Salary(0.67, 120000, 1);
		double ex=8064200;
		double ac=es.calSalary();
		assertNotEquals(ex,ac,0.01);
	}

}
