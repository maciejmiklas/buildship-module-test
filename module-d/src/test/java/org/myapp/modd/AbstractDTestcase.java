package org.myapp.modd;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractDTestcase {

	protected void myAssertEquals(Object expected, Object actual) {
		System.out.println("Test D: " + expected + " =?= " + actual);
		assertEquals(expected, actual);
	}

}
