package org.institute.controller;

import java.util.List;

import org.institute.entity.Contact;
import org.institute.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@Autowired
	private ContactRepository repository;
	
	@PostMapping("/contact/save")
	public Contact saveContact(@RequestBody Contact contact) {
		Contact ct = repository.save(contact);
		return ct;
	}
	
	@PutMapping("/contact/update")
	public Contact updateContact(@RequestBody Contact contact) {
		Contact ct = repository.save(contact);
		return ct;
	}
	
	@DeleteMapping("/contact/delete")
	public String deleteContact(@RequestParam("id") int id) {
		repository.deleteById(id);
		return "Contact Deleted Successfully";
	}
	
	@GetMapping("/contact/get-all")
	public List<Contact> getAllContacts() {
		return repository.findAll();
	}

}
