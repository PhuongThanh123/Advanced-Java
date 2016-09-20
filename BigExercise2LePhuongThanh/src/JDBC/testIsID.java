package JDBC;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class testIsID {
	CDController cdcl=new CDController();
	
	@Test
	public void testIsID1() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(1);
		assertTrue(ac);
		
	}

	@Test
	public void testIsID2() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(2);
		assertTrue(ac);
		
	}
	@Test
	public void testIsID3() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(3);
		assertTrue(ac);
		
	}
	@Test
	public void testIsID4() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(4);
		assertTrue(ac);
		
	}
	@Test
	public void testIsID5() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(5);
		assertTrue(ac);
		
	}
	@Test
	public void testIsID6() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(60);
		assertFalse(ac);
		
	}
	@Test
	public void testIsID17() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(70);
		assertFalse(ac);
		
	}
	@Test
	public void testIsID8() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(80);
		assertFalse(ac);
		
	}
	@Test
	public void testIsID9() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(90);
		assertFalse(ac);
		
	}
	@Test
	public void testIsID10() throws ClassNotFoundException, SQLException {
		boolean ac=cdcl.isId(100);
		assertFalse(ac);
		
	}
}
