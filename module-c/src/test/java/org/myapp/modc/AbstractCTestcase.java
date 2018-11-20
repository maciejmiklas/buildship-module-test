package org.myapp.modc;

import org.myapp.modd.AbstractDTestcase;

public class AbstractCTestcase extends AbstractDTestcase{

	@Override
	protected void myAssertEquals(Object expected, Object actual) {
		System.out.println("Test C: " + expected + " =?= " + actual);
		super.myAssertEquals(expected, actual);
	}
}
