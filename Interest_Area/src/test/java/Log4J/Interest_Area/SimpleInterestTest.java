package Log4J.Interest_Area;

import junit.framework.TestCase;

public class SimpleInterestTest extends TestCase {


	SimpleInterest si=new SimpleInterest(100,13.5,2);

	public void testCalculateSI() 
	{
		assertEquals(27.0, si.calculateSI());
	}

}
