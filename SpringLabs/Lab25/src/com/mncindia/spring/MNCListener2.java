package com.mncindia.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MNCListener2  implements ApplicationListener<BatchEvent>{

	
	public void onApplicationEvent(BatchEvent event) {
		System.out.println("MNCLIstener2-onApplicationEvent");
		System.out.println("BatchEvent is raised");
	 BatchEvent be=(BatchEvent)event;
	 System.out.println(be.getBatch());
		
		
		
		
	}

	
	

}
