package com.SpringApp.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringApp.Model.Register;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ApplicationController {
	
	@GetMapping("/")
	public String register()
	{
		return "Register";
	}
	@PostMapping("/save")
	public String savePoint(Register r, Map<String, Register> mp)
	{
		//HttpServeltRequest request -> this parameter we use in the method parameter
//		System.out.println(request.getParameter("name"));
//		System.out.println(request.getParameter("email"));
//		System.out.println(request.getParameter("contact"));
//		System.out.println(request.getParameter("password"));
		mp.put("register", r);
		return "success";
	}
}
