package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;

//	public Student saveStudent(Student student) {
//		return saveStudent(student);
//		
//		
//	}
	@PutMapping("/save")

	public ResponseEntity<Student> saveStudent1(@RequestBody Student student) {
		Student st = studentServiceImpl.saveStudent(student);
		return ResponseEntity.ok().body(st);
	}

}
