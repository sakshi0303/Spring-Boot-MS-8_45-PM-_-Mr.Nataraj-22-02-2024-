package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {
	
	
	@GetMapping("/")  //for home page
	public  String showHomePage() {
		return "welcome";  //LVN
	}
	
	@GetMapping("/register")  //for  form page launching
	public   String  launchFormPage(@ModelAttribute("stud")  Student st) {
		return "student_register"; // LVN
	}
	
	
	@PostMapping("/register")  //for form submission
	public  String    registerStudent(@ModelAttribute("st") Student  st,
			                                                    Map<String,Object> map) {
		  System.out.println("StudentOperationsController.registerStudent() :: model class obj data::"+st);
		  
		  //keep  model class obj  as the model obj  
		  map.put("model",st);
		
		return "show_result"; //LVN
	}
	

}
