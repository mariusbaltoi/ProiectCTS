package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Banca;

public class TesteBanca {

	@Test
	public void testMarimeBanca() {
		Banca b1 = new Banca(500);
		assertEquals("medie", b1.marimeBanca());
		Banca b2 = new Banca(10000);
		assertEquals("mare", b2.marimeBanca());
	}
	
	

}
