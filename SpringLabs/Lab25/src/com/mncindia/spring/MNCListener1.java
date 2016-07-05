package com.mncindia.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MNCListener1 implements ApplicationListener{

	
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof BatchEvent)
		{
			BatchEvent batchEvent=(BatchEvent)event;
			Batch bat=batchEvent.getBatch();
			System.out.println(bat);
		}
		 
		if(event instanceof WorkshopEvent)
		{
			WorkshopEvent workEvent=(WorkshopEvent)event;
			Workshop bat=workEvent.getWs();
			System.out.println(bat);
		}
		else{
			System.out.println(event);
		}
		
	}
	
	

}
