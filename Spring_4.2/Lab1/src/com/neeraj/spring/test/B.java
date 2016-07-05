package com.neeraj.spring.test;

public class B {
	
	private int b;// Constructor injection
	private String str;//Constructor injection
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public void showB()
	{
		System.out.println("B-showB()");
		System.out.println(b);
		System.out.println(str);
	}

}
