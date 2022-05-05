package com.ace.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ace.springbootcrud.repository.Student;
import com.ace.springbootcrud.service.StudentService;

@RestController
public class StudentRestcontroller {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value = "/students")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@PutMapping("/add-update-student")
	public Student addStudent(@RequestBody Student student) {
		
		return studentService.addStudent(student);
		
	}
	
	@RequestMapping(value = "/delete-student/{id}",method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable Integer id) {
		studentService.deleteStudent(id);
	}

}
