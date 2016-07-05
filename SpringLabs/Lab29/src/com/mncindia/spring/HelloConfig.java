package com.mncindia.spring;

import org.springframework.context.annotation.*;

@Configuration
public class HelloConfig {
	
	@Bean(name="hello")
	public Hello getHello()
	{
		System.out.println("getHello()");
		return  new Hello();
	}

}
