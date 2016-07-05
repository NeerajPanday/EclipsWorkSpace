package com.mncindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


@Configuration
public class MNCConfig {
	
	
	@Bean(name="hello")
	public Hello getHello()
	{
		System.out.println("getHello()");
		return new Hello();
	}
	
	@Bean(name="hai")
	@Lazy
	public Hai getHai()
	{
		System.out.println("getHai()");
		return new Hai();
	}

}
