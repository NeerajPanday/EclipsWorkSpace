package com.mncindia.spring;

import org.springframework.context.ApplicationListener;

public class MNCListener3 implements ApplicationListener<WorkshopEvent>{

	
	public void onApplicationEvent(WorkshopEvent event) {
		System.out.println("onApplicationEvent(WorkshopEvent event) raised");
		WorkshopEvent we=(WorkshopEvent)event;
		System.out.println(we.getWs());
		
	}

}
