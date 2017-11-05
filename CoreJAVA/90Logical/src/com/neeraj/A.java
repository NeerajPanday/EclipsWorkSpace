package com.neeraj;

public class A {

	public static void main(String[] args) {
		B b=new B();
		b.m1();
		C c=new C();
		c.m1();
		B d=new C();
		d.m1();
		
			
		

	}

}
class B{
	void m1(){
		System.out.println("B method");
	}
}
class C extends B{
	void m2(){
		System.out.println("C method");
	}
}