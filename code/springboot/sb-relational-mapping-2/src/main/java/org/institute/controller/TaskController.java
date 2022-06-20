package org.institute.controller;

import org.institute.entity.Task;
import org.institute.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	@Autowired
	private TaskRepository repository;
	
	@PostMapping("/task/save/")
	public Task saveUser(@RequestBody Task task) {
		return repository.save(task);
	}
	
	
	@GetMapping("/task/getbyid")
	public Task getTaskById(@RequestParam("id") int id) {
		return repository.findById(id).get();
	}
	
	
}
