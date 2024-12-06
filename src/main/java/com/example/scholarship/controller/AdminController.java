package com.example.scholarship.controller;



import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.example.scholarship.model.Admin;
import com.example.scholarship.model.Scholarship;
import com.example.scholarship.model.Student;
import com.example.scholarship.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AdminController 
{
	@Autowired
	private AdminService adminService;
	
	@GetMapping("adminlogin")
	public ModelAndView adminlogin()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminlogin");
		return mv;
	}
	
	@GetMapping("adminhome")
	public ModelAndView adminhome()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		
		long count = adminService.Studentcount();
		mv.addObject("count", count);
		
		return mv;
	}

	@PostMapping("checkadminlogin")
	public ModelAndView checkadminlogin(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String auname=request.getParameter("auname");
		String apwd= request.getParameter("apwd");
		
		Admin admin = adminService.checkAdminLogin(auname, apwd);
		if(admin!=null)
		{
			mv.setViewName("adminhome");
			
			long count = adminService.Studentcount();
			mv.addObject("count", count);
		}
		else
		{
			mv.setViewName("adminloginfail");
			mv.addObject("message", "Login Failed");
			
		}
		return mv;
	}
		@GetMapping("viewallstudents")
		public ModelAndView viewallstudents()
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("viewallstudents");
			
			long count = adminService.Studentcount();
			mv.addObject("count", count);
			
			List<Student> students = adminService.viewAllStudents();
			mv.addObject("studentlist", students);
			return mv;
		}
		
		@GetMapping("deletestudent")
		public ModelAndView deletestudent()
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("deletestudent");
			
			long count = adminService.Studentcount();
			mv.addObject("count", count);
			
			List<Student> students = adminService.viewAllStudents();
			mv.addObject("studentlist", students);
			return mv;
		}
		
		@GetMapping("delete")
		public String delete(@RequestParam int id)
		{
			adminService.deleteStudent(id);
			return "redirect:/deletestudent";
			
		}
		
		@GetMapping("viewstudentbyid")
		public ModelAndView viewstudentbyid()
		{
			ModelAndView mv = new ModelAndView();
			List<Student> students = adminService.viewAllStudents();
			mv.addObject("studentlist", students);
		
			mv.setViewName("viewstudentbyid");
			return mv;
		}
		
		@PostMapping("displaystudent")
		public ModelAndView displaystudent(HttpServletRequest request)
		{
			int id = Integer.parseInt(request.getParameter("id"));
			Student student= adminService.displStudentById(id);
			ModelAndView mv = new ModelAndView("displaystudent");
			mv.addObject("s",student);
			return mv;
		}
		//changes
		
		@GetMapping("addscholarship")
		public String addscholarship()
		{
			return "addscholarship";
		}
		
		@PostMapping("insertscholarship")
		public ModelAndView insertScholarship(HttpServletRequest request) throws SQLException {
		    // Getting form fields from the request
		    String name = request.getParameter("sname");
		    String description = request.getParameter("sdescription");
		    String eligibilityCriteria = request.getParameter("selEligibility");
		    String applicationLink = request.getParameter("slink");
		    String deadline = request.getParameter("sdeadline");
		    String durationOfScholarship = request.getParameter("sduration");
		    String requiredDocuments = request.getParameter("sdocuments");

		    // Handle empty durationOfScholarship field
		    if (durationOfScholarship == null || durationOfScholarship.trim().isEmpty()) {
		        durationOfScholarship = "Default Duration"; // Use default value if empty
		    }

		    // Creating Scholarship object and setting properties
		    Scholarship scholarship = new Scholarship();
		    scholarship.setName(name);
		    scholarship.setDescription(description);
		    scholarship.setEligibilityCriteria(eligibilityCriteria);
		    scholarship.setApplicationLink(applicationLink);
		    scholarship.setDeadline(deadline);
		    scholarship.setDurationOfScholarship(durationOfScholarship);  // Ensure this field is populated
		    scholarship.setRequiredDocuments(requiredDocuments);

		    // Adding scholarship to the database
		    String message = adminService.addScholarship(scholarship);

		    // Creating ModelAndView object for rendering the success view
		    ModelAndView mv = new ModelAndView();
		    mv.setViewName("scholarshipsuccess");
		    mv.addObject("message", message); // Passing the success message to the view
		    return mv;
		}



		@GetMapping("viewallscholarships")
		public ModelAndView viewallscholarships() {
		    ModelAndView mv = new ModelAndView();
		    mv.setViewName("viewallscholarships");

		    List<Scholarship> scholarships = adminService.viewAllScholarships();
		    System.out.println("Scholarships retrieved: " + scholarships); // Debug log
		    mv.addObject("scholarships", scholarships);
		    return mv;
		}

		
		

}
