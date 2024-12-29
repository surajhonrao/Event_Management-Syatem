package com.Shakthi.serviceInterface;

import java.util.List;

import com.Shakthi.entity.EventsEntity;
import com.Shakthi.entity.Form;

public interface EventServiceInterface {

	// public String loadEvent(String eventCategory);
	public EventsEntity loadEventData(String eventCategory);

	public List<Form> getUserEvents(String email);

	public void deleteUserBooking(Integer id);

}
