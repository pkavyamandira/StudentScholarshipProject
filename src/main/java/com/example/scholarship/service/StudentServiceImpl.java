package com.example.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scholarship.model.Student;
import com.example.scholarship.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository studentrepository;

	@Override
	public String studentRegistration(Student student) {
		studentrepository.save(student);
		return "Student Registerd Successfully";
	}
	@Override
	public Student checkStudentLogin(String email, String password) 
	{
		return studentrepository.checkStudentLogin(email, password);
	}
	@Override
	public String updateStudent(Student student) 
	{
		Student s =studentrepository.findById(student.getId()).get();
		s.setContact(student.getContact());
		s.setDateofbirth(student.getDateofbirth());
		s.setGender(student.getGender());
		s.setLocation(student.getLocation());
		s.setName(student.getName());
		s.setPassword(student.getPassword());
		
		studentrepository.save(s);
		return "Student Updated Successfully";
	}
	
	
}
