package org.acme.service;

import java.util.List;

import org.acme.dao.StudentDAO;
import org.acme.dao.StudentDAOimpl;
import org.acme.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentdao;
	 
	 
	

	@Override
	public void addStudent(Student s) {
		
		studentdao.addStudent(s);
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return studentdao.listStudents();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentdao.getStudentById(id);
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
