package com.sample.MyApp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.MyApp2.repo.Student;
import com.sample.MyApp2.service.StudentService;

@RestController

@CrossOrigin(origins = "http://localhost:4200")


public class StudentController {
	
	@Autowired
	StudentService studService;
	
	@RequestMapping("/students")
	public List<Student> getStudentList(){
		return studService.getStudentDetails();
	}
	
	
	

}
