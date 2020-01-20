package com.pasindu.springdata.controller;

import com.pasindu.springdata.entity.Event;
import com.pasindu.springdata.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventControllerImpl implements EventController
{

	@Autowired
	EventService eventService;

	@Override
	public Event save( Event event )
	{
		return eventService.save( event );
	}

	@Override
	public List<Event> findByName( String name )
	{
		return eventService.findByName(name);
	}
}
