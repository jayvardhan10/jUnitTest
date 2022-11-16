package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		String actualString = jUnitFunctions.AddStrings("abc","xyz");
		assertEquals("abcxyz",actualString);
//		fail("Not yet implemented");
	}

}
