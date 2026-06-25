package com.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TestController {
	@GetMapping("/")
	public String getHome()
	{
		return "dashboard";
	}
	@RequestMapping("/welcome")
	public String getWelcome()
	{
		return "welcome";
	}
}
