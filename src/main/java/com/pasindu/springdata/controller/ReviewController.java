package com.pasindu.springdata.controller;

import com.pasindu.springdata.entity.Review;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/review")
public interface ReviewController
{
	@RequestMapping(value = "", method = RequestMethod.POST)
	Review save( @RequestBody Review review );

	@RequestMapping(value = "/received/{empId}", method = RequestMethod.GET)
	public List<Review> getReceivedReviewsOfEmployee( @PathVariable long empId );

	@RequestMapping(value = "/given/{empId}", method = RequestMethod.GET)
	public List<Review> getGivenReviewsOfEmployee( @PathVariable long empId );
}
