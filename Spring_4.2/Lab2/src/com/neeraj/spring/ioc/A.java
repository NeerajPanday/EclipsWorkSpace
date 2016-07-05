package com.neeraj.spring.ioc;

public class A 
{
 private int a;
 private String msg;
 public A(){
	 System.out.println("A-DEfalut Constructor");
 }
 public void setA(int a)
 {
	 System.out.println("A-setA()");
	 this.a=a;
 }
 public void setMsg(String msg){
	 System.out.println("A-set msg()");
	 this.msg=msg;
 }
 public void show()
 {
	 System.out.println("A-show()");
	 System.out.println(a);
	 System.out.println(msg);
 }
}
