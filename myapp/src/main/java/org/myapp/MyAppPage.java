package org.myapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.myapp.moda.ModAPage;
import org.myapp.modb.ModBPage;
import org.myapp.modc.ModCPage;
import org.myapp.modd.ModDPage;

public class MyAppPage extends WebPage {
	@Override
	protected void onInitialize() {
		super.onInitialize();
		add(new Label("message", "My Pages"));

		add(new Link<Void>("link-moda") {
			@Override
			public void onClick() {
				System.out.println("################# Page A #################");
				setResponsePage(ModAPage.class);
			}
		});

		add(new Link<Void>("link-modb") {
			@Override
			public void onClick() {
				System.out.println("################# Page B #################");
				setResponsePage(ModBPage.class);
			}
		});

		add(new Link<Void>("link-modc") {
			@Override
			public void onClick() {
				System.out.println("################# Page C #################");
				setResponsePage(ModCPage.class);
			}
		});

		add(new Link<Void>("link-modd") {
			@Override
			public void onClick() {
				System.out.println("################# Page D #################");
				setResponsePage(ModDPage.class);
			}
		});
	}
}
