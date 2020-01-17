package com.pasindu.springdata.controller;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.entity.Review;
import com.pasindu.springdata.service.EmployeeService;
import com.pasindu.springdata.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 4:31 PM
 */

@RestController
public class ReviewControllerImpl implements ReviewController
{
	@Autowired
	ReviewService reviewService;

	@Override
	public Review save( @RequestBody Review review )
	{
		Review savedReview = reviewService.save( review );
		return savedReview;
	}

	@Override
	public List<Review> getReceivedReviewsOfEmployee( @PathVariable long empId )
	{
		List<Review> receivedReviewsOfEmployee = reviewService.findByReceivedBy( empId );
		return receivedReviewsOfEmployee;
	}

	@Override
	public List<Review> getGivenReviewsOfEmployee( @PathVariable long empId )
	{
		List<Review> givenReviewsOfEmployee = reviewService.findByGivenBy( empId );
		return givenReviewsOfEmployee;
	}

}
