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
public interface ReviewRepository extends JpaRepository<Review, Long>
{
	List<Review> findByReceivedBy( Employee empId );

	List<Review> findByGivenBy( Employee empId );
}
