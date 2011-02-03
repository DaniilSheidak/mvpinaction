package com.gshocklab.mvp.client.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class TasksPlace extends Place {
	private static final String VIEW_HISTORY_TOKEN = "tasks";
	
	public TasksPlace() { }
	
	@Prefix(value = VIEW_HISTORY_TOKEN)
	public static class Tokenizer implements PlaceTokenizer<TasksPlace> {
		@Override
		public TasksPlace getPlace(String token) {
			return new TasksPlace();
		}

		@Override
		public String getToken(TasksPlace place) {
			return "";
		}
	}
}
