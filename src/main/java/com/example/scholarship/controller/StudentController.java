package com.example.scholarship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.scholarship.model.Student;
import com.example.scholarship.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/home")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	@GetMapping("studentreg")
	public ModelAndView studentreg()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentreg");
		return mv;
	}
	@GetMapping("studenthome")
	public ModelAndView studenthome()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studenthome");
		return mv;
	}
	@GetMapping("studentprofile")
	public ModelAndView studentprofile()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentprofile");
		return mv;
	}
	
	@PostMapping("insertstudent")
	public ModelAndView insertstudent(HttpServletRequest request)
	{
		String name=request.getParameter("sname");
		String gender=request.getParameter("sgender");
		String dob=request.getParameter("sdob");
		String email=request.getParameter("semail");
		String location=request.getParameter("slocation");
		String contact=request.getParameter("scontact");
		String password=request.getParameter("spwd");
		
		
		
		Student student = new Student();
		student.setName(name);
		student.setGender(gender);
		student.setDateofbirth(dob);
		student.setEmail(email);
		student.setLocation(location);
		student.setContact(contact);
		student.setPassword(password);
		
		String message = studentService.studentRegistration(student);
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("regsuccess");
	    mv.addObject("message", message);
	    return mv;
	}
	@GetMapping("studentlogin")
	public ModelAndView studentlogin()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentlogin");
		return mv;
	}
	
	@PostMapping("checkstudentlogin")
	public ModelAndView checkadminlogin(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String semail=request.getParameter("semail");
		String spwd= request.getParameter("spwd");
		Student student = studentService.checkStudentLogin(semail, spwd);
		if(student!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("student", student);
			
			mv.setViewName("studenthome");
		}
		else
		{
			mv.setViewName("studentlogin");
			mv.addObject("message", "Login Failed");
			
		}
		return mv;
	}
		
		@GetMapping("updateprofile")
		public ModelAndView updateprofile()
		{
			ModelAndView mv = new ModelAndView("updateprofile");
			return mv;
		}
		@PostMapping("update")
		public ModelAndView update(HttpServletRequest request)
		{
			ModelAndView mv = new ModelAndView("updateprofile");
			
			int id = Integer.parseInt(request.getParameter("sid"));
			String name=request.getParameter("sname");
			String gender=request.getParameter("sgender");
			String dob=request.getParameter("sdob");
			String location=request.getParameter("slocation");
			String contact=request.getParameter("scontact");
			String password=request.getParameter("spwd");
			
			Student student = new Student();
			student.setId(id);
			student.setName(name);
			student.setGender(gender);
			student.setDateofbirth(dob);
			student.setLocation(location);
			student.setContact(contact);
			student.setPassword(password);
			
			studentService.updateStudent(student);
			//create new session variable
			mv.setViewName("studentlogin");
			
			return mv;
		}
		
		
	@GetMapping("studentlogout")
	public ModelAndView studentlogout()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentlogin");
		return mv;
	}
	
}
