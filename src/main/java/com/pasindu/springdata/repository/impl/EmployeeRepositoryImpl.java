package com.pasindu.springdata.repository.impl;

import com.pasindu.springdata.entity.Employee;
import com.pasindu.springdata.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository
{

	private EntityManager em;

	public EmployeeRepositoryImpl( EntityManager em )
	{
		this.em = em;
	}

	@Override
	public List<Employee> findEmployeeByName( String name )
	{
		TypedQuery<Employee> q = em.createQuery( "SELECT e FROM Employee e WHERE e.name = :name", Employee.class );
		q.setParameter( "name", name );
		return q.getResultList();
	}

	@Override
	@Transactional
	public Employee save( Employee employee )
	{
		if ( employee.getId() == 0 )
		{
			em.persist( employee );
			em.flush();
		}
		else
		{
			employee = em.merge( employee );
		}
		return employee;
	}

	@Override
	public Employee findById( long id )
	{
		Employee employee = em.find( Employee.class, id );
		return employee;
	}
}
