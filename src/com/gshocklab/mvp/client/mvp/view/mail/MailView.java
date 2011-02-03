package com.gshocklab.mvp.client.mvp.view.mail;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.gshocklab.mvp.client.mvp.view.IMailView;

public class MailView extends Composite implements IMailView {
	interface MailViewUiBinder extends UiBinder<Widget, MailView> {	}
	private static MailViewUiBinder uiBinder = GWT.create(MailViewUiBinder.class);
	
	private IMailPresenter presenter;

	public MailView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(IMailPresenter presenter) {
		this.presenter = presenter;
	}
}
