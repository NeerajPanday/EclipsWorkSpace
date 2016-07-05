package com.mahindra;

import java.io.IOException;

public class TechMahindra {

	public static void main(String[] args) throws IOException {
		B b=new B();
      b.m1();
      String s=null;
	}

}
class A{
	public static void m1() throws Exception{
		System.out.println("Hello");
	}
}
class B extends A{
	public static void m1() throws IOException{
		System.out.println("Hai");
	}
}