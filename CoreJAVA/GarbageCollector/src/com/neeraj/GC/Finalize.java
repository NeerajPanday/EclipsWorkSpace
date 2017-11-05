package com.neeraj.GC;

public class Finalize {

	public static void main(String[] args) {
		String s=new String("neeraj");
		Finalize f=new Finalize();
		s=null;
		System.gc();
		System.out.println("End of main.");
		

	}
	public void finalize(){
		System.out.println("finalise method is executed");
	}

}
