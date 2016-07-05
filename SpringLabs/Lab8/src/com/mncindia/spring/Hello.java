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





	public void show()
	{
		
		System.out.println(aobj);
		System.out.println(bobj);
	}

}
