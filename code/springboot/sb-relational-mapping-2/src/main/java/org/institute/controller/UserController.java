package org.institute.controller;

import java.util.List;

import org.institute.entity.User;
import org.institute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@PostMapping("/user/save/")
	public User saveUser(@RequestBody User user) {
		return repository.save(user);
	}
	
	@GetMapping("/user/get-by-page")
	public List<User> getUserbyPagination(@RequestParam("pagenum") int pageNum,@RequestParam("recordnum") int recordCount) {
		// return repository.findAll(); to get all the records without pagination
		Pageable page = PageRequest.of(pageNum, recordCount);
		Page<User> taskList = repository.findAll(page);
		return taskList.getContent();
	}
	
	
	
}
