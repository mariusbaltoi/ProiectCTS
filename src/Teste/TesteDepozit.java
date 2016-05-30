package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Credit;
import clase.Depozit;

public class TesteDepozit {

	@Test
	public void testVenitDepozit() {
		Depozit depozit = new Depozit(5, 10000, "26.06.2016");
		assertEquals(500, depozit.venitDepozit());
	}
	
	@Test(timeout=100)
	public void testVenitDepozitTimeout() {
		Depozit depozit = new Depozit(5, 10000, "26.06.2016");
		assertEquals(500, depozit.venitDepozit());
	}
	
	@Test
	public void testVenitRight() {
		Depozit depozit = new Depozit(5, 10000, "26.06.2016");
		assertEquals(depozit.venitDepozit(),5*10000/100);
	}
	
	@Test
	public void testVenitCrossCheck() {
		Depozit depozit = new Depozit(5, 10000, "26.06.2016");
		assertEquals(depozit.venitDepozit()*20, 10000, 0.5);
	}
	
	///////////////////////////////////////////////////////////////////
	@Test
	public void testSumaPrimitaDepozit() {
		Depozit depozit1 = new Depozit(7, 10000, "13.03.2017");
		assertEquals(10700, depozit1.sumaPrimita());
	}
	
//	@Test(timeout=100)
//	public void testSumaPrimitaTimeout() {
//		Depozit depozit = new Depozit(7, 10000, "13.03.2017");
//		assertEquals(10700, depozit.sumaPrimita());
//	}
	
	@Test
	public void testSumaPrimitaRight() {
		Depozit depozit = new Depozit(7, 10000, "13.03.2017");
		assertEquals(depozit.sumaPrimita(),7*10000/100+10000);
	}
	
	@Test
	public void testSumaPrimitaCrossCheck() {
		Depozit depozit = new Depozit(5, 10000, "13.03.2017");
		assertEquals(depozit.sumaPrimita(), 10500, 0.5);
		assertNotEquals(depozit.sumaPrimita(), 10700, 0.5);
	}
	
	@Test
	public void testSumaDepozite() {
		Depozit d1 = new Depozit(5, 10000, "13.03.2017");
		assertEquals(5000,d1.sumaDepozite(3000, 2000),0);
	}
	
	@Test
	public void testCopiazaDepozit() {
		Depozit d1 = new Depozit(5, 10000, "13.03.2017");
		Depozit d2 = d1.copiazaDepozit();
		assertSame(d1, d2);
	}
	


}
