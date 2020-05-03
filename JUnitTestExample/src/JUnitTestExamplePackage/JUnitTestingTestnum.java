package JUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestingTestnum {

	@Test
	public void test() {
		JUnitTesting jjk=new JUnitTesting();
		int resultt=jjk.addnum(1,2);
		assertEquals(3,resultt);
	}

}
