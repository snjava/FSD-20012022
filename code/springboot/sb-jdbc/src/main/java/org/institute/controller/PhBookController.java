package org.institute.controller;

import java.util.List;
import java.util.Map;

import org.institute.dto.PhBookDto;
import org.institute.repository.PhBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin("localhost:3000")
@CrossOrigin("*")
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
	
	@DeleteMapping("/contact/delete-by-id")
	public String deleteContact(@RequestParam("id") int id) {
		int result = repository.deleteContact(id);
		if(result > 0) {
			return "Contact Deleted Successfully";
		} else {
			return "Contact Deletion Failed.. Please try after sometime.";
		}
	}
	
	@PutMapping("/contact/update")
	public String updateContact(@RequestBody PhBookDto phBookDto) {
		int result = repository.updateContact(phBookDto);
		return (result > 0) ? 
					"Contact Updated Successfully" 
				: 
					"Contact Updation Failed.. Please try after sometime.";
	}
	
	@GetMapping("/contact/get-by-id")
	public Map getContactById(@RequestParam("id") int id) {
		return repository.getContactById(id);
	}
	
}








