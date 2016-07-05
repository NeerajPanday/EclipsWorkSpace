package com.mncindia.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Hello implements InitializingBean ,DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware{
	@Autowired
	A aobj;
	
	@Autowired
	B bobj;
	
	int x;
	String bname;
	
	
	BeanFactory fac1;
	ApplicationContext apctx;
	
	@Autowired
	BeanFactory fac2;
	@Autowired
	ApplicationContext apctx2;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Hello-init()");
	}
	
	public void myInit()
	{
		System.out.println("Hello-myInit()");
	}
public Hello()
{
	System.out.println("0 arg");
}
	public Hello(A aobj, B bobj) {
		System.out.println("Hello-2args");
		this.aobj = aobj;
		this.bobj = bobj;
	}
	@PreDestroy
	 public void cleanup()
	 {
		 System.out.println("Hello-cleanup()");
	 }
	public void myCleanup()
	 {
		 System.out.println("Hello-myCleanup()");
	 }

	public void show()
	{
		System.out.println(aobj);
		System.out.println(bobj);
		System.out.println("BeanName:"+bname);
		System.out.println("FactoryAware:"+fac1);
		System.out.println("ApplicationContext:"+apctx);
		System.out.println("FactoryAware:fac2:"+fac2);
		System.out.println("ApplicationContext:apctx2:"+apctx2);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("hello-afterPropertiesSet()");
		
	}
	public void destroy() throws Exception {
		System.out.println("Hello-destroy()");
		
	}

	
	public void setBeanName(String bname) {
		System.out.println("Hello-setBeanName(String bname)");
		this.bname=bname;
		
		
	}

	
	public void setBeanFactory(BeanFactory fac1) throws BeansException {
		System.out.println("Hello-setBeanFactory(BeanFactory fac1)");
		this.fac1=fac1;
		
	}

	
	public void setApplicationContext(ApplicationContext apctx)
			throws BeansException {
		System.out.println("Hello-setApplicationContext(ApplicationContext apctx)");
		this.apctx=apctx;
		
	}
	
	
	public String toString() {
		
		return ""+aobj+"\t"+bobj+"\t"+bname+"\t"+fac1+"\t"+apctx;
	}
	
	

}
