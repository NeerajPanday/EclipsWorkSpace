package com.mncindia;

public class Sample extends Example{
	int x=50;
	int y=70;
	public Sample() {
		System.out.println("Sample non args");
	}
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		System.out.println(s.x);
		System.out.println(s.y);
	}

}
