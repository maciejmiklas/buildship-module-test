package org.myapp.modc;

import org.junit.jupiter.api.Test;

public class ModCTest extends AbstractCTestcase {

	ServiceC service = new ServiceC();

	@Test
	public void testCall() {
		myAssertEquals("C -> D", service.callC());
	}

}
