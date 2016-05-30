package Teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Credit;
import junit.framework.TestCase;

public class TestFisier extends TestCase{

	Credit credit;
	File fisier;
	FileReader fr;
	BufferedReader bf;
	
	public TestFisier(String nume) {
		super(nume);
	}
	@Before
	public void setUp() throws FileNotFoundException {
		 credit = new Credit(6, 8000);
		 fisier = new File("Test.txt");
		 fr = new FileReader(fisier);
		 bf = new BufferedReader(fr);
	}
	
	@Test
	public void testValoareMare() {
		Credit c = new Credit(6,80000);
		assertTrue(c.valoareMareCredit());
		Credit c1 = new Credit(9,30000);
		assertTrue(c1.valoareMareCredit());
	}
	
	@Test
	public void testValoareMareFromFile() throws IOException {
		String linie ;
		while((linie = bf.readLine())!=null) {		
			int valoare = Integer.parseInt(linie);
			assertTrue(credit.valoareMareCredit1(valoare));
		} 
	}	
	
	@After
	public void tearDown() throws IOException{
		bf.close();
		fr.close();
	}

}
