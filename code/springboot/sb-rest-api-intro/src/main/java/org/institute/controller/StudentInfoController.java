package org.institute.controller;

import org.institute.dto.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoController {

	//http://localhost:8080/welcome
	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	public String welcomeRestApi() {
		return "Welcome To First Rest API....";
	}
	
	//http://localhost:8080/student-info
	@RequestMapping(path = "/student-info", method = RequestMethod.GET)
	public Student getStudentInfo() {
		Student stud = new Student();
			stud.setId(121);
			stud.setName("Abc");
			stud.setEmail("abc@gmail.com");
			stud.setContact("9798769876");
		return stud;
	}
	
	
	
	
}
