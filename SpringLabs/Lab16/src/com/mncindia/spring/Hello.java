package com.mncindia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {

	
	private A aobj;
	
	
	private B bobj;
	
	@Autowired
	public Hello(@Qualifier("ao")A aobj,@Qualifier("bo1") B bobj) {
		
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
