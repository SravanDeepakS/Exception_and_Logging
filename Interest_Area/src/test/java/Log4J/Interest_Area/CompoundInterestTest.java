package Log4J.Interest_Area;

import junit.framework.TestCase;

public class CompoundInterestTest extends TestCase {

	CompoundInterest ci=new CompoundInterest(1200,2,1);
	public void testCalculateCI() {
		assertEquals(24.0, ci.calculateCI());
	}

}
