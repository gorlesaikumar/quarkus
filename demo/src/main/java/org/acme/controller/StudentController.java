package org.acme.controller;

import java.util.List;

import org.acme.model.Student;
import org.acme.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public void addStudent(@RequestBody Student s) {
		System.out.println("hi");
		studentService.addStudent(s);

	}

	@GetMapping("/student")
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return studentService.listStudents();
	}

	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return studentService.getStudentById(id);
	}

}
