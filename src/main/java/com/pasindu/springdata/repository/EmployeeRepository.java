package com.pasindu.springdata.repository;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.resources.EmployeeNameOnly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 12:56 PM
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
	List<Employee> findEmployeeByName( String name );

	Employee findById( long id );
}
