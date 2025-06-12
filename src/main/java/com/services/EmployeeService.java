package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository rep;
	
	public List<Employee> getAll(){
		return rep.findAll();
	}
	
	
	public Employee getById(int id)
	{
		Employee emp = rep.findById(id).orElse(null);
	    	return emp;	
				}
	
	public Employee add(Employee emp) {
		return rep.save(emp);
		
	}
	
	public Employee update(Employee emp) {
		return rep.save(emp);
		
	}
	
	
}
