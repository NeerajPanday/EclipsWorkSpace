package com.mncindia.spring;

public class Hello {
	static
	{
		System.out.println("class Hello-SB");
	}
	
	private A aobj;
	private B bobj;
	
	public void setAobj(A aobj)
	{
		System.out.println("hello class setAobj(A aobj)");
		this.aobj=aobj;
	}
	
	public Hello(B bobj)
	{
		System.out.println("Hello(B bobj)");
		this.bobj=bobj;
	}
	
	public void show()
	{
		System.out.println("show()");
		aobj.showA();
		bobj.showB();
	}

}
