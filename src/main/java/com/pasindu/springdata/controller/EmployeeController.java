package com.pasindu.springdata.controller;

import com.pasindu.springdata.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/employee")
public interface EmployeeController
{
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Employee save( @RequestBody Employee employee );

	@RequestMapping(value = "/from-id/{id}", method = RequestMethod.GET)
	public Employee findById( @PathVariable(value = "id") long id );

	@RequestMapping(value = "/from-name/{name}", method = RequestMethod.GET)
	public List<Employee> findByName( @PathVariable(value = "name") String name );
}
