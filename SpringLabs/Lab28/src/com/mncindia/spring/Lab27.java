package com.mncindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab27 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MNCConfig.class);
	    System.out.println("Noe Spring Container is Ready");
	    Hello hello1=(Hello)ctx.getBean(Hello.class);
	    hello1.show();
	    
	    Hello hello2=(Hello)ctx.getBean(Hello.class);
	    hello2.show();
	    System.out.println(hello1==hello2);
	    
	    Hai hai1=(Hai)ctx.getBean(Hai.class);
	    hai1.show();
	    Hai hai2=(Hai)ctx.getBean(Hai.class);
	    hai2.show();
	    
	    System.out.println(hai1==hai2);
	    
	    
	    
	}

}
