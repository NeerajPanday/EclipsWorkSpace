package com.mncindia.spring;

public class A {
	static
	{
		System.out.println("A-SB");
	}
	private int a;
	private String msg;
	


	public void A()
	{
		System.out.println("class A -D.C");
	}
	
	public void setA(int a) {
		System.out.println("setA(int a)");
		this.a = a;
	}
	public void setMsg(String msg) {
		System.out.println("setMsg(int msg)");
		this.msg = msg;
	}
	

	public int getA() {
		return a;
	}

	public String getMsg() {
		return msg;
	}

	public void showA()
	{
		System.out.println("class A showA()");
		System.out.println(a);
		System.out.println(msg);
	}

}
