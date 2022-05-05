package com.ace.springbootcrud.service;

import java.util.List;

import com.ace.springbootcrud.repository.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	
	public Student addStudent(Student student);
	
	public void deleteStudent(Integer id);

}
