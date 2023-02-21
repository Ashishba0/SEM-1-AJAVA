package com.prasanna.aop1;

import org.springframework.stereotype.Component;

@Component
public class Deposit {
	public void payment() {
		System.out.println("Payment: Payment Successful");
	}
}
