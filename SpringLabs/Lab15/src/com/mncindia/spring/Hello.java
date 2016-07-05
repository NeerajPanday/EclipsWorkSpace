package com.mncindia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {

	@Autowired
	@Qualifier("ao")
	private A aobj;
	
	@Autowired
	@Qualifier("bo1")
	private B bobj;
	
	
	public void show()
	{
		System.out.println(" Hello show()");
		aobj.showA();
		bobj.showB();
	}

}
