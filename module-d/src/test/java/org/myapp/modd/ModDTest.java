package org.myapp.modd;

import org.junit.jupiter.api.Test;

public class ModDTest extends AbstractDTestcase {

	ServiceD service = new ServiceD();

	@Test
	public void testCall() {
		myAssertEquals("D", service.callD());
	}

}
