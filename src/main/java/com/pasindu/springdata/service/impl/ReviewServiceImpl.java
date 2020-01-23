package com.pasindu.springdata.service.impl;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.entity.Review;
import com.pasindu.springdata.repository.ReviewRepository;
import com.pasindu.springdata.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 4:25 PM
 */
@Service
public class ReviewServiceImpl implements ReviewService
{

	@Autowired
	ReviewRepository reviewRepository;

	@Override
	public Review save( Review review )
	{
		return reviewRepository.save( review );
	}

	@Override
	public List<Review> findByReceivedBy( long empId )
	{
		return reviewRepository.findByReceivedBy( empId );
	}

	@Override
	public List<Review> findByGivenBy( long empId )
	{
		return reviewRepository.findByGivenBy( empId );
	}
}
