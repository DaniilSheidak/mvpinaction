package com.gshocklab.mvp.client.mvp.view.tasks;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.gshocklab.mvp.client.mvp.view.ITasksView;

public class TasksView extends Composite implements ITasksView {
	interface TasksViewUiBinder extends UiBinder<Widget, TasksView> { }
	private static TasksViewUiBinder uiBinder = GWT.create(TasksViewUiBinder.class);
	
	private ITasksPresenter presenter;

	public TasksView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(ITasksPresenter presenter) {
		this.presenter = presenter;
	}
}
