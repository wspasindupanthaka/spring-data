package com.pasindu.springdata.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * @author pasindu
 * @project jpa-example
 * @on 2020-01-01
 * @at 6:27 PM
 */
@Entity
@JsonIgnoreProperties(value = { "participatingEvents" }, allowSetters = true)
public class Employee
{
	@Id
	@GeneratedValue
	private long id;
	private String name;

	@OneToMany(
			mappedBy = "givenBy",
			fetch = FetchType.LAZY
	)
	private List<Review> givenReviews;

	@OneToMany(
			mappedBy = "receivedBy",
			fetch = FetchType.LAZY
	)
	private List<Review> receivedReviews;

	@ManyToMany(mappedBy = "participatingEmployees", fetch = FetchType.LAZY)
	private List<Event> participatingEvents;

	public Employee()
	{
	}

	public Employee( long id )
	{
		this.id = id;
	}

	public Employee( String name )
	{
		this.name = name;
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

	public List<Review> getGivenReviews()
	{
		return givenReviews;
	}

	public void setGivenReviews( List<Review> givenReviews )
	{
		this.givenReviews = givenReviews;
	}

	public List<Review> getReceivedReviews()
	{
		return receivedReviews;
	}

	public void setReceivedReviews( List<Review> receivedReviews )
	{
		this.receivedReviews = receivedReviews;
	}

	public List<Event> getParticipatingEvents()
	{
		return participatingEvents;
	}

	public void setParticipatingEvents( List<Event> participatingEvents )
	{
		this.participatingEvents = participatingEvents;
	}

}
