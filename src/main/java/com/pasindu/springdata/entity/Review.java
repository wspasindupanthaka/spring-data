package com.pasindu.springdata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author pasindu
 * @project jpa-example
 * @on 2020-01-01
 * @at 6:27 PM
 */

@Entity
@JsonIgnoreProperties(value = { "givenBy", "receivedBy" }, allowSetters = true)
public class Review
{
	@Id
	@GeneratedValue
	private long id;
	private String review;

	private LocalDateTime givenDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "given_by_id")
	private Employee givenBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "received_by_id")
	private Employee receivedBy;

	@PrePersist
	public void declareGivenDate()
	{
		this.givenDate = LocalDateTime.now();
	}

	public Review()
	{
	}

	public Review( String review )
	{
		this.review = review;
	}

	public long getId()
	{
		return id;
	}

	public void setId( long id )
	{
		this.id = id;
	}

	public String getReview()
	{
		return review;
	}

	public void setReview( String review )
	{
		this.review = review;
	}

	public LocalDateTime getGivenDate()
	{
		return givenDate;
	}

	public void setGivenDate( LocalDateTime givenDate )
	{
		this.givenDate = givenDate;
	}

	public Employee getReceivedBy()
	{
		return receivedBy;
	}

	public void setReceivedBy( Employee receivedBy )
	{
		this.receivedBy = receivedBy;
	}

	public Employee getGivenBy()
	{
		return givenBy;
	}

	public void setGivenBy( Employee givenBy )
	{
		this.givenBy = givenBy;
	}
}
