package org.myapp.modb;

import org.junit.jupiter.api.Test;

public class ModBTest extends AbstractBTestcase {

	ServiceB service = new ServiceB();

	@Test
	public void testCall() {
		myAssertEquals("B -> C -> D", service.callB());
	}

}
