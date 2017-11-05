package com.jlcindia.com;

public class Lab396 {

	public static void main(String[] args) {
		int a=99;
		Hello h=new Hello();
		System.out.println("main begin"+a);
		h.m1(a);
		System.out.println("main ends"+a);
  
	}

}
class Hello{
	void m1(int a){
		System.out.println("m1 begin:"+a);
		a=a+10;
		System.out.println("m1 ends"+a);
	}
}