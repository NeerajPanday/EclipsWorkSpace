package com.mncindia.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean,DisposableBean{
	private int a;
	private String msg;
	static{
		System.out.println("A-S.B");
	}
	
	public A()
	{
		System.out.println("A-()");
	}
	
	public void setMsg(String msg)
	{
		this.msg=msg;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("A-init()");
	}
	
	public void myInit()
	{
		System.out.println("A-myInit()");
	}
	
	
 public void setA(int a) {
		this.a = a;
	}
 
 @PreDestroy
 public void cleanup()
 {
	 System.out.println("A-cleanup()");
 }
 
 public void myCleanup()
 {
	 System.out.println("A-myCleanup()");
 }

public String toString(){
	 return ""+a+"\t"+msg;
	 
 }


public void afterPropertiesSet() throws Exception {
	System.out.println("A-afterPropertiesSet()");
	
}


public void destroy() throws Exception {
	System.out.println("A-destroy()");
	
}
}
