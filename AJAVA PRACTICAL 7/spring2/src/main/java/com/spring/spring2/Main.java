package com.spring.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spring2/applicationContext.xml");
			
		Shape s = (Shape) context.getBean("shapeid");
		s.displayInfo();
	}
}
