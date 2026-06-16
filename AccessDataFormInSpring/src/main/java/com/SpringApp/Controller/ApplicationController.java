package com.SpringApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ApplicationController {
	
	@GetMapping("/")
	public String register()
	{
		return "Register";
	}
	@PostMapping("/save")
	public String savePoint(HttpServletRequest request)
	{
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("contact"));
		System.out.println(request.getParameter("password"));
		return "success";
	}
}
