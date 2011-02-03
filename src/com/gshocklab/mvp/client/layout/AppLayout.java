package com.gshocklab.mvp.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class AppLayout extends Composite {
	interface AppLayoutUiBinder extends UiBinder<Widget, AppLayout> { }
	private static AppLayoutUiBinder uiBinder = GWT.create(AppLayoutUiBinder.class);
	
	@UiField SimplePanel appContent;

	public AppLayout() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public SimplePanel getAppContentHolder() {
		return this.appContent;
	}
}
