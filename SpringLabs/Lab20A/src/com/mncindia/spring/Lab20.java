package com.mncindia.spring;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab20 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("pk.xml");
		System.out.println("Spring container is rady");
		System.out.println("---------------------------");
		Hello h=(Hello)ctx.getBean("hello");
		h.show();
		System.out.println("---------------------------");
		System.out.println("Spring container is going to shutdown");
		ctx.registerShutdownHook();
		
		
	}

}
