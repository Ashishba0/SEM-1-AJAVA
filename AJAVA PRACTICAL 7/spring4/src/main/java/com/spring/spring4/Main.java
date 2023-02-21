package com.spring.spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spring4/config.xml");
		Calculator calculator = context.getBean("calculator", Calculator.class);
		int sum = calculator.add(2, 3);
		System.out.println("Sum: " + sum);
	}
}
