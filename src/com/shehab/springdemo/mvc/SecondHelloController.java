package com.shehab.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("second_hello")
public class SecondHelloController {
	

	
	// need a controller method to show the initial form
		@RequestMapping("/showForm")
		public String showForm() {
			return "helloworld-form";
		}
		// need a controller method to process the htm form
		@RequestMapping("/processForm")
		public String processForm() {
			return "helloworld";
		}
		
		// new a controller method read form data 
		// add data to the model
		
		@RequestMapping("/processFormVersionTwo")
		public String letsShoutDude(HttpServletRequest request , Model model) {
			//read the request parameter from the html form
			String theName = request.getParameter("studentName");
			// convert thedata to all caps
			theName = theName.toUpperCase();
			//create the message
			String result ="Yo! "+ theName;
			// add message to the model
			model.addAttribute("message" , result); 
			return "helloworld";
		}
		
		
		
		@RequestMapping("/processFormVersionThree")
		public String processFormVersionThree(@RequestParam("studentName")String theName, Model model) {
			
			// convert thedata to all caps
			theName = theName.toUpperCase();
			//create the message
			String result ="hay dude ! "+ theName;
			// add message to the model
			model.addAttribute("message" , result); 
			return "helloworld";
		}

}
