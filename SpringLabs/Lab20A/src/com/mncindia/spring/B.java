package com.mncindia.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class B implements InitializingBean,DisposableBean{
	private int b;
	private String msg;
	
	static 
	{
		System.out.println("B-S.B");
	}
	
	public B()
	{
		System.out.println("B-()");
	}

	@PreDestroy
	 public void cleanup()
	 {
		 System.out.println("B-cleanup()");
	 }
	public void myCleanup()
	 {
		 System.out.println("B-myCleanup()");
	 }

	public B(int b, String msg) {
	
		this.b = b;
		this.msg = msg;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("B-init()");
	}
	
	public void myInit()
	{
		System.out.println("B-myInit()");
	}
	
	public String toString() {
		
		return ""+b+"\t"+msg;
	}

	
	public void afterPropertiesSet() throws Exception {
		System.out.println("B-afterPropertiesSet()");
		
	}
	public void destroy() throws Exception {
		System.out.println("B-destroy()");
		
	}

	
}
