package com.pasindu.springdata.service;

import com.pasindu.springdata.entity.Review;

import java.util.List;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 4:24 PM
 */
public interface ReviewService
{
	Review save( Review review);

	List<Review> findByReceivedBy(long empId);

	List<Review> findByGivenBy(long empId);
}
