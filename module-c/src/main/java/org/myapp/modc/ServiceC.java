package org.myapp.modc;

import org.myapp.modd.ServiceD;

public class ServiceC {
	private final static String VAL = "C";
	private ServiceD serviced = new ServiceD();
	
	public String callC() {
		System.out.println("Service " + VAL + " call");
		return VAL+" -> " + serviced.callD();
	}
}
