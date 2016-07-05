package com.mncindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("pk.xml");
		Customer cust=(Customer)ctx.getBean("cust");
		cust.show();
	}

}
