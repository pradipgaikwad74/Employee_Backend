package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.repository.EmployeeRepository;
import com.services.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService serv;
	@Autowired
	private EmployeeRepository rep;
	 
	
	@GetMapping
	public List<Employee> getAll(){
		return serv.getAll();
	}
	
	@PostMapping
	public String add(@RequestBody Employee e){
		  serv.add(e);
		return "Data added sucessfully";
	}
	
	@GetMapping("/{id}")
	public Employee get(@PathVariable int id) {
		 return serv.getById(id);
		  
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee e) {
		return serv.update(e);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		rep.deleteById(id);
		return "record deleted sucessfully";
	}
}
