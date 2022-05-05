package com.ace.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.ace.springbootcrud.repository.Student;
import com.ace.springbootcrud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private Environment env;
	
	@Override
	public List<Student> getStudents() {
		
		//System.out.println(env.getProperty("spring.datasource.url"));
		return studentRepository.findAll();
	}
	
	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}

	

}
