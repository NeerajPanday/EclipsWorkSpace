package com.mncindia.spring;

import org.aspectj.lang.annotation.*;

@Aspect
public class TxService {
	
	
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
	public void begin()
	{
		System.out.println("****TS-begin");
	}
	
		@AfterReturning("jlc1()")
	public void commit()
	{
		System.out.println("****TS-commit");
	}
	
		@AfterThrowing("jlc1()")
	public void rollback()
	{
		System.out.println("***Ts-rollback");
		
	}

}
