package com.mncindia.spring;

public class Hello {
	static
	{
		System.out.println("class Hello-SB");
	}
	
	private A aobj;
	private B bobj;
	
	public Hello(){
		System.out.println("Class hello DC");
	}
	
	public Hello(A aobj) {
		System.out.println("Class hello 1-args Hello(A aobj)");
		this.aobj = aobj;
	}
	public Hello(B bobj) {
		System.out.println("Class hello 1-args Hello(B bobj)");
		this.bobj = bobj;
	}

	public Hello(A aobj, B bobj) {
		System.out.println("Class hello 1-args Hello(A aobj, B bobj)");
		this.aobj = aobj;
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
