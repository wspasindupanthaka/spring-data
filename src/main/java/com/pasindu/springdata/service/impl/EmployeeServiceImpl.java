package com.pasindu.springdata.service.impl;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.repository.EmployeeRepository;
import com.pasindu.springdata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pasindu
 * @project spring-data
 * @on 2020-01-02
 * @at 1:10 PM
 */
@Service
public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee save( Employee employee )
	{
		return employeeRepository.save(employee);
	}

	@Override
	public Employee edit( Employee employee )
	{
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findByName( String name )
	{
		return employeeRepository.findEmployeeByName( name );
	}

	@Override
	public Employee findById( long id )
	{
		return employeeRepository.findById( id );
	}
}
