package org.institute.controller;

import org.institute.entity.Employee;
import org.institute.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/emp/save")
	public String saveEmployee(@RequestBody Employee emp) {
		repository.save(emp);
		return "Employee created Successfully";
	}
	
}
