package org.institute.controller;

import java.util.List;
import org.institute.entity.Education;
import org.institute.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {
	
	@Autowired
	private EducationRepository educationRepository;
	
	@PostMapping("/education/save")
	public Education save(@RequestBody Education education) {
		return educationRepository.save(education);
	}
	
	@GetMapping("/education/get-all")
	public List<Education>  getAll() {
		return educationRepository.findAll();
	}

}
