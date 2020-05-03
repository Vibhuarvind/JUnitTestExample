package JunitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import JunitTestPackage.Junitfunc;

public class testaddnum {

	@Test
	public void test() {
		Junitfunc BTS = new Junitfunc();
		int res = BTS.addnum(200,220);
		assertEquals(420,res);
		//assertEquals(42,res);
	}

}
