package com.zensar.spring_emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.beans.Employee;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		Employee employee = (Employee) context.getBean("employeeOne");
		
		System.out.println("Autowiring using annotations and qualifier");
		
		System.out.println(employee);

	}
}
