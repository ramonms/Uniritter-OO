package aula_II;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testa {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		contaCorrente itau = new contaCorrente(500F);
		assertEquals(500,itau.getSaldo(),0.001);
		
		
	}
	
	@Test
	public void test2() {
		
		poupanca poup = new poupanca();
		poup.setSaldo(poup.getSaldo()+200F);
		assertEquals(300,poup.getSaldo(),0.001);		
	}
	
	@Test
	public void testSaque() {
		
		contaCorrente itau = new contaCorrente(500F);
		try {
			itau.sacar(150F);
			assertEquals(100,itau.getSaldo(),0.001);
		} catch (Exception e) {
			fail();
		}
				
	}		

}