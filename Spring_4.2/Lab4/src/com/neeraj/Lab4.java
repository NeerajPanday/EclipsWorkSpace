package com.neeraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Lab4 {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JLCConfig.class);
		Hello h1=(Hello)ctx.getBean("hello");
		Hello h2=(Hello)ctx.getBean("hello");
		System.out.println(h1==h2);
	}

	

}
