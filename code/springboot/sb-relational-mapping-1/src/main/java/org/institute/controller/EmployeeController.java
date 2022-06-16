package org.institute.controller;

import java.util.List;

import org.institute.entity.Employee;
import org.institute.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/employee/save")
	public Employee saveEmp(@RequestBody Employee emp) {
		return repository.save(emp);
	}
	
	@GetMapping("/employee/get-all")
	public List<Employee> getAll() {
		return repository.findAll();
	}
	
	
}
