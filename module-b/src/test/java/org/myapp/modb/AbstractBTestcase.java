package org.myapp.modb;

import org.myapp.modc.AbstractCTestcase;

public class AbstractBTestcase extends AbstractCTestcase{

	@Override
	protected void myAssertEquals(Object expected, Object actual) {
		System.out.println("Test B: " + expected + " =?= " + actual);
		super.myAssertEquals(expected, actual);
	}
}
