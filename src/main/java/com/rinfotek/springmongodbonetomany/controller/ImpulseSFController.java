package com.rinfotek.springmongodbonetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinfotek.springmongodbonetomany.entity.Student;
import com.rinfotek.springmongodbonetomany.repository.ImpulseRepository;

@RestController
@RequestMapping("/feeservice") 
public class ImpulseSFController {
	
	@Autowired
	private ImpulseRepository repository;

	@PostMapping("/feeSubmit")
	public String feeSubmit(@RequestBody Student student) {
		repository.save(student);
		return "Fee submitted successfully";
	}

	@GetMapping("/getStudentByName/{name}")
	public List<Student> getStudentByName(@PathVariable String name) {
		return repository.findByName(name); 
	}

//	// write one more search api through we will get the list of users.
//	@GetMapping("/getStudentByCurrentClass/{current_class}")
//	public List<Student> getStudentByCurrentClass(@PathVariable String current_class) {// this name will pass as
//																						// pathvariable
//		return repository.findByCurrentClass(current_class); // create same method in repository
//	}
}
