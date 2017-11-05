package com.neeraj.spring.test;

public class Hello {
	
	private A aobj;
	
	private B bobj;

	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
	public Hello(A aobj) {//using constructor
		System.out.println("1 args constrictor");
		this.aobj = aobj;
	}
	
	public void show()
	{
		System.out.println("show in hello");
		aobj.showA();
		bobj.showB();
	}
	

}
