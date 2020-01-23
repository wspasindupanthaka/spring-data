package com.pasindu.springdata.repository.impl;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.entity.Event;
import com.pasindu.springdata.repository.EventRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EventRepositoryImpl implements EventRepository
{

	private EntityManager em;

	public EventRepositoryImpl( EntityManager em )
	{
		this.em = em;
	}

	@Override
	public Event save( Event event )
	{
		if ( event.getId() == 0 )
		{
			em.persist( event );
			em.flush();
		}
		else
		{
			event = em.merge( event );
		}
		return event;
	}

	@Override
	public List<Event> findByName( String name )
	{
		TypedQuery<Event> q = em.createQuery( "SELECT e FROM Event e WHERE e.name = :name", Event.class );
		q.setParameter( "name", name );
		return q.getResultList();
	}
}
