package org.myapp.moda;

import org.myapp.modb.ServiceB;

public class ServiceA {
	private final static String VAL = "A";
	private ServiceB serviceB = new ServiceB();

	public String callA() {
		System.out.println("Service " + VAL + " call");
		return VAL + " -> " + serviceB.callB();
	}
}
