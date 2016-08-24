package exerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise110.ManagementTeacherStudent;
import exercise110.Student;

/** Author: Le Phuong Thanh
* Date: 19/08/2016
* Version: 1.0
* Description: Unit Test for handling of ManagementDestopLatop Test Avg
*/
public class ManagementDestopLatopTestAvg {
ManagementTeacherStudent mdl;

Student student;
	@Test
	public void testavgMarkStudent1() {
		double ex= 10;
		
		student=new Student("Thanh", "15/02/1993", "Binh Tho", "01678327767", "GCS", 10, 10);
		double ac=mdl.avgMarkStudent();
		assertEquals(ex, ac,0.01);
		
	}

}
