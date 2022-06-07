package com.ashish.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ashish/spring/springcore/dependencycheck/dependencycheckconfig.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);

	}

}
