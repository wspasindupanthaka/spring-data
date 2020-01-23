package com.pasindu.springdata.repository;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 4:26 PM
 */
@Repository
public interface ReviewRepository
{
	List<Review> findByReceivedBy( long empId );

	List<Review> findByGivenBy( long empId );

	Review save( Review review );
}
