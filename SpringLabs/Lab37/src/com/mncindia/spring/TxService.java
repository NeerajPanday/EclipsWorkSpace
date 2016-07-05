package com.mncindia.spring;

import org.aspectj.lang.ProceedingJoinPoint;
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
	
	
public void runTx(ProceedingJoinPoint pjp) throws Throwable
{
	System.out.println("TxService.....runTxBegin..");
	begin();
	pjp.proceed();
	commit();
	System.out.println("TxService.....runTxEnd");
}


		@Before("jlc1()")
		public void verifyUser()
		{
			System.out.println("***SS-veryfyUser");
		}
		
		
	public void begin()
	{
		System.out.println("****TS-begin");
	}
	
		
	public void commit()
	{
		System.out.println("****TS-commit");
	}
	
		@AfterThrowing("jlc1() or jlc2()")
	public void rollback()
	{
		System.out.println("***Ts-rollback");
		
	}

}
