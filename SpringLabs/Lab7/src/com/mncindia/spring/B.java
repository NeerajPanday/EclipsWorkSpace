package com.mncindia.spring;

public class B {
	
	static{
		System.out.println("class B-SB");
	}
	private int b;
	private String msg;
	
	public B()
	{
		System.out.println("class B-DC");
	}
	
	
	public B(int b, String msg) {
		System.out.println("class B-args");
		this.b = b;
		this.msg = msg;
	}



	public void showB()
	{
		System.out.println("showB()");
		System.out.println(b);
		System.out.println(msg);
	}

}
