package com.mncindia.spring;

public class AccountService {
	
	public void getBal()
	{
		System.out.println("getBal-begin");
		System.out.println("getBal-done");
		System.out.println("getBal-end");
	}
	
	public void mydeposit()
	{
		System.out.println("mydeposit-begin");
		System.out.println("mydeposit-done");
		System.out.println("mydeposit-end");
	}
	
	public void mywithdraw()throws Exception
	{
		System.out.println("mywithdraw-begin");
		if(1==1)
		{
			throw new InsuffientFundsException();
		}
		
		System.out.println("mywithdraw-end");
	}
	
	
	
	

}
