package com.neeraj.GC;

public class Test1 {

	public static void main(String[] args) {
		String s=new String("hariom");
		Test1 f=new Test1();
		f=null;
		System.gc();
		System.out.println("End of main.");
		

	}
	public void finalize(){
		System.out.println("finalise method is executed");
	}

}