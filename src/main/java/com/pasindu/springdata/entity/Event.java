package com.pasindu.springdata.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Event
{
	@Id
	@GeneratedValue
	private long id;

	private String name;

	private LocalDate eventDate;

	private LocalDateTime eventTime;

	@ManyToMany
	@JoinTable(
			name = "employee_event",
			joinColumns = @JoinColumn(name = "event_id"),
			inverseJoinColumns = @JoinColumn(name = "employee_id"))
	private List<Employee> participatingEmployees;

	public Event()
	{
	}

	public long getId()
	{
		return id;
	}

	public void setId( long id )
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public LocalDate getEventDate()
	{
		return eventDate;
	}

	public void setEventDate( LocalDate eventDate )
	{
		this.eventDate = eventDate;
	}

	public LocalDateTime getEventTime()
	{
		return eventTime;
	}

	public void setEventTime( LocalDateTime eventTime )
	{
		this.eventTime = eventTime;
	}

	public List<Employee> getParticipatingEmployees()
	{
		return participatingEmployees;
	}

	public void setParticipatingEmployees( List<Employee> participatingEmployees )
	{
		this.participatingEmployees = participatingEmployees;
	}
}
