package org.institute.controller;

import java.util.List;

import org.institute.dto.PhBookDto;
import org.institute.repository.PhBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhBookController {
	
	@Autowired
	private PhBookRepository repository;

	@PostMapping("/contact/save")
	public String saveContact(@RequestBody PhBookDto bookDto) {
		int result = repository.saveContact(bookDto);
		if(result > 0) {
			return "Contact Save Successfully";
		} else {
			return "Contact Save Failed.. Please try after sometime.";
		}
	}
	
	
	@GetMapping("contact/get-all")
	public List getAllContact() {
		return repository.getAllContact();
	}
	
}








