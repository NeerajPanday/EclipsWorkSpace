package com.mncindia.spring;

import javax.annotation.Resource;



public class Hello {

	@Resource
	private A aobj;
	
	@Resource(name="bo1")
	private B bobj;
	
	
	public void show()
	{
		System.out.println(" Hello show()");
		aobj.showA();
		bobj.showB();
	}

}
