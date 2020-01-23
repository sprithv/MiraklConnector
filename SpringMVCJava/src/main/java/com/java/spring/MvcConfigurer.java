package com.java.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/** This file will replace the dispatcher-servlet.xml file **/
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.java.spring")
public class MvcConfigurer implements WebMvcConfigurer {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("get internalviewResolver");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
