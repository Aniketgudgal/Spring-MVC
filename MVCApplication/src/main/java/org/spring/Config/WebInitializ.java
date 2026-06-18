package org.spring.Config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebInitializ implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(Config.class);
		DispatcherServlet dp = new DispatcherServlet(context);
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", dp);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
