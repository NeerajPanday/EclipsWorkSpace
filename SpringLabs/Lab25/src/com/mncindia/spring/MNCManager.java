package com.mncindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MNCManager implements ApplicationContextAware{
	ApplicationContext ctx=null;
	public void addBatch(Batch bat)
	{
		ctx.publishEvent(new BatchEvent(this,bat));
	}
	

	public void setApplicationContext(ApplicationContext ctx)
	{
		this.ctx=ctx;
	}


	public void addWorkshop(Workshop ws) {
		ctx.publishEvent(new WorkshopEvent(this, ws));
		
	}

}
