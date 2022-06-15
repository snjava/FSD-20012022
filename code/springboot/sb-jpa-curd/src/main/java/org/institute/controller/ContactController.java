package org.institute.controller;

import java.util.List;
import java.util.Map;

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
	
	
	@GetMapping("/contact/get-by-name")
	public Map getContactByName() {
		return repository.getContactByName();
	}
	
	
	@GetMapping("/contact/get-by-number")
	public Contact getContactByNumber(@RequestParam("number") String number) {
		return repository.getContactByNumber(number);
	}
	
	
	@GetMapping("/contact/get-todays-birthday")
	public List<Map> getContactByMonthDay(@RequestParam("month") int month, @RequestParam("day") int day) {
		return repository.getContactOfBirthDay(month, day);
	}
	
	
	@PutMapping("/contact/update-number")
	public String updateContactNumber(@RequestBody Contact contact) {
		repository.updatePhoneNumber(contact.getPhoneNo(), contact.getId());
		return "Contact Updated Successfully";
	}
	

}
