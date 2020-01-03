package com.pasindu.springdata.service;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.resources.EmployeeNameOnly;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 1:08 PM
 */

public interface EmployeeService
{
	Employee save( Employee employee );

	void findByName( String name );

	Employee findById( long id );
}
