package com.mncindia.spring;

public class Hello {
	private A aobj;
	private B bobj;
	
	static
	{
		System.out.println("class Hello-SB");
	}
	
	
	public Hello() {
		System.out.println("HELLO class DC");
	}

	
	public void setAobj(A aobj)
	{
		System.out.println("hello class setAobj(A aobj)");
		this.aobj=aobj;
	}
	
	
	
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}


	public void show()
	{
		System.out.println("class Hello show()");
		aobj.showA();
		bobj.showB();
	}

}
