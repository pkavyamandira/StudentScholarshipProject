package com.example.scholarship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scholarship.model.Admin;
import com.example.scholarship.model.Application;
import com.example.scholarship.model.Scholarship;
import com.example.scholarship.model.Student;
import com.example.scholarship.repository.AdminRepository;
import com.example.scholarship.repository.ScholarshipRepository;
import com.example.scholarship.repository.StudentRepository;


@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private ScholarshipRepository scholarshipRepository;

	@Override
	public List<Student> viewAllStudents() 
	{
		return studentRepository.findAll();
	}

	@Override
	public Admin checkAdminLogin(String auname, String apwd) 
	{
		return adminRepository.checkAdminLogin(auname, apwd);
	}

	
	@Override
	public long Studentcount() {
		return studentRepository.count();
		
	}

	@Override
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "Student Deleted Successfully";
	}

	@Override
	public Student displStudentById(int id) 
	{
		return studentRepository.findById(id).get();
	}

	@Override
	public String addScholarship(Scholarship scholarship) {
		scholarshipRepository.save(scholarship);
		return "Scholarship Added Successfully";
	}

	@Override
	public List<Scholarship> viewAllScholarships() {
		return scholarshipRepository.findAll();
	}

	@Override
	public Scholarship displayScholarshipById(int sid) {
		return scholarshipRepository.findById(sid).get();
	}
	
	 @Override
	    public boolean submitApplication(Application application) {
	        try {
	            // Logic to save the application to the database or process it
	            // Example: applicationRepository.save(application);
	            System.out.println("Application saved: " + application);
	            return true; // Assuming success for this example
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false; // If there is an error, return false
	        }
	    }
}
	 

