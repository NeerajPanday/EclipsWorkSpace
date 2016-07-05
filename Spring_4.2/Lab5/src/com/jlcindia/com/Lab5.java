package com.jlcindia.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab5 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println(" Spring Containe is ready mow");
		System.out.println();
		Hello h1=(Hello)ctx.getBean("hello");
		Hello h2=(Hello)ctx.getBean("hello");
       System.out.println(h2==h1);
	}

}
