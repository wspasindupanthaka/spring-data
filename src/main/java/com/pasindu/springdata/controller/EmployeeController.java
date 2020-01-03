package com.pasindu.springdata.controller;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 1:20 PM
 */
@RequestMapping("/employee")
@RestController
public class EmployeeController
{

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Employee save( @RequestBody Employee employee )
	{
		Employee savedEmployee = employeeService.save( employee );
		return savedEmployee;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Employee findById(@PathVariable(value = "id") long id )
	{
		Employee findByIdIdEmployee = employeeService.findById( id );
		return findByIdIdEmployee;
	}
}
