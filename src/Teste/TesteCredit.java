package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Credit;
import clase.Depozit;

public class TesteCredit {

	@Test
	public void testValoareMare() {
		Credit c1 = new Credit(15,100000);
		assertTrue(c1.valoareMareCredit());
		Credit c2 = new Credit(15,5674);
		assertFalse(c2.valoareMareCredit());
	}
	
	@Test
	public void testCalculeazaDobanda() {
		Credit c1 = new Credit(15,10000);
		assertEquals(1500,c1.calculeazaDobanda());
	}
	
	@Test
	public void testValoareDobandaRight() {
		Credit credit = new Credit(15,10000);
		assertEquals(credit.calculeazaDobanda(),15*10000/100);
	}
	
	@Test
	public void testDobandaPlatitaCrossCheck() {
		Credit credit = new Credit(15,10000);
		assertEquals(credit.calculeazaDobanda()/10, 150, 0.5);
	}
	
	@Test
	public void testCostTotalCredit() {
		Credit credit = new Credit(15,10000);
		assertEquals(11500.00, credit.costTotalCredit(),0);
	}
	
	@Test
	public void testCostTotalCreditRight() {
		Credit credit = new Credit(15,10000);
		assertEquals(credit.costTotalCredit(),15*10000/100+10000,0);
	}
	
	@Test
	public void testCostTotalCreditCrossCheck() {
		Credit credit = new Credit(15,10000);
		assertEquals(credit.costTotalCredit()/10, 1150, 0.5);
	}
	
	@Test
	public void testVerificaDobanda() {
		Credit c1 = new Credit(15,10000);
		assertTrue(c1.verificaDobanda());
	}
	
	@Test
	public void testSumaCredite() {
		Credit c1 = new Credit(15,10000);
		assertEquals(3000, c1.sumaCredite(1000, 2000),0);
	}
	
	@Test
	public void testCopiazaCredit() {
		Credit c1 = new Credit(15,10000);
		Credit c2 = c1.copiazaCredit();
		assertSame(c1, c2);
	}
	
	@Test
	public void testCrediteValoareMare() {
		Credit c1 = new Credit(15,10000);
		assertTrue(c1.crediteValoareMare(6));
	}
	
	@Test
	public void testDobandaNula() {
		Credit c1 = new Credit(15,10000);
		assertFalse(c1.dobandaNula());
		Credit c2 = new Credit(0,10000);
		assertTrue(c2.dobandaNula());
	}
	
	

}
