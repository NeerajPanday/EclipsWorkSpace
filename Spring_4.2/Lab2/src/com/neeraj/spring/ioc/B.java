package com.neeraj.spring.ioc;

public class B 
{
 private int b;
 private String str;
 public B(int b,String str)
 {
	 System.out.println("B-2 args");
	 this.b=b;
	 this.str=str;
 }
 public void show(){
	 System.out.println("A-Show()");
	 System.out.println(b);
	 System.out.println(str);
 }
}
