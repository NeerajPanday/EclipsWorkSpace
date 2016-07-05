package com.mncindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab29 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.mncindia.spring");
	    System.out.println("Noe Spring Container is Ready");
	    Hello hello1=(Hello)ctx.getBean(Hello.class);
	    hello1.show();
	    
	    
	    
	    Hai hai1=(Hai)ctx.getBean(Hai.class);
	    hai1.show();
	    Hai hai2=(Hai)ctx.getBean(Hai.class);
	    hai2.show();
	    
	    System.out.println(hai1==hai2);
	    
	    
	    
	}

}
