package org.institute.controller;

import org.institute.bean.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoController {

	// http://localhost:8080/student/save
	@RequestMapping(value = "/student/save", method = RequestMethod.POST)
	public String getStudentInfo(@RequestBody Student stud) {
		System.out.println("Id : " + stud.getId());
		System.out.println("Name : " + stud.getName());
		System.out.println("Email : " + stud.getEmail());
		System.out.println("Contact : " + stud.getContact());
		return "Recevied Student Information...";
	}
	
}
