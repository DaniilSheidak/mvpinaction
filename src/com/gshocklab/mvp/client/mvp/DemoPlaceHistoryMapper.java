package com.gshocklab.mvp.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.gshocklab.mvp.client.mvp.place.ContactsPlace;
import com.gshocklab.mvp.client.mvp.place.MailPlace;
import com.gshocklab.mvp.client.mvp.place.TasksPlace;

@WithTokenizers({MailPlace.Tokenizer.class, ContactsPlace.Tokenizer.class, TasksPlace.Tokenizer.class})
public interface DemoPlaceHistoryMapper extends PlaceHistoryMapper {
}
