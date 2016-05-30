package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Echipa;

public class TesteEchipa {

	@Test
	public void testMarimeEchipa() {
		Echipa e1 = new Echipa(15, "Red");
		assertEquals("medie", e1.numarMembriEchipa());
	}
	
	@Test(timeout=100)
	public void testMarimeEchipaTimeout() {
		Echipa e1 = new Echipa(15, "Red");
		assertEquals("medie", e1.numarMembriEchipa());
	}


}
