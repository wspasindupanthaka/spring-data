package com.pasindu.springdata.repository.impl;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.entity.Event;
import com.pasindu.springdata.entity.Review;
import com.pasindu.springdata.repository.ReviewRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ReviewRepositoryImpl implements ReviewRepository
{

	private EntityManager em;

	public ReviewRepositoryImpl( EntityManager em )
	{
		this.em = em;
	}

	@Override
	public List<Review> findByReceivedBy( long empId )
	{
		TypedQuery<Review> q = em.createQuery( "SELECT r FROM Review r WHERE r.receivedBy = :empId", Review.class );
		q.setParameter( "empId", new Employee( empId ) );
		return q.getResultList();
	}

	@Override
	public List<Review> findByGivenBy( long empId )
	{
		TypedQuery<Review> q = em.createQuery( "SELECT r FROM Review r WHERE r.givenBy = :empId", Review.class );
		q.setParameter( "empId",  new Employee( empId ) );
		return q.getResultList();
	}

	@Override
	public Review save( Review review )
	{
		if ( review.getId() == 0 )
		{
			em.persist( review );
			em.flush();
		}
		else
		{
			review = em.merge( review );
		}
		return review;
	}
}
