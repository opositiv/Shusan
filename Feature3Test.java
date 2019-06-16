package activity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Feature3Test {

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
	public void testMul()
	{
	        Feature3 obj=new Feature3();
			int a=1;
			int b=2;
			int actualResult=0;
			actualResult=obj.mul(a,b);
			int expectedResult=2;
			assertEquals(expectedResult, actualResult);
		}


}
