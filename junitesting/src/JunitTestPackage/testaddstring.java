package JunitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import JunitTestPackage.Junitfunc;

public class testaddstring {

	@Test
	public void test() {
		Junitfunc VA= new Junitfunc();
		String ans=VA.addstring("Vidish", "Arvind");
		assertEquals("VidishArvind",ans);
		//assertEquals("VidishaArvind",ans);
	}

}
