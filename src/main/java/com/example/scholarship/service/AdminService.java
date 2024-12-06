package com.example.scholarship.service;

import java.util.List;

import com.example.scholarship.model.Admin;
import com.example.scholarship.model.Application;
import com.example.scholarship.model.Scholarship;
import com.example.scholarship.model.Student;


public interface AdminService 
{
	public List<Student> viewAllStudents();
	public Admin checkAdminLogin(String auname, String apwd);
    public long Studentcount();
    public String deleteStudent(int id);
    public Student displStudentById(int id);
    
    //image upload and display operations
    public String addScholarship(Scholarship scholarship);
    public List<Scholarship> viewAllScholarships();
    public Scholarship displayScholarshipById(int sid);
    public boolean submitApplication(Application application);
}
