package org.myapp.moda;

import org.junit.jupiter.api.Test;

public class ModATest extends AbstractATestcase {

	ServiceA service = new ServiceA();

	@Test
	public void testCall() {
		myAssertEquals("A -> B -> C -> D", service.callA());
	}

}
