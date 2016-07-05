package com.mncindia.spring;

public class Hello {
	
	private A aobj;
	
	
	static
	{
		System.out.println("class Hello-SB");
	}
	
	
	public Hello(A aobj)
	{
		System.out.println("Hello(A aobj)");
		this.aobj=aobj;
	}
	
	public void show()
	{
		System.out.println("show()");
		System.out.println(aobj);
		
	}

}
