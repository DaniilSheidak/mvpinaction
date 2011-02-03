package com.gshocklab.mvp.client.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class MailPlace extends Place {
	private static final String VIEW_HISTORY_TOKEN = "mail";
	
	public MailPlace() { }
	
	@Prefix(value = VIEW_HISTORY_TOKEN)
	public static class Tokenizer implements PlaceTokenizer<MailPlace> {
		@Override
		public MailPlace getPlace(String token) {
			return new MailPlace();
		}

		@Override
		public String getToken(MailPlace place) {
			return "";
		}
	}
}
