package com.gshocklab.mvp.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface IMailView extends IsWidget {
	public void setPresenter(IMailPresenter presenter);
	
	public interface IMailPresenter {
	}
}
