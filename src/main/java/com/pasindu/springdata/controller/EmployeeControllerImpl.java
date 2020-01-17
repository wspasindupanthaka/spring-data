package com.pasindu.springdata.controller;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 1:20 PM
 */
@RestController
public class EmployeeControllerImpl implements EmployeeController
{

	@Autowired
	EmployeeService employeeService;

	@Override
	public Employee save( @RequestBody Employee employee )
	{
		Employee savedEmployee = employeeService.save( employee );
		return savedEmployee;
	}

	@Override
	public Employee findById( @PathVariable(value = "id") long id )
	{
		Employee findByIdIdEmployee = employeeService.findById( id );
		return findByIdIdEmployee;
	}

	@Override
	public List<Employee> findByName( @PathVariable(value = "name") String name )
	{
		List<Employee> employeesByName = employeeService.findByName( name );
		return employeesByName;
	}
}
