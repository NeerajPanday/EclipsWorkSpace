package com.mncindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab23 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("pk.xml");
	TestBean tb=(TestBean)ctx.getBean("testBean");
	tb.showEnglish();
	tb.showHindi();
	}
}