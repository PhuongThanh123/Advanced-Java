package exerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise18.Infantryman;
import exercise18.MainClass18TheFight;
import exercise18.Trooper;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Description: Unit Test for handling of MainClass18TheFightTest about CheckAttack 
 *
 */
public class MainClass18TheFightTestCheckAttack {
	Infantryman im;
	Trooper tr;
	@Test
	public void testcheckAttack1() {
		int ex=0;
		im=new Infantryman("thanh",12,"sung");
		tr=new Trooper("thuy",3,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertEquals(ex, ac);
	}
	@Test
	public void testcheckAttack2() {
		int ex=2;
		im=new Infantryman("thanh",12,"sung");
		tr=new Trooper("thuy",-3,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertEquals(ex, ac);
	}
	@Test
	public void testcheckAttack3() {
		int ex=1;
		im=new Infantryman("thanh",-12,"sung");
		tr=new Trooper("thuy",3,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertEquals(ex, ac);
	}
	@Test
	public void testcheckAttack4() {
		int ex=0;
		im=new Infantryman("thanh",12,"sung");
		tr=new Trooper("thuy",34,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertEquals(ex, ac);
	}
	@Test
	public void testcheckAttack5() {
		int ex=0;
		im=new Infantryman("thanh",12,"sung");
		tr=new Trooper("thuy",12,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertEquals(ex, ac);
	}
	@Test
	public void testcheckAttack6() {
		int ex=0;
		im=new Infantryman("thanh",-12,"sung");
		tr=new Trooper("thuy",3,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertNotEquals(ex, ac);
	}
	@Test
	public void testcheckAttack7() {
		int ex=2;
		im=new Infantryman("thanh",22,"sung");
		tr=new Trooper("thuy",3,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertNotEquals(ex, ac);
	}
	@Test
	public void testcheckAttack8() {
		int ex=1;
		im=new Infantryman("thanh",12,"sung");
		tr=new Trooper("thuy",3,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertNotEquals(ex, ac);
	}
	@Test
	public void testcheckAttack9() {
		int ex=0;
		im=new Infantryman("thanh",-1,"sung");
		tr=new Trooper("thuy",3,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertNotEquals(ex, ac);
	}
	@Test
	public void testcheckAttack10() {
		int ex=2;
		im=new Infantryman("thanh",12,"sung");
		tr=new Trooper("thuy",3,"min");
		int ac=MainClass18TheFight.checkAttack(im,tr);
		assertNotEquals(ex, ac);
	}

}
