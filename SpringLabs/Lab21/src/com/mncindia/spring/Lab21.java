package com.mncindia.spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Lab21 {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("pk.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		System.out.println("Spring container is rady");
		System.out.println("---------------------------");
		Hello h=(Hello)factory.getBean("hello");
		h.show();
		System.out.println("---------------------------");
		System.out.println("Spring container is going to shutdown");
		//factory.registerShutdownHook();
		
		
	}

}
