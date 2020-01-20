package com.pasindu.springdata.service;

import com.pasindu.springdata.entity.Event;

import java.util.List;

public interface EventService
{
	Event save(Event event);

	List<Event> findByName( String name );
}
