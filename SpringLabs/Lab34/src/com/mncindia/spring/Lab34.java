package com.mncindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab34 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("pk.xml");
		System.out.println("***Using target Object***");
		CustomerService cst=(CustomerService)ctx.getBean("csTarget");
		cst.addCustomer();
		cst.updateCustomer();
		AccountService ast=(AccountService)ctx.getBean("asTarget");
		ast.mydeposit();
		ast.getBal();
		
		try{
			ast.mywithdraw();
		}catch(Exception e)
		{
			System.out.println("sorry----");
		}
		
		System.out.println("---------------------");
		
		System.out.println("*****Using ProxyObject*******");
		
		CustomerService csp=(CustomerService)ctx.getBean("csProxy");
		//csp.addCustomer();
		csp.updateCustomer();
		
	}

}
