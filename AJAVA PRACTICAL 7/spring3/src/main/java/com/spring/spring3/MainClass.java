package com.spring.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spring3/Config.xml");
		Engine e = (Engine) context.getBean("obj");
		e.displayInfo();
	}
}
