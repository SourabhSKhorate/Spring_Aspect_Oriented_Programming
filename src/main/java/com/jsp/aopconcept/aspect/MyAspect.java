package com.jsp.aopconcept.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.jsp.aopconcept.services.LoginImplementation.login())")
	public void beforeLoginAlgox() {
		System.out.println("Login is being validated by algo x...");
	}
	@After("execution(* com.jsp.aopconcept.services.LoginImplementation.login())")
	public void afterLoginAlgox() {
		System.out.println("Login is being validated by algo x...");
	}

}
