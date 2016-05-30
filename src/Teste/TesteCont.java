package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Cont;

public class TesteCont {

	@Test
	public void testContGol() {
		Cont c1=new Cont(500, "22.05.2015");
		assertFalse(c1.contGol());
	}
	
	@Test(timeout=10)
	public void testContGolTimeout() {
		Cont c1=new Cont(500, "22.05.2015");
		assertFalse(c1.contGol());
	}
	
	@Test
	public void testSoldPozitiv() {
		Cont c2=new Cont(-5, "12.08.2015");
		assertFalse(c2.soldPozititv());
	}

}
