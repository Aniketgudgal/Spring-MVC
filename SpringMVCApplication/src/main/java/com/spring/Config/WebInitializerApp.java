package com.spring.Config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebInitializerApp implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(Config.class);
		
		DispatcherServlet ds = new DispatcherServlet(context);
		ServletRegistration.Dynamic reg = servletContext.addServlet("dispatcher", ds);
		reg.setLoadOnStartup(1);
		reg.addMapping("/");
	}

}
