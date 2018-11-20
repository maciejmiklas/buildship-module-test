package org.myapp.modb;

import org.myapp.AbstrPage;

public class ModBPage extends AbstrPage {
	ServiceB serviceB = new ServiceB();

	@Override
	protected String getMsg() {
		return "Page B: " + serviceB.callB();
	}


}
