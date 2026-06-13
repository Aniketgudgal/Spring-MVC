package com.spring.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.spring"})
@EnableWebMvc
public class Config {
	
	@Bean
	public InternalResourceViewResolver view()
	{
		InternalResourceViewResolver ist = new InternalResourceViewResolver();
		ist.setPrefix("/WEB-INF/views/");
		ist.setSuffix(".jsp");
		return ist;
	}
}
