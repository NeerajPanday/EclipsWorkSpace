package com.jlcindia.spring;

import javax.naming.InsufficientResourcesException;

public class AccountService
{
public void getBal(){
	System.out.println("getBal-begin");
	System.out.println("getBal-done");
	System.out.println("getBal-End");
}
public void mydeposite(){
	System.out.println("deposit-begin");
	System.out.println("deposit-done");
	System.out.println("deposit-end");
}
public void mywithdraw() throws Exception
{
	System.out.println("withdraw begin");
	if(1==1){
		throw new InsufficientResourcesException();
	}
	System.out.println("withdraw-End");
}
}
