package com.mncindia.spring;

import org.aspectj.lang.annotation.*;

@Aspect
public class LogService {
	
	@Pointcut(value="execution(* com.mncindia.spring.CustomerService.update*(..))")
	public void jlc2()
		{
			
		}
	@Pointcut(value="execution(* com.mncindia.spring.AccountService.my*(..))")
	public void jlc1()
		{
			
		}


		@Before("jlc1()")
		public void verifyUser()
		{
			System.out.println("***SS-veryfyUser");
		}
		
	@Before("jlc1() or jlc2()")
	public void logBefore()
	{
		System.out.println("****LS-logBefore");
	}
	
	@AfterReturning("jlc1()" )
	public void logReturning()
	{
		System.out.println("***Ls-logReturning");
	}
	
	@AfterThrowing("jlc1()")
	public void logThrowing(Exception e)
	{
		System.out.println("****LS-logThrowing");
		System.out.println(e);
	}
	
	@After("jlc1()")
	public void logOk()
	{
		System.out.println("LS...OK");
	}

}
