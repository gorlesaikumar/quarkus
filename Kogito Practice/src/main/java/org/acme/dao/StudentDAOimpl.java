package org.acme.dao;

import java.util.List;

import org.acme.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;


@Repository
public class StudentDAOimpl implements StudentDAO{
	
	

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addStudent(Student s) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(s);
		
	}

	@Override
	public List<Student> listStudents() {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Student> studentList = session.createQuery("from Student").list();
		for(Student s : studentList){
			
			System.out.println("Student List::"+s);
		}
		return studentList;
	}

	@Override
	public Student getStudentById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(id);
		return null;
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
