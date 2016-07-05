package com.mncindia.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab15 {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("pk.xml");
		ctx.start();
		MNCManager mnc=(MNCManager)ctx.getBean("mnc");
		Batch b=new Batch("B-24","28-march-2016","6.30-8.30PM",150);
		mnc.addBatch(b);
		
		Workshop ws=new Workshop("web services",5000,99);
		mnc.addWorkshop(ws);
		ctx.stop();
		ctx.close();
		
	}

}
