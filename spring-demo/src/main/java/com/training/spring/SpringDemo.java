package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		ApplicationContext javaContext = new AnnotationConfigApplicationContext(Employee.class);

		//Person p1 = (Person)context.getBean("person");
		Employee e1 = javaContext.getBean(Employee.class);
		e1.setEmpName("Pete");
		System.out.println(e1.getEmpName());

	}

}
