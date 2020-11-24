package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomeController {

	@RequestMapping(value = "/login")
	public String logFun() {
		System.out.println("Welcome Login Page");
		//return "Welcome Login Page";
		
		return "index";
	}
	
	
	@RequestMapping(value = {"/home", "/"})
	public String logFunHome() {
		System.out.println("Welcome Login Page");
		//return "Welcome Login Page";
		
		return "welcome";
	}
}
