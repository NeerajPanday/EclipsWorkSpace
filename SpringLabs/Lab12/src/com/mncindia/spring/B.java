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
	
	
	



	public void setB(int b) {
		this.b = b;
	}






	public void setMsg(String msg) {
		this.msg = msg;
	}






	public void showB()
	{
		System.out.println("showB()");
		System.out.println(b);
		System.out.println(msg);
	}

}
