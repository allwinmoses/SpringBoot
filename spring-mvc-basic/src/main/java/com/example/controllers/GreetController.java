package com.example.controllers;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Component
public class GreetController {
	
	@RequestMapping("/greet")
	public String greetUser(Model model) {
		//System.out.println("hi");
		model.addAttribute("message","Greet Day");
		return "success";
	}
	
	@RequestMapping("/hello")
	public String sayHello(ModelMap model) {
		model.addAttribute("message","Hello! Have a good day");
		return "success";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeUser() {
		ModelAndView modelAndView = new ModelAndView("success","message","Welcome to MVC");
		return modelAndView;
	}
}
