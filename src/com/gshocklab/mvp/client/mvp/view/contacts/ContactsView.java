package com.gshocklab.mvp.client.mvp.view.contacts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.gshocklab.mvp.client.mvp.view.IContactsView;

public class ContactsView extends Composite implements IContactsView {
	interface ContactsViewUiBinder extends UiBinder<Widget, ContactsView> {	}
	private static ContactsViewUiBinder uiBinder = GWT.create(ContactsViewUiBinder.class);
	
	private IContactsPresenter presenter;
	
	public ContactsView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(IContactsPresenter presenter) {
		this.presenter = presenter;
	}
}
