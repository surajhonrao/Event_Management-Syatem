package com.Suraj.serviceInterface;

import java.util.List;

import com.Suraj.entity.EventsEntity;
import com.Suraj.entity.Form;

public interface EventServiceInterface {

	// public String loadEvent(String eventCategory);
	public EventsEntity loadEventData(String eventCategory);

	public List<Form> getUserEvents(String email);

	public void deleteUserBooking(Integer id);

}
