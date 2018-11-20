package org.myapp.modc;

import org.myapp.AbstrPage;

public class ModCPage extends AbstrPage {
	ServiceC serviceC = new ServiceC();

	@Override
	protected String getMsg() {
		return "Page C: " + serviceC.callC();
	}
}
