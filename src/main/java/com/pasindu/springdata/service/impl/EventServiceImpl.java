package com.pasindu.springdata.service.impl;

import com.pasindu.springdata.entity.Event;
import com.pasindu.springdata.repository.EventRepository;
import com.pasindu.springdata.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class EventServiceImpl implements EventService
{

	@Autowired
	private EventRepository eventRepository;

	@Override
	public Event save( Event event )
	{
		return eventRepository.save( event );
	}

	@Override
	public List<Event> findByName( String name )
	{
		return eventRepository.findByName(name);
	}
}
