package com.mncindia.spring;

public class Hello {
	static
	{
		System.out.println("class Hello-SB");
	}
	
	private A aobj;
	private B bobj;
	
	
	


	public Hello(A aobj) {
		
		this.aobj = aobj;
	}


	public Hello(B bobj) {
		
		this.bobj = bobj;
	}


	public void show()
	{
		
		System.out.println(aobj);
		System.out.println(bobj);
	}

}
