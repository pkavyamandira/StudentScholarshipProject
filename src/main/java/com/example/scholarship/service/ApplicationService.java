package com.example.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scholarship.model.Application;
import com.example.scholarship.repository.ApplicationRepository;

@Service
public class ApplicationService {
	@Autowired
    private ApplicationRepository applicationRepository;
	
    public void save(Application application) {
        // Add logic to save the application
    	applicationRepository.save(application);
    	
    }
}
