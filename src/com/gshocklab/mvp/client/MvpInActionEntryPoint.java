package com.gshocklab.mvp.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.gshocklab.mvp.client.layout.AppLayout;
import com.gshocklab.mvp.client.mvp.DemoActivityMapper;
import com.gshocklab.mvp.client.mvp.DemoPlaceHistoryMapper;
import com.gshocklab.mvp.client.mvp.place.MailPlace;

public class MvpInActionEntryPoint implements EntryPoint {
	private SimplePanel containerWidget;
	private MailPlace defaultPlace = new MailPlace();
	
	@Override
	public void onModuleLoad() {
		final AppLayout mainLayout = new AppLayout();
		containerWidget = mainLayout.getAppContentHolder();
		
		final ClientFactory clientFactory = GWT.create(ClientFactory.class);
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();
		
		// activate activity manager and init display
		ActivityMapper activityMapper = new DemoActivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(containerWidget);
		
		// display default view with activated history processing
		DemoPlaceHistoryMapper historyMapper = GWT.create(DemoPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);
		
		RootLayoutPanel.get().add(mainLayout);
		
		History.newItem("mail:");
	}
}
