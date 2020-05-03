package junitestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnum {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		junitfunction BTS = new junitfunction();
		
		int res = BTS.addnum(200,220);
		assertEquals(420,res);
		//assertEquals(42,res);
		
	}

}
