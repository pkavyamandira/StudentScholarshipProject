package com.example.scholarship.service;


import com.example.scholarship.model.Student;

public interface StudentService 
{
	public String studentRegistration(Student student);
	public Student checkStudentLogin(String email, String password);
    public String updateStudent(Student student);
    
   

}

