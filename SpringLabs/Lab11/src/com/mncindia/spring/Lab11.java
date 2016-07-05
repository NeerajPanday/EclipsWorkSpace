package com.mncindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab11 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("pk.xml");
		Hello h=(Hello)ctx.getBean("hello");
		h.show();
		
	}

}
