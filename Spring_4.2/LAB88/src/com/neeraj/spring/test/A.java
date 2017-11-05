package com.neeraj.spring.test;

public class A 
{	
	private int a;
	private String msg;
	static
	{
		System.out.println("A Static");
	}
	public A()
	{
		System.out.println("A-D.C");
	}

	

	
	
	public A(int a, String msg) {
		super();
		this.a = a;
		this.msg = msg;
	}





	public void showA()
	{
		System.out.println("A-show()");
		System.out.println(a);
		System.out.println(msg);
		}
}
