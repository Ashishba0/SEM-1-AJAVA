package com.spring.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spring1/File.xml");
		helloworld h = (helloworld) context.getBean("Hellobean");
		h.displayInfo();
	}
}
