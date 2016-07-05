package com.mncindia.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {
	
	
	@Pointcut(value="execution(* com.mncindia.spring.AccountService.my*(..))")
public void jlc1()
	{
		
	}

	

	@Pointcut(value="execution(* com.mncindia.spring.CustomerService.update*(..))")
public void jlc2()
	{
		
	}

	@Before("jlc1()")
	public void verifyUser()
	{
		System.out.println("***SS-veryfyUser");
	}

}
