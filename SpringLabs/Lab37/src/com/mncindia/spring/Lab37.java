package com.mncindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab37 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("pk.xml");
		CustomerService cst=(CustomerService)ctx.getBean("cs");
		cst.addCustomer();
		cst.updateCustomer();
		AccountService ast=(AccountService)ctx.getBean("as");
		ast.mydeposit();
		ast.getBal();
		
		try{
			ast.mywithdraw();
		}catch(Exception e)
		{
			System.out.println("sorry----");
		}
		

		
	}

}
