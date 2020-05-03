package junitestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		junitfunction VA= new junitfunction();
		String ans=VA.addstring("Vidish", "Arvind");
		assertEquals("VidishArvind",ans);
		//assertEquals("VidishaArvind",ans);
	}

}
