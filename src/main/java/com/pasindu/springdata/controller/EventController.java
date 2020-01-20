package com.pasindu.springdata.controller;

import com.pasindu.springdata.entity.Event;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/event")
public interface EventController
{
	@RequestMapping(value = "", method = RequestMethod.POST)
	Event save( @RequestBody Event event );

	@RequestMapping(value = "/from-name/{name}", method = RequestMethod.GET)
	List<Event> findByName( @PathVariable(value = "name") String name);
}
