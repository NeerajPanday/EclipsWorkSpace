package com.jlcindia.com;

public class Lab2 {
	public static void main(String[] args) {
		Hello1 h=new Hello1();
		h.show();
	}
}
class Hello1{
	char ch;
	void show(){
		System.out.println(ch==0);
		System.out.println(ch==' ') ;
		System.out.println(ch=='\u0000');
	}
}