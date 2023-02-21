package com.prasanna.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		My_info my = new My_info();
		my.print();
		Deposit d = context.getBean("deposit", Deposit.class);
		d.payment();
		Withdraw w = context.getBean("withdraw", Withdraw.class);
		w.drawout();
		Beneficiary b = context.getBean("beneficiary", Beneficiary.class);
		b.add_beneficiary();
	}
}
