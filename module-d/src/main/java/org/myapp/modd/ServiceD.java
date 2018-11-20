package org.myapp.modd;

public class ServiceD {
	private final static String VAL = "D";

	public String callD() {
		System.out.println("Service " + VAL + " call");
		return VAL;
	}
}
