package JUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestingTeststr {

	@Test
	public void test() {
		JUnitTesting jf=new JUnitTesting();
		String result=jf.addstr("hell", "o");
		assertEquals("hello",result);
	}

}
