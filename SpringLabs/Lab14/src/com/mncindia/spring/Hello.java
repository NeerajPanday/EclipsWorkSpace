package com.mncindia.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {

	
	private A aobj;
	
	
	private B bobj;
	
	@Autowired
	public Hello(A aobj, B bobj) {
		
		this.aobj = aobj;
		this.bobj = bobj;
	}


	public void show()
	{
		System.out.println(" Hello show()");
		aobj.showA();
		bobj.showB();
	}

}
