package activity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Feature1Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd()
	{
	        Feature1 obj=new Feature1();
			int a=1;
			int b=2;
			int actualResult=0;
			actualResult=obj.add(a,b);
			int expectedResult=3;
			assertEquals(expectedResult, actualResult);
		}

}
