package com.shehab.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//create new student object
		Student theStudent = new Student();
		//add student object to the model
	model.addAttribute("student", theStudent);
	
	// add the country options to the model from properties file
    model.addAttribute("modelCountryOptions", countryOptions); 
		return "student-form";
	} 
	
	@RequestMapping("/processForm")
	public String processFrom(@ModelAttribute("student")Student theStudent) {
		// log the input
		System.out.println("the Student : theStudent :"+ theStudent.getFirstName() +" the Student: getLastName : "+ theStudent.getLastName() );
		return "student-confirmation";
	}
}
