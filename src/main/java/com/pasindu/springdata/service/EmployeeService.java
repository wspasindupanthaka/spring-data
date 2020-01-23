package com.pasindu.springdata.service;

import com.pasindu.springdata.entity.Employee;

import java.util.List;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 1:08 PM
 */

public interface EmployeeService
{
	Employee save( Employee employee );

	Employee edit( Employee employee );

	List<Employee> findByName( String name );

	Employee findById( long id );
}
