package com.gshocklab.mvp.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface ITasksView extends IsWidget {
	
	public void setPresenter(ITasksPresenter presenter);
	
	public interface ITasksPresenter {
	}
}
