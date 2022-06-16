package org.institute.controller;

import java.util.List;

import org.institute.entity.Address;
import org.institute.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	@Autowired
	private AddressRepository repository;
	
	@PostMapping("/address/save")
	public Address saveAddress(@RequestBody Address add) {
		return repository.save(add);
	}
	
	@GetMapping("address/get-all")
	public List<Address> getAllAddress() {
		return repository.findAll();
	}
	
	
}
