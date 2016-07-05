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
	
	
	
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}



	public void show()
	{
		System.out.println("show()");
		aobj.showA();
		bobj.showB();
		System.out.println(aobj);
		System.out.println(bobj);
	}

}
