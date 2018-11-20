package org.myapp.moda;

import org.myapp.modb.AbstractBTestcase;

public class AbstractATestcase extends AbstractBTestcase{

	@Override
	protected void myAssertEquals(Object expected, Object actual) {
		System.out.println("Test A: " + expected + " =?= " + actual);
		super.myAssertEquals(expected, actual);
	}
}
