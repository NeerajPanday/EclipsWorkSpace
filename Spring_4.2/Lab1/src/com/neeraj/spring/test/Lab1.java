package com.neeraj.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("Spring container is ready");
		System.out.println("****************");
		Hello h = (Hello) ctx.getBean("hello");
		h.show();
	}
}
