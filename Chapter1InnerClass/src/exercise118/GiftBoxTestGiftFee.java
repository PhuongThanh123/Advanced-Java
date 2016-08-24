package exercise118;

import static org.junit.Assert.*;

import org.junit.Test;

/** Author: Le Phuong Thanh
* Date: 19/08/2016
* Version: 1.0
* Description: Unit Test for handling of Gift Box Test Calculate Gift Fee
*/
public class GiftBoxTestGiftFee {

	GiftBox giftBox=new GiftBox();
	GiftBox.Gift gift;
	@Test
	public void testCalFee1() {
		double ex=10300;
		gift=giftBox.new  Gift("Candy", 1.5);
		double ac=gift.calFee();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testCalFee2() {
		double ex=30000;
		gift=giftBox.new  Gift("Candy", 100);
		double ac=gift.calFee();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testCalFee3() {
		double ex=10100;
		gift=giftBox.new  Gift("Candy", 0.5);
		double ac=gift.calFee();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testCalFee4() {
		double ex=15020;
		gift=giftBox.new  Gift("Candy", 25.1);
		double ac=gift.calFee();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testCalFee5() {
		double ex=10030;
		gift=giftBox.new  Gift("Candy", 0.15);
		double ac=gift.calFee();
		assertEquals(ex, ac,0.01);
	}
	@Test
	public void testCalFee6() {
		double ex=10300;
		gift=giftBox.new  Gift("Candy", 12);
		double ac=gift.calFee();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testCalFee7() {
		double ex=100;
		gift=giftBox.new  Gift("Candy", 1);
		double ac=gift.calFee();
		assertNotEquals(ex, ac,0.01);
	}
	@Test
	public void testCalFee8() {
		double ex=300;
		gift=giftBox.new  Gift("Candy", 4);
		double ac=gift.calFee();
		assertNotEquals(ex, ac,0.01);
	}
	
	@Test
	public void testCalFee9() {
		double ex=3;
		gift=giftBox.new  Gift("Candy", 6);
		double ac=gift.calFee();
		assertNotEquals(ex, ac,0.01);
	}@Test
	public void testCalFee10() {
		double ex=10300;
		gift=giftBox.new  Gift("Candy", 1.123);
		double ac=gift.calFee();
		assertNotEquals(ex, ac,0.01);
	}

}
