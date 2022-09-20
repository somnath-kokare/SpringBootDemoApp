package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentRepository;
import com.example.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return 	studentRepository.save(student);
	
	}

}
