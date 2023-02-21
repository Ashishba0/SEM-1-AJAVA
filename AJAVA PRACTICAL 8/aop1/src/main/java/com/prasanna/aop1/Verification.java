package com.prasanna.aop1;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Verification {
	@Before("execution(public void *())")
	public void account_login() {
		System.out.println("\nApplication:Login Successful");
	}

	@After("execution(public void *())")
	public void account_logout() {
		System.out.println("Application:Logout Successful");
	}

}
