package com.SpringApp.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.SpringApp"})
@EnableWebMvc
public class Config implements WebMvcConfigurer{

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/JS/**")
                .addResourceLocations("/JS/");
    }
	@Bean
	public InternalResourceViewResolver view()
	{
		InternalResourceViewResolver rev = new InternalResourceViewResolver();
		rev.setPrefix("/WEB-INF/Views/");
		rev.setSuffix(".jsp");
		return rev;
	}
}
