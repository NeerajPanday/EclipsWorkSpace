package com.mncindia.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {

	@Autowired
	private A aobj;
	
	@Autowired
	private B bobj;
	
	
	public void show()
	{
		System.out.println(" Hello show()");
		aobj.showA();
		bobj.showB();
	}

}
