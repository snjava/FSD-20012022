package org.institute.controller;

import org.institute.bean.Employee;
import org.institute.bean.Student;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeInfoController {

	// http://localhost:8080/employee/info
	//@RequestMapping(value = "/employee/info", method = RequestMethod.POST)
	@PostMapping("/employee/info")
	public String getEmployee(@RequestBody Employee emp) {
		System.out.println("Employee Id : " + emp.getId());
		System.out.println("Employee Name : " + emp.getName());
		System.out.println("Employee Salary : " + emp.getSalary());
		return "get Employee Information...";
	}
	
	
	// http://localhost:8080/employee/delete-by-id?id=11
	@DeleteMapping("/employee/delete-by-id" )
	public String empDelete(@RequestParam("id") int id) {
		return "Employee Deleted  wirh id : "+id;
	}
	
	// http://localhost:8080/employee/get-by-id/14
	@GetMapping("/employee/get-by-id/{id}")
	public Employee getEmpInfo(@PathVariable("id") int id) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName("Abcd");
		emp.setSalary(756756.56);
		return emp;
	}
	
}








