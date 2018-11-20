package org.myapp.modb;

import org.myapp.modc.ServiceC;

public class ServiceB {
	private final static String VAL = "B";
	private ServiceC serviceC = new ServiceC();

	public String callB() {
		System.out.println("Service " + VAL + " call");
		return VAL + " -> " + serviceC.callC();
	}
}
