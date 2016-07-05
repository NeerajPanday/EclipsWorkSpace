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

public class Hello implements InitializingBean ,DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware
{
	
	int x;
	String str;
	String msg;
	String bname;
	
	@Autowired
	A aobj;
	
	B bobj;

	
	@PostConstruct
	public void init2()
	{
		System.out.println("Hello-init2()");
		msg="Welcome to MNC";
		if(str==null)
		{
			str="hai Guys";
		}
	}
	
	public void afterPropertiesSet()throws Exception
	{
		System.out.println("Hello-afterPpropertiesSet()");
		msg="Welcome to MNC";
		if(str==null)
		{
			str="hai Guys";
		}
	}
	
	ApplicationContext ctx1;
	BeanFactory factory1;
	
	
	@Autowired
	ApplicationContext ctx2;
	@Autowired
	BeanFactory factory2;
	
	static{
		System.out.println("Hello-SB");
	}
	public Hello(int x)
	{
		System.out.println("Hello-init(x)");
		this.x=x;
	}
	
	public void setStr(String str)
	{
		System.out.println("Hello-str");
		System.out.println(aobj);
		System.out.println(bobj);
	}
	
	public void setBobj(B bobj)
	{
		System.out.println("Hello-B-bobj");
		this.bobj=bobj;
		
	}
	
	public void init1()
	{
		System.out.println("Hello-init1()");
		msg="Welcome to MNC";
	if(str==null)
	{
		str="Hai Guys";
	}
	}
	
	public void myInit()
	{
		System.out.println("hello-muInit()");
		msg="Wrlcome to MNC";
		if(str==null)
		{
			str="Hai guys";
		}
	}
	
	public void setBeanName(String bname)
	{
		System.out.println("Hello-SetBeanName()");
		this.bname=bname;
	}
	
	public void setBeanFacory(BeanFactory factory1)
	{
		System.out.println("Hello-setBeanFacory()");
		this.factory1=factory1;
	}
	
	public void setApplicationContext(ApplicationContext ctx1)
	throws BeansException {
             System.out.println("Hello-setApplicationContext()");
             this.ctx1=ctx1;

}
	@PreDestroy
	public void cleanup()
	{
		System.out.println("Hello-cleanup");
	}
	
	public void destory()throws Exception
	{
		System.out.println("Hello-destory()");
		
	}
		
	public void myCleanup()
	{
		System.out.println("Hello-mycleanup()");
	}
	
	public void show()
	{
		System.out.println("hello-show()");
		System.out.println(x);
		System.out.println(str);
		System.out.println(msg);
		System.out.println("Bean Name is:"+bname);
		System.out.println(factory1);
		System.out.println(ctx1);
		System.out.println(factory2);
		System.out.println(ctx2);
		System.out.println(ctx1==ctx2);
		System.out.println(factory1==factory2);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
