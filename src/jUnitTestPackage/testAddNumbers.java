package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		int actualSum = jUnitFunctions.AddNumbers(100,200);
		assertEquals(300,actualSum);
//		fail("Not yet implemented");
	}

}
