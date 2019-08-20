package com.sample.MyApp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.MyApp2.repo.Student;
import com.sample.MyApp2.repo.StudentRepository;

@Component
public class StudentService {
	
	@Autowired 
	StudentRepository studentRepository;
	
	public List<Student> getStudentDetails(){
		return (List<Student>) studentRepository.findAll();
	}

}
