package com.neeraj;

public class Np {
	public void m1(){
		System.out.println("Hello");
	}
	public void m2(){
		m1();
		System.out.println("Hai");
	}

	public static void main(String[] args) {
	Np n=new Np();
	n.m2();

	}

}
