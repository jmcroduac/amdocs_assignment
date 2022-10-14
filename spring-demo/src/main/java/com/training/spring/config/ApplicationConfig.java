package com.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.Employee;

@Configuration
public class ApplicationConfig {
	@Bean
	public Employee employee() {
		return new Employee();
	}
}
