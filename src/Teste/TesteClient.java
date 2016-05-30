package Teste;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import clase.Client;

public class TesteClient {
	
	@Test
	public void testVerificaVenit1() {
		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
		assertEquals("Eligibil",c1.verificaVenit());
	}
	
	@Test(timeout=10)
	public void testVerificaVenitTimeout() {
		Client c2 = new Client("Popescu Ion", "2941225408941", "Bucureºti", 2500);
		assertEquals("Eligibil",c2.verificaVenit());
	}
	
	@Test
	public void testVerificaCNP1(){
		Client c2 = new Client("Popescu Ion", "1930223429843", "Bucuresti", 2500);
		assertTrue(c2.verificaCNP());
	}
	
	@Test
	public void testVerificaCNPValoriExtreme1800(){
		Client c2 = new Client("Popescu Ion", "3990204415077", "Bucuresti", 2500);
		assertTrue(c2.verificaCNP());
	}
	
	@Test
	public void testVerificaCNPValoriExtreme2000(){
		Client c2 = new Client("Popescu Ion", "5020410414420", "Bucuresti", 2500);
		assertTrue(c2.verificaCNP());
	}
	
	@Test(timeout=1000)
	public void testVerificaCNPTimeout() {
		Client c2 = new Client("Popescu Ion", "1930223429843", "Bucureºti", 2500);
		assertTrue(c2.verificaCNP());
	}
	
	@Test
	public void testEsteMajor1(){
		Client c2 = new Client("Popescu Ion", "1930223429843", "Bucuresti", 2500);
		assertTrue(c2.esteMajor());
	}
	
//	@Test(timeout=1000)
//	public void testTimeoutEsteMajor() {
//		Client c2 = new Client("Popescu Ion", "1930223429843", "Bucureºti", 2500);
//		assertTrue(c2.esteMajor());
//	}
	
	
	@Test
	public void testGetVarsta1() {
		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
		assertEquals(21,c1.getVarstaClient());
	}
	
//	@Test(timeout=1000)
//	public void testGetVarstaTimeout() {
//		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
//		assertEquals(21,c1.getVarstaClient());
//	}
	
	@Test
    public void test_lista_nrElemente(){
		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
        List<Integer> lista=c1.verificaVarsteClienti(3);
        assertEquals(3, lista.size());
    } 
	
	@Test(timeout=10)
    public void test_lista_nrElementeTimeout(){
		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
        List<Integer> lista=c1.verificaVarsteClienti(3);
        assertEquals(3, lista.size());
    } 
	
	
	@Test
    public void test_clone(){
		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
		Client c2=c1.copiazaClient();
        assertSame(c1,c2);      
    }  
	
//	@Test(timeout=100)
//    public void test_cloneTimeout(){
//		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
//		Client c2=c1.copiazaClient();
//        assertSame(c1,c2);
//    }  
	
	@Test
    public void test_lista_varsteClienti(){
		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
        List<Integer> lista=c1.verificaVarsteClienti(5);
        for (Integer i:lista)
            assertTrue(c1.esteMajor(i));
    } 
	
	@Test(timeout=100)
    public void test_lista_varsteClientiTimeout(){
		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
        List<Integer> lista=c1.verificaVarsteClienti(10);
        for (Integer i:lista)
            assertTrue(c1.esteMajor(i));
    } 
	
	@Test
    public void testVerificaZi(){
		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
        assertTrue(c1.verificaZiua());
    } 
	
	@Test
    public void testVerificaLuna(){
		Client c1 = new Client("Popescu Ion", "2941225408941", "Bucuresti", 2500);
        assertTrue(c1.verificaLuna());
    } 
	
	
}
