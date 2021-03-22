package org.acme.service;

import java.util.List;

import org.acme.dao.StudentDAO;
import org.acme.model.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO;

	public void setPersonDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	public void addStudent(Student s) {
		
		this.studentDAO.addStudent(s);
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return this.studentDAO.listStudents();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return this.getStudentById(id);
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
