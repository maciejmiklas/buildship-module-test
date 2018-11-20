package org.myapp.modd;


import org.myapp.AbstrPage;

public class ModDPage extends AbstrPage {
	ServiceD serviceD = new ServiceD();
	
	@Override
	protected String getMsg() {
		return "Page D: " + serviceD.callD();
	}
}
