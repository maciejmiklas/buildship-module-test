package org.myapp;

import org.junit.jupiter.api.Test;
import org.myapp.moda.AbstractATestcase;
import org.myapp.moda.ServiceA;
import org.myapp.modc.ServiceC;
import org.myapp.modd.ServiceD;

public class MyAppTest extends AbstractATestcase {

	ServiceA serviceA = new ServiceA();
	ServiceD serviceD = new ServiceD();
	ServiceC serviceC = new ServiceC();

	@Test
	public void testCallC() {
		myAssertEquals("C -> D", serviceC.callC());
	}
	@Test
	public void testCallD() {
		myAssertEquals("D", serviceD.callD());
	}

	@Test
	public void testCallA() {
		myAssertEquals("A -> B -> C -> D", serviceA.callA());
	}

}
