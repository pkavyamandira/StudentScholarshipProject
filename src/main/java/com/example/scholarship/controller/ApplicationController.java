package com.example.scholarship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.scholarship.model.Application;
import com.example.scholarship.service.AdminService;
import com.example.scholarship.service.ApplicationService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ApplicationController{
	private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    // Mapping for submitApplication
    @PostMapping("/submitApplication")
    @ResponseBody// Optional: Return response directly as plain text or JSON
    public String submitApplication(@RequestBody Application application) {
        applicationService.save(application);
        return "Application submitted successfully!";
    }
}
    




