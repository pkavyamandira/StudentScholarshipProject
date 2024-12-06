package com.example.scholarship.controller;

import com.example.scholarship.model.Application;
import com.example.scholarship.model.Scholarship;
import com.example.scholarship.model.Student;
import com.example.scholarship.repository.ApplicationRepository;
import com.example.scholarship.service.AdminService;
import com.example.scholarship.service.ApplicationService;
import com.example.scholarship.service.ScholarshipService;
import com.example.scholarship.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ScholarshipController {

    @Autowired
    private ScholarshipService scholarshipService;
    
    @Autowired
    private ApplicationService applicationService;
    // Show Apply Scholarship form
    @GetMapping("/applyscholarship")
    public String showApplyScholarshipForm(@RequestParam("scholarshipId") int scholarshipId, Model model) {
        Scholarship scholarship = scholarshipService.getScholarshipById(scholarshipId);
        model.addAttribute("scholarship", scholarship);
        return "applyscholarship";
    }

    @PostMapping("/application/submitApplication")
    public String handleFormSubmission(@RequestParam("name") String name, @RequestParam("email") String email) {
        // Create and set values for Application object
        Application application = new Application();
        application.setName(name);
        application.setEmail(email);
        
        // Use the injected applicationService to save the application
        applicationService.save(application);

        // Return a view (or success message if returning a string for debugging purposes)
        return "redirect:/success"; // Redirect to a success page or confirmation page
    }

}

