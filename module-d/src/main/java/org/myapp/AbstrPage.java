package org.myapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public abstract class AbstrPage extends WebPage {
	
	@Override
	protected void onConfigure() {
		super.onConfigure();
		add(new Label("message", getMsg()));
	}
	
	protected abstract String getMsg();

}
