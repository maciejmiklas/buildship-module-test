package org.myapp.moda;

import org.myapp.AbstrPage;

public class ModAPage extends AbstrPage {
	ServiceA serviceA = new ServiceA();

	@Override
	protected String getMsg() {
		return "Page A: " + serviceA.callA();
	}
}