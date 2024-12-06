package com.example.scholarship.service;

import com.example.scholarship.model.Application;
import com.example.scholarship.model.Scholarship;
import com.example.scholarship.repository.ApplicationRepository;
import com.example.scholarship.repository.ScholarshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipService {

    @Autowired
    private ScholarshipRepository scholarshipRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    public Scholarship getScholarshipById(int scholarshipId) {
        return scholarshipRepository.findById(scholarshipId).orElse(null);
    }

    public boolean applyForScholarship(int studentId, int scholarshipId, String documentPath) {
        // Create an application object and save it
        Application application = new Application();
        application.setStudentId(studentId);
        application.setScholarshipId(scholarshipId);
        application.setDocumentPath(documentPath);
        
        // Save the application to the database
        applicationRepository.save(application);
        
        return true; // Assuming the application is successfully saved
    }
}
