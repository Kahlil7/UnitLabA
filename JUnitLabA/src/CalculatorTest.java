import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	static Calculator c;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	 c = new Calculator(4,2);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//System.out.println("Release object");
			c.ReleaseObject();
				}
			

	@Before
	public void setUp() throws Exception {
		c.OpenDBConnection();
	}

	@After
	public void tearDown() throws Exception {
	c.CloseDBConnection();
	}

	@Test
	public void testAdd() {
		//Calculator c = new Calculator(1,2);
		int result = c.Add();
		assertEquals(6,result);
	}
	@Test 
	public void testSubtract()
	{
		//Calculator c = new Calculator(1,2);
		int result = c.Subtract();
		assertEquals(2,result);
	}
	@Test
	public void testDivide()
	{
		//Calculator c = new Calculator(4,2);
		int result = c.Divide();
		assertEquals(2,result);
	
	}
	@Test
	public void validate()
	{
		//Calculator c = new Calculator(0,2);
		boolean bResult = c.validate();
		assertTrue(bResult);
	
	}

	@Test
	public void multiply()
	{
		//Calculator c = new Calculator(4,2);
		int bResult = c.multiply();
		assertEquals(8,bResult);
	
	}
	
	

}
