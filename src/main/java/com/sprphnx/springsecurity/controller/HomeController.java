package com.sprphnx.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		return "homePage";
	}
	
	@GetMapping("/showLoginPage") 
	public String login() {
		return "login";
	}
	
	@GetMapping("/leaders") 
	public String leaders() {
		return "leader";
	}
	
	@GetMapping("/admins") 
	public String admins() {
		return "admin";
	}
}
