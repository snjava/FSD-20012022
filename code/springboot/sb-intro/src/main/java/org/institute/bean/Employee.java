package org.institute.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired // to automate the dependency injection process.
	Address address;
	
	public Employee() {
		System.out.println("Employee Object Created");
	}
	
	public void empInfo() {
		System.out.println("This is Employee Info Method");
		address.demo();
	}
}
