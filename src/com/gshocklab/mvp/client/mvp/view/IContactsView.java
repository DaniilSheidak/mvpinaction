package com.gshocklab.mvp.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface IContactsView extends IsWidget {
	public void setPresenter(IContactsPresenter presenter);
	
	public interface IContactsPresenter {
	}
}
